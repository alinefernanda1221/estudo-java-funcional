package funcional.entidades;

public class Endereco {
	
	private String cidade;
	private String bairro;
	private String uf;
	
	public Endereco() {}

	public Endereco(String cidade, String bairro, String uf) {
		this.cidade = cidade;
		this.bairro = bairro;
		this.uf = uf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	@Override
	public String toString() {
		return "Cidade: " + this.cidade + " | " + "Bairro: " + this.bairro + " | " + "UF: " + this.uf;
	}

}
