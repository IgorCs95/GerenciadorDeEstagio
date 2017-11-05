package Tabelas;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;
import javax.xml.crypto.Data;

import entidades.Aluno;
import entidades.Estagio;
import entidades.Visita;


/** Classe responsavel por tratar a tabela Alcoar
 * @author IgorCs 
 *
 */
@SuppressWarnings("serial")
public class TableModelVisita extends AbstractTableModel {

	private ArrayList<Visita> linhas;
	
	private String[] colunas = new String[] { "Data","Relatorio"};
	private final static int data = 0,relatorio = 1;

	
	public TableModelVisita(ArrayList<Visita> listaDeSalas) {
		linhas = new ArrayList<Visita>(listaDeSalas);
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

		case data:
			return Data.class;
		case relatorio:
			return String.class;
	
			
		default:
			throw new IndexOutOfBoundsException("columnIndex out of bounds");
		}

	}

	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}
	

	public Object getValueAt(int rowIndex, int columnIndex) {

		Visita sala = linhas.get(rowIndex);

		switch (columnIndex) {
		case data:
			return sala.getDataDaVisita();
		case relatorio:
			return sala.getRelatorio();
		
		default:
			throw new IndexOutOfBoundsException("columnIndex out of bounds");

		}
	}

	public Visita getVisita(int indiceLinha) {
		return linhas.get(indiceLinha);
	}

	public void addVisita(Visita visita) {
		linhas.add(visita);

		int ultimoIndice = getRowCount();

		fireTableRowsInserted(ultimoIndice, ultimoIndice);
	}

	public void removerVisita(int indiceLinha) {

		linhas.remove(indiceLinha);
		fireTableRowsDeleted(indiceLinha, indiceLinha);
	}
}