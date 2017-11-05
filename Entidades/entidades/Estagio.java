package entidades;
import javax.xml.crypto.Data;

public class Estagio {
	
	private String aluno,intituicao;
	private int id,protocoloInicial,ProtocoloFinal,nota;
	private Data dataInicial,dataFinal;
	private Data dataProtocoloInicial,dataProtocoloFinal;
	
	
	public String getAluno() {
		return aluno;
	}
	public void setAluno(String aluno) {
		this.aluno = aluno;
	}
	public String getIntituicao() {
		return intituicao;
	}
	public void setIntituicao(String intituicao) {
		this.intituicao = intituicao;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProtocoloInicial() {
		return protocoloInicial;
	}
	public void setProtocoloInicial(int protocoloInicial) {
		this.protocoloInicial = protocoloInicial;
	}
	public int getProtocoloFinal() {
		return ProtocoloFinal;
	}
	public void setProtocoloFinal(int protocoloFinal) {
		ProtocoloFinal = protocoloFinal;
	}
	public Data getDataInicial() {
		return dataInicial;
	}
	public void setDataInicial(Data dataInicial) {
		this.dataInicial = dataInicial;
	}
	public Data getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(Data dataFinal) {
		this.dataFinal = dataFinal;
	}
	public Data getDataProtocoloInicial() {
		return dataProtocoloInicial;
	}
	public void setDataProtocoloInicial(Data dataProtocoloInicial) {
		this.dataProtocoloInicial = dataProtocoloInicial;
	}
	public Data getDataProtocoloFinal() {
		return dataProtocoloFinal;
	}
	public void setDataProtocoloFinal(Data dataProtocoloFinal) {
		this.dataProtocoloFinal = dataProtocoloFinal;
	}
}
