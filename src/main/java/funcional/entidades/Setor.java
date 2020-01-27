package funcional.entidades;

public enum Setor {

	ADMINISTRATIVO(1, "A", "Setor administrativo"),
	FINANCEIRO(2, "F", "Setor de finanças"),
	TECNOLOGIA_INFORMACAO(3,"TI", "Setor relacionado a informática e suporte"),
	MARKETING(4, "M", "Setor relacionado a marketing"),
	RECURSOS_HUMANOS(5, "RH", "Setor que cuida de recursos humanos.");

	Integer id;
	String sigla;
	String descricao;

	private Setor(Integer id, String sigla, String descricao) {
		this.id = id;
		this.sigla = sigla;
		this.descricao = descricao;
	}

	public Integer getId() {
		return id;
	}

	public String getSigla() {
		return sigla;
	}

	public String getDescricao() {
		return descricao;
	}
}
