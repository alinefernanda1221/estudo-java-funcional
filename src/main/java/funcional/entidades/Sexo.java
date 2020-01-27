package funcional.entidades;

public enum Sexo {

	FEMININO("F"),
	MASCULINO("M");
	
	String sigla;
	
	private Sexo(String sigla) {
		this.sigla = sigla;
	}
	
	public String getSigla() {
		return sigla;
	}
}
