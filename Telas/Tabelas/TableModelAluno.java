package Tabelas;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import entidades.Aluno;


/** Classe responsavel por tratar a tabela Alcoar
 * @author IgorCs 
 *
 */
@SuppressWarnings("serial")
public class TableModelAluno extends AbstractTableModel {

	private ArrayList<Aluno> linhas;
	
	private String[] colunas = new String[] { "Nome", "Matricula","Curso","Periodo"};
	private final static int nome = 0,matricula = 1,curso = 2,periodo = 3;

	
	public TableModelAluno(ArrayList<Aluno> listaDeSalas) {
		
		linhas = new ArrayList<Aluno>(listaDeSalas);
		
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

		case nome:
			return String.class;
		case matricula:
			return int.class;
		case curso:
			return String.class;
		case periodo:
			return int.class;
	
			
		default:
			throw new IndexOutOfBoundsException("columnIndex out of bounds");
		}

	}

	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}
	

	public Object getValueAt(int rowIndex, int columnIndex) {

		Aluno sala = linhas.get(rowIndex);

		switch (columnIndex) {
		case nome:
			return sala.getNome();
		case matricula:
			return sala.getCurso();
		case curso:
			return sala.getCurso();
		case periodo:
			return sala.getCurso();
		
		default:
			throw new IndexOutOfBoundsException("columnIndex out of bounds");

		}
	}

	public Aluno getAluno(int indiceLinha) {
		return linhas.get(indiceLinha);
	}

	public void addAluno(Aluno aluno) {
		linhas.add(aluno);

		int ultimoIndice = getRowCount();

		fireTableRowsInserted(ultimoIndice, ultimoIndice);
	}

	public void removerAluno(int indiceLinha) {

		linhas.remove(indiceLinha);
		fireTableRowsDeleted(indiceLinha, indiceLinha);
	}
}