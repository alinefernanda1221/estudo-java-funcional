package funcional.entidades;

public class Funcionario {

	private Integer id;
	private Integer idade;
	private Sexo sexo;
	private String primeiroNome;
	private String ultimoNome;
	private Endereco endereco;
	private Cargo cargo;
	
	public Funcionario() {}

	public Funcionario(Integer id, Integer idade, Sexo sexo, String primeiroNome, String ultimoNome, Cargo cargo) {
		this.id = id;
		this.idade = idade;
		this.sexo = sexo;
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		this.cargo = cargo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", idade=" + idade + ", sexo=" + sexo + ", primeiroNome=" + primeiroNome
				+ ", ultimoNome=" + ultimoNome + ", endereco=" + endereco + ", cargo=" + cargo + "]";
	}
	
}
