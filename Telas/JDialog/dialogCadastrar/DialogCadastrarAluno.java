package JDialog.dialogCadastrar;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import javax.swing.SwingConstants;

public class DialogCadastrarAluno extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JSpinner spnPeriodo;
	private JButton btnCancelar;
	private JButton btnSalvar;
	private JTextField txNome;
	private JTextField txMatricula;
	private JComboBox cbxCurso;

	/**
	 * Launch the application.
	 */

	public DialogCadastrarAluno() {
		setResizable(false);

		setTitle("Cadatrar Aluno");
		setBounds(100, 100, 473, 334);
		
		 cbxCurso = new JComboBox<Object>();
		
		txNome = new JTextField();
		txNome.setColumns(10);
		
		btnSalvar = new JButton("Salvar");
		
		btnCancelar = new JButton("Cancelar");
		
		JLabel label = new JLabel("Nome");
		
		JLabel label_1 = new JLabel("Periodo");
		
		spnPeriodo = new JSpinner();
		
		JLabel label_2 = new JLabel("Matricula");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		
		txMatricula = new JTextField();
		txMatricula.setColumns(10);
		
		JLabel label_3 = new JLabel("Curso");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(cbxCurso, Alignment.TRAILING, 0, 437, Short.MAX_VALUE)
						.addComponent(txNome, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(spnPeriodo, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
									.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
								.addComponent(btnSalvar, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(txMatricula, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnCancelar, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(label)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txNome, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(label_3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(cbxCurso, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(8)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(label_1)
										.addComponent(spnPeriodo, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(3)
									.addComponent(txMatricula, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(29)
							.addComponent(label_2)))
					.addPreferredGap(ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSalvar, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(13))
		);
		getContentPane().setLayout(groupLayout);

		setModal(true);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
