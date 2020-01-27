package funcional;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import funcional.entidades.Funcionario;
import funcional.entidades.Sexo;

public class RegrasFuncionario {
	public static final Integer VINTE_UM_ANOS = 21;
	public static final Integer DEZOITO_ANOS = 18;
	
//	public static final Predicate<Funcionario> HOMEM_ADULTO = 
//			p -> p.getIdade() > VINTE_UM_ANOS && p.getSexo().equals(Sexo.MASCULINO); 
	
	
	public static Predicate<Funcionario> isHomemAdulto(){
		return p -> p.getIdade() > VINTE_UM_ANOS && p.getSexo().equals(Sexo.MASCULINO);
	}
	
	public static Predicate<Funcionario> isMulherAdulta(){
		return p -> p.getIdade() > DEZOITO_ANOS && p.getSexo().equals(Sexo.FEMININO);
	}
	
	public static Predicate<Funcionario> idadeAcimaDe(Integer idade){
		return p -> p.getIdade() > idade;
	}
	
	public static List<Funcionario> filtrarFuncionariosPorRegra(List<Funcionario> funcionarios, Predicate<Funcionario> regra){
		return funcionarios.stream()
					.filter(regra)
					.collect(Collectors.toList());
	}
	
	public static boolean avaliar(Funcionario funcionario, Predicate<Funcionario> regra) throws Exception {
//		if(regra.test(funcionario)) {
//			return true;
//		}else {
//			throw new Exception("Não atende a regra");
//		}
		
		return regra.test(funcionario);
	}
}
