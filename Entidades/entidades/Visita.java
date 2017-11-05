package entidades;
import java.sql.Date;

public class Visita {
	
	private Date dataDaVisita;
	private String relatorio;
	private int estagio;
	
	public Date getDataDaVisita() {
		return dataDaVisita;
	}
	public void setDataDaVisita(Date dataDaVisita) {
		this.dataDaVisita = dataDaVisita;
	}
	public String getRelatorio() {
		return relatorio;
	}
	public void setRelatorio(String relatorio) {
		this.relatorio = relatorio;
	}
	public int getEstagio() {
		return estagio;
	}
	public void setEstagio(int estagio) {
		this.estagio = estagio;
	}
	
	
	

}
