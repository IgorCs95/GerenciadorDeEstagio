package Tabelas;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;
import javax.xml.crypto.Data;

import entidades.Aluno;
import entidades.Estagio;


/** Classe responsavel por tratar a tabela Alcoar
 * @author IgorCs 
 *
 */
@SuppressWarnings("serial")
public class TableModelEstagio extends AbstractTableModel {

	private ArrayList<Estagio> linhas;
	
	private String[] colunas = new String[] { "Aluno", "instituição","Data Inicio","Data Fin","Processo inicial","Processo Final","nota"};
	private final static int aluno = 0,instituicao = 1,dataInico = 2,dataFin = 3,processoInicial= 4,processoFinal=5,nota=6;

	
	public TableModelEstagio(ArrayList<Estagio> listaDeSalas) {
		linhas = new ArrayList<Estagio>(listaDeSalas);
	}

	public int getRowCount() {
		return linhas.size();
	}

	public int getColumnCount() {
		return colunas.length;
	}

	public String getColumnName(int columnIndex) {
		return colunas[columnIndex];
	}

	public Class<?> getColumnClass(int columnIndex) {

		switch (columnIndex) {

		case aluno:
			return String.class;
		case instituicao:
			return String.class;
		case dataInico:
			return Data.class;
		case dataFin:
			return Data.class;
		case processoInicial:
			return int.class;
		case processoFinal:
			return int.class;
		case nota:
			return int.class;	
			
		default:
			throw new IndexOutOfBoundsException("columnIndex out of bounds");
		}

	}

	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}
	

	public Object getValueAt(int rowIndex, int columnIndex) {

		Estagio sala = linhas.get(rowIndex);

		switch (columnIndex) {
		case aluno:
			return sala.getAluno();
		case instituicao:
			return sala.getIntituicao();
		case dataInico:
			return sala.getDataInicial();
		case dataFin:
			return sala.getDataFinal();
		case processoInicial:
			return sala.getProtocoloInicial();
		case processoFinal:
			return sala.getProtocoloFinal();
		case nota:
			return sala.getNota();
			
			
		default:
			throw new IndexOutOfBoundsException("columnIndex out of bounds");

		}
	}

	public Estagio getAluno(int indiceLinha) {
		return linhas.get(indiceLinha);
	}

	public void addAluno(Estagio aluno) {
		linhas.add(aluno);

		int ultimoIndice = getRowCount();

		fireTableRowsInserted(ultimoIndice, ultimoIndice);
	}

	public void removerAluno(int indiceLinha) {

		linhas.remove(indiceLinha);
		fireTableRowsDeleted(indiceLinha, indiceLinha);
	}
}