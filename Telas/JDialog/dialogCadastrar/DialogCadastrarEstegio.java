package JDialog.dialogCadastrar;

import java.awt.BorderLayout;

import javax.swing.JDialog;
import javax.swing.JPanel;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;

public class DialogCadastrarEstegio extends JDialog{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNome;
	private JTextField txProcessofin;
	private JTextField txNota;
	private JTextField txProcessoInicial;
	

	/**
	 * Launch the application.
	 */
	
	public DialogCadastrarEstegio() {
		
		
		setTitle("Cadatrar Estagio");
		setBounds(100, 100, 319, 521);
		setLocationRelativeTo(null);
		
		JButton button = new JButton("Salvar");
		
		JButton button_1 = new JButton("Cancelar");
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		
		JLabel label = new JLabel("Instituicao:");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel label_1 = new JLabel("Aluno:");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		
		JComboBox cbxInstituicao = new JComboBox();
		
		JLabel label_2 = new JLabel("Processo Inicial");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel label_3 = new JLabel("Data Inicio:");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel label_4 = new JLabel("Data Fim:");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel label_5 = new JLabel("Nota");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel label_6 = new JLabel("Processo Final");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		
		txProcessofin = new JTextField();
		txProcessofin.setColumns(10);
		
		txNota = new JTextField();
		txNota.setColumns(10);
		
		JSpinner spnDataInicio = new JSpinner();
		spnDataInicio.setModel(new SpinnerDateModel(new Date(1509850800000L), null, null, Calendar.DAY_OF_YEAR));
		
		JSpinner spnDataFin = new JSpinner();
		spnDataFin.setModel(new SpinnerDateModel(new Date(1509850800000L), null, null, Calendar.DAY_OF_YEAR));
		
		txProcessoInicial = new JTextField();
		txProcessoInicial.setColumns(20);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addComponent(cbxInstituicao, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(8)
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(spnDataInicio, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(8)
							.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(spnDataFin, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(15)
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(txProcessoInicial, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
							.addGap(8)
							.addComponent(txProcessofin, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(35)
							.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txNota, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(165, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(53, Short.MAX_VALUE)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(cbxInstituicao, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(spnDataInicio, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(spnDataFin, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(txProcessoInicial, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(7)
							.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(txProcessofin, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(txNota, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);
		
		
		
		setModal(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	

}
