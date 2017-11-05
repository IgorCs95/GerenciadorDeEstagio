package Tabelas;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import entidades.Estagio;
import entidades.Instituicao;


/** Classe responsavel por tratar a tabela Alcoar
 * @author IgorCs 
 *
 */
@SuppressWarnings("serial")
public class TableModelInstituicao extends AbstractTableModel {

	private ArrayList<Instituicao> linhas;
	
	private String[] colunas = new String[] { "Razao", "Cnpj","Endereço"};
	private final static int razao = 0,cnpj = 1,endereco = 2;

	
	public TableModelInstituicao(ArrayList<Instituicao> listaDeSalas) {
		
		linhas = new ArrayList<Instituicao>(listaDeSalas);
		
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

		case razao:
			return String.class;
		case cnpj:
			return int.class;
		case endereco:
			return String.class;
		
	
			
		default:
			throw new IndexOutOfBoundsException("columnIndex out of bounds");
		}

	}

	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}
	

	public Object getValueAt(int rowIndex, int columnIndex) {

		Instituicao sala = linhas.get(rowIndex);

		switch (columnIndex) {
		case razao:
			return sala.getRazao();
		case cnpj:
			return sala.getCnpj();
		case endereco:
			return sala.getEndereço();
		
		
		default:
			throw new IndexOutOfBoundsException("columnIndex out of bounds");

		}
	}

	public Instituicao getInstituicao(int indiceLinha) {
		return linhas.get(indiceLinha);
	}

	public void addAluno(Instituicao ins) {
		linhas.add(ins);

		int ultimoIndice = getRowCount();

		fireTableRowsInserted(ultimoIndice, ultimoIndice);
	}

	public void removerInstituicao(int indiceLinha) {

		linhas.remove(indiceLinha);
		fireTableRowsDeleted(indiceLinha, indiceLinha);
	}
}