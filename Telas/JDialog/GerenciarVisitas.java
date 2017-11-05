package JDialog;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.border.LineBorder;

import Tabelas.TableModelVisita;

import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class GerenciarVisitas extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final JPanel contentPanel = new JPanel();

	private JButton btNovaVisita;
	private JButton btnEditar;
	private JButton btRemover;
	private JLabel lbAluno;
	private JPanel pnArea;

	private JTable JTVisitas;
	private TableModelVisita modelTabela;
	private JScrollPane scrolVisita = new JScrollPane();

	private static GerenciarVisitas instance;

	private GerenciarVisitas() {
		setTitle("Gerenciar Visitas");
		setBounds(100, 100, 749, 548);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);

		pnArea = new JPanel();

		JTVisitas = new JTable();
		JTVisitas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		JTVisitas.setModel(modelTabela = new TableModelVisita(new ArrayList<>()));
		scrolVisita.setViewportView(JTVisitas);

		JTVisitas.getTableHeader().setReorderingAllowed(false);
		pnArea.setLayout(new BorderLayout(0, 0));
		pnArea.add(scrolVisita, BorderLayout.CENTER);

		JPanel panel = new JPanel();

		btNovaVisita = new JButton("Nova Visita");

		btnEditar = new JButton("Editar");
		btnEditar.setEnabled(false);

		btRemover = new JButton("Remover");

		lbAluno = new JLabel("Aluno");
		lbAluno.setFont(new Font("Tahoma", Font.BOLD, 14));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				gl_panel.createSequentialGroup().addComponent(lbAluno, GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btNovaVisita, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btRemover, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btnEditar, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addComponent(lbAluno,
								Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnEditar, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
										.addComponent(btRemover, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
										.addComponent(btNovaVisita, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)))
						.addGap(18)));
		panel.setLayout(gl_panel);

		pnArea.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(panel, GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE).addComponent(
										pnArea, GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE))
						.addGap(1)));
		gl_contentPanel.setVerticalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE).addGap(8)
						.addComponent(pnArea, GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)));

		contentPanel.setLayout(gl_contentPanel);

		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static GerenciarVisitas getInstace() {
		if (instance == null) {
			synchronized (GerenciarVisitas.class) {
				if (instance == null) {
					instance = new GerenciarVisitas();
				}
			}

		}
		instance.setVisible(true);
		return instance;
	}

}
