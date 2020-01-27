package funcional.entidades;

public class Cargo {
	
	private Integer id;
	private String descricao;
	private Setor setor;
	
	public Cargo() {}

	public Cargo(Integer id, String descricao, Setor setor) {
		this.id = id;
		this.descricao = descricao;
		this.setor = setor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	@Override
	public String toString() {
		return "Cargo [descricao=" + descricao + "]";
	}
}
