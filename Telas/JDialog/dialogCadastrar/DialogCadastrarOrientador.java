package JDialog.dialogCadastrar;


import javax.swing.JDialog;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class DialogCadastrarOrientador extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextField txMatricula;
	private JTextField txOrientador;
	private JButton btSalvar;
	private JButton btCancelar;

	/**
	 * Launch the application.
	 */

	public DialogCadastrarOrientador() {

		setTitle("Cadatrar Orientador");
		setBounds(100, 100, 473, 247);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		txMatricula = new JTextField();
		txMatricula.setBounds(10, 115, 169, 31);
		getContentPane().add(txMatricula);
		txMatricula.setColumns(10);

		txOrientador = new JTextField();
		txOrientador.setColumns(10);
		txOrientador.setBounds(10, 45, 437, 31);
		getContentPane().add(txOrientador);

		JLabel lblNewLabel = new JLabel("Nome do Orientador");
		lblNewLabel.setBounds(10, 11, 125, 23);
		getContentPane().add(lblNewLabel);

		JLabel lblMatricula = new JLabel("Matricula");
		lblMatricula.setBounds(10, 87, 98, 23);
		getContentPane().add(lblMatricula);

		btSalvar = new JButton("Salvar");
		btSalvar.setBounds(193, 169, 125, 31);
		getContentPane().add(btSalvar);

		btCancelar = new JButton("Cancelar");
		btCancelar.setBounds(322, 169, 125, 31);
		getContentPane().add(btCancelar);

		setModal(true);
		setResizable(false);
		setVisible(true);
	}

}
