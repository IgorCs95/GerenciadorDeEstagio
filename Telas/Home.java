import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import JDialog.GerenciarAlunos;
import JDialog.GerenciarInstituicoes;
import JDialog.GerenciarVisitas;
import JDialog.dialogCadastrar.DialogCadastrarOrientador;
import JDialog.dialogCadastrar.DialogCadastrarEstegio;
import Tabelas.TableModelAluno;
import Tabelas.TableModelEstagio;

import com.jgoodies.forms.layout.FormSpecs;
import net.miginfocom.swing.MigLayout;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.Color;

public class Home extends JFrame {

	private JPanel contentPane;

	private JMenuBar menuBar;
	private JMenu mnGerenciar;
	private JMenuItem mntmAlunos;
	private JMenuItem mntmInstituicoes;
	private JMenu mnOutros;
	private JMenuItem mntmSobre;
	private JPanel panel;
	private JPanel panel_2;

	private JTabbedPane tabbedPane;
	private JPanel pnArea;

	private JButton btnRemoverEstagio;
	private JButton btnEstagio;
	private JMenuItem mntmNovoOrientador;
	private JMenuItem mntmCurso;
	
	private JTable JTEstagio;
	private TableModelEstagio modelTabela;
	private JScrollPane scrolAluno = new JScrollPane();
	private JButton btnVerVisitas;

	// /**
	// * Launch the application.
	// */
	// public static void main(String[] args) {
	// EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// try {
	// Home frame = new Home();
	// frame.setVisible(true);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }
	// });
	// }

	public void init() {
		menuBar = new JMenuBar();
		mnGerenciar = new JMenu("Gerenciar");
		mntmAlunos = new JMenuItem("Alunos");
		mntmInstituicoes = new JMenuItem("Instituicoes");
		mnOutros = new JMenu("Outros");
		mntmSobre = new JMenuItem("Sobre");
		panel = new JPanel();
		panel_2 = new JPanel();
		panel_2.setBackground(Color.GRAY);
		btnVerVisitas = new JButton("Ver Visitas");

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);

		pnArea = new JPanel();

		btnRemoverEstagio = new JButton("Remover");
		btnEstagio = new JButton("Novo Estagio");
		mntmNovoOrientador = new JMenuItem("Orientador");
		mntmCurso = new JMenuItem("Curso");

	}

	/**
	 * Create the frame.
	 */
	public Home() {
		init();
		ouvintes();

		setVisible(true);
		setTitle("Gerenciador de estagios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 748, 560);

		setJMenuBar(menuBar);

		menuBar.add(mnGerenciar);
		mnGerenciar.add(mntmAlunos);
		mnGerenciar.add(mntmInstituicoes);
		mnGerenciar.add(mntmNovoOrientador);
		mnGerenciar.add(mntmCurso);
		menuBar.add(mnOutros);

		mnOutros.add(mntmSobre);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		JTEstagio = new JTable();
		JTEstagio.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JTEstagio.setModel(modelTabela = new TableModelEstagio(new ArrayList<>()));
		scrolAluno.setViewportView(JTEstagio);
		
		JTEstagio.getTableHeader().setReorderingAllowed(false);
		panel.setLayout(new BorderLayout());
		panel.add(scrolAluno,BorderLayout.CENTER);

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE).addComponent(
										panel, GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE))
						.addGap(0)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)));
//		panel.setLayout(new BorderLayout(0, 0));

//		panel.add(tabbedPane);

		tabbedPane.addTab("Estagios", null, pnArea, null);
		pnArea.setLayout(new BorderLayout(0, 0));

		btnEstagio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(btnEstagio, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnRemoverEstagio, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 399, Short.MAX_VALUE)
					.addComponent(btnVerVisitas, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnEstagio, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
						.addComponent(btnRemoverEstagio, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
						.addComponent(btnVerVisitas, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
					.addGap(18))
		);
		panel_2.setLayout(gl_panel_2);
		contentPane.setLayout(gl_contentPane);
//		setFocusTraversalPolicy(new FocusTraversalOnArray(
//				new Component[] { contentPane, panel_2, btnEstagio, btnRemoverEstagio, panel, tabbedPane, pnArea }));
		
		setLocationRelativeTo(null);
	}

	public void ouvintes() {
		mntmAlunos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				GerenciarAlunos.getInstance();

			}
		});

		mntmInstituicoes.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				GerenciarInstituicoes.getInstance();

			}
		});
		
		btnEstagio.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new DialogCadastrarEstegio();
				
			}
		});
		mntmCurso.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String curso = (String) JOptionPane.showInputDialog(null, "Digite o nome do Curso");
				int idCurso = (int) (Math.random()*100);
				JOptionPane.showConfirmDialog(null, "Tem certesa que deseja cadastrar o "+idCurso+"- curso "+curso);
				
			}
		});
		
		mntmNovoOrientador.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				new DialogCadastrarOrientador();
				
			}
		});
		
		btnVerVisitas.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				GerenciarVisitas.getInstace();
				
			}
		});
		
		
		

	}

}
