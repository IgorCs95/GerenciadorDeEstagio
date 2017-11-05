package entidades;

public abstract class Professor {
	
	private String nome;
	private int matricula;
	
	/**Verificar se objeto e do tipo orientador ou coordenador
	 * 1 - se o objeto for Coordenador
	 * 2 - se o objeto for Orientador
	 * 
	 * @return tipo do objeto
	 */
	public abstract int getTipo();

	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
	
	
	

}
