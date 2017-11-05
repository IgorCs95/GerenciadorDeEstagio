package JDialog;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;

import JDialog.dialogCadastrar.DialogCadastrarEstegio;
import JDialog.dialogCadastrar.DialogCadastrarInstituicao;
import Tabelas.TableModelAluno;
import Tabelas.TableModelInstituicao;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridLayout;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dialog.ModalityType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.border.LineBorder;
import java.awt.Color;

public class GerenciarInstituicoes extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JPanel pnArea;
	private JButton btnCadastrar;
	private JButton btnRemover;
	private JButton btnEditar;
	private JPanel panel_1;
	
	private static GerenciarInstituicoes instance;
	
	private JTable JTinstituicao;
	private TableModelInstituicao modelTabela;
	private JScrollPane scrolInstituicao = new JScrollPane();
	
	
	public void init(){
		btnCadastrar = new JButton("Cadastrar");
		btnRemover = new JButton("Remover");
		btnEditar = new JButton("Editar");
		
		pnArea = new JPanel();
		pnArea.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1 = new JPanel();
	}

	/**
	 * Create the dialog.
	 */
	private GerenciarInstituicoes() {
		
		init();
		ouvintes();
		setTitle("Gerenciar Instituicoes");
		setBounds(100, 100, 644, 547);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		
		JTinstituicao = new JTable();
		JTinstituicao.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JTinstituicao.setModel(modelTabela = new TableModelInstituicao(new ArrayList<>()));
		scrolInstituicao.setViewportView(JTinstituicao);
		
		JTinstituicao.getTableHeader().setReorderingAllowed(false);
		pnArea.setLayout(new BorderLayout(0, 0));
		pnArea.add(scrolInstituicao);
		
		
		
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(pnArea, GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
							.addGap(1)))
					.addGap(1))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pnArea, GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE))
		);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		panel_1.add(btnCadastrar);
		
		panel_1.add(btnRemover);
		
		btnEditar.setEnabled(false);
		panel_1.add(btnEditar);
		contentPanel.setLayout(gl_contentPanel);
		
		
		setVisible(true);
		setLocationRelativeTo(null);
		
	}
	
	public void ouvintes(){
		btnCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new DialogCadastrarInstituicao();
				
			}
		});
	}
	
	
	public static GerenciarInstituicoes getInstance(){
		if(instance == null){
			synchronized(GerenciarInstituicoes.class){
				if(instance==null){
					instance = new GerenciarInstituicoes();
				}
			}
		}
		instance.setVisible(true);
		return instance;
	}
	
	
}