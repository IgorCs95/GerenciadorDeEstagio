package JDialog.dialogCadastrar;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class DialogCadastrarInstituicao extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txCnpjCpf;
	private JTextField txNome;
	private JTextField txEndereco;
	private JTextField txContato;
	private JTextField txEmail;
	private JButton btnSalvar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */

	public DialogCadastrarInstituicao() {
		setResizable(false);

		setTitle("Cadatrar Instituicao");
		setBounds(100, 100, 455, 340);
		getContentPane().setLayout(null);

		getContentPane().setLayout(null);

		JLabel lblCnpjcpf = new JLabel("CNPJ/CPF:");
		lblCnpjcpf.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCnpjcpf.setBounds(10, 33, 80, 15);
		getContentPane().add(lblCnpjcpf);

		txCnpjCpf = new JTextField();
		txCnpjCpf.setBounds(94, 31, 114, 30);
		getContentPane().add(txCnpjCpf);
		txCnpjCpf.setColumns(10);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setBounds(10, 74, 80, 30);
		getContentPane().add(lblNome);

		txNome = new JTextField();
		txNome.setBounds(94, 72, 273, 30);
		getContentPane().add(txNome);
		txNome.setColumns(10);

		JLabel lblEndereo = new JLabel("Endereco:");
		lblEndereo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEndereo.setBounds(10, 117, 80, 30);
		getContentPane().add(lblEndereo);

		txEndereco = new JTextField();
		txEndereco.setColumns(10);
		txEndereco.setBounds(94, 115, 273, 30);
		getContentPane().add(txEndereco);

		txContato = new JTextField();
		txContato.setBounds(94, 158, 273, 30);
		getContentPane().add(txContato);
		txContato.setColumns(10);

		JLabel lblContato = new JLabel("Contato:");
		lblContato.setHorizontalAlignment(SwingConstants.RIGHT);
		lblContato.setBounds(10, 160, 80, 15);
		getContentPane().add(lblContato);

		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setBounds(10, 199, 80, 15);
		getContentPane().add(lblEmail);

		txEmail = new JTextField();
		txEmail.setBounds(94, 199, 273, 30);
		getContentPane().add(txEmail);
		txEmail.setColumns(10);

		btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(189, 259, 117, 30);
		getContentPane().add(btnSalvar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(312, 260, 117, 30);
		getContentPane().add(btnCancelar);
		
		
		
		
		
		

		setLocationRelativeTo(null);
		setModal(true);
		setVisible(true);
	}


}
