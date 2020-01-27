package utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import funcional.entidades.Cargo;
import funcional.entidades.Funcionario;
import funcional.entidades.Setor;
import funcional.entidades.Sexo;

public final class DBUtil {
	static Cargo c1 = new Cargo(1, "Auxiliar administrativo", Setor.ADMINISTRATIVO);
	static Cargo c2 = new Cargo(1, "Assistente de contas", Setor.FINANCEIRO);
	static Cargo c3 = new Cargo(1, "Recrutador(a)", Setor.RECURSOS_HUMANOS);
	static Cargo c4 = new Cargo(1, "Analista de Sistemas", Setor.TECNOLOGIA_INFORMACAO);
	static Cargo c5 = new Cargo(1, "Analista de suporte", Setor.TECNOLOGIA_INFORMACAO);
	static Cargo c6 = new Cargo(1, "Secretário(a)", Setor.ADMINISTRATIVO);
	static Cargo c7 = new Cargo(1, "Divulgador(a) de mídias sociais", Setor.MARKETING);

	static Funcionario f1 = new Funcionario(1, 23, Sexo.MASCULINO, "Rick", "Beethovan", c5);
	static Funcionario f2 = new Funcionario(2, 13, Sexo.FEMININO, "Martina", "Hengis", c3);
	static Funcionario f3 = new Funcionario(3, 43, Sexo.MASCULINO, "Ricky", "Martin", c1);
	static Funcionario f4 = new Funcionario(4, 26, Sexo.MASCULINO, "Jon", "Lowman", c7);
	static Funcionario f5 = new Funcionario(5, 19, Sexo.FEMININO, "Cristine", "Maria", c6);
	static Funcionario f6 = new Funcionario(6, 15, Sexo.MASCULINO, "David", "Feezor", c4);
	static Funcionario f7 = new Funcionario(7, 68, Sexo.FEMININO, "Melissa", "Roy", c2);
	static Funcionario f8 = new Funcionario(8, 79, Sexo.MASCULINO, "Alex", "Gussin", c1);
	static Funcionario f9 = new Funcionario(9, 15, Sexo.FEMININO, "Neetu", "Singh", c3);
	static Funcionario f10 = new Funcionario(10, 45, Sexo.MASCULINO, "Naveen", "Jain", c4);
	


	static List<Funcionario> lista = Arrays.asList(new Funcionario[] {f1,f2, f3, f4, f5, f6, f7, f8, f9 ,f10});
	
	public static Funcionario findById(Integer id) {
		return lista.stream()
				.filter(f -> f.getId() == id)
				.findAny()
				.orElse(null);
	}

	public static List<Funcionario> getAllFuncionarios(){
		return lista;
	}
	
	public static List<Funcionario> getBySexo(String sigla) {
		return lista.stream()
					.filter(f -> f.getSexo().getSigla() == sigla)
					.collect(Collectors.toList());
	}
	
	
	public static List<Funcionario> findByCargoId(Integer idCargo){
			return lista.stream()
						.filter(f -> f.getCargo().getId() == idCargo)
						.collect(Collectors.toList());
	}
	
	public static List<Funcionario> findBySetorSigla(String sigla){
		return lista.stream()
					.filter(f -> f.getCargo().getSetor().getSigla() == sigla)
					.collect(Collectors.toList());
	}
}
