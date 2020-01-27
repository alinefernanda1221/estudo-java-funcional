package funcional;

import funcional.entidades.Funcionario;
import utils.DBUtil;
import static funcional.RegrasFuncionario.*;

import java.util.Random;

public class App {
	public static void main(String[] args) throws Exception {
		
		int id = new Random().nextInt(DBUtil.getAllFuncionarios().size());
		int idade = new Random().nextInt(69);
		
		
		Funcionario funcionario = DBUtil.findById(id);
		
		System.out.println("Adulto maior de idade: " + avaliar(funcionario, isHomemAdulto()));
		System.out.println("Adulta maior de idade: " + avaliar(funcionario, isMulherAdulta()));
		System.out.println("Idade acima de "+ idade + " :" + avaliar(funcionario, idadeAcimaDe(idade)));
		
		System.out.println("Funcionário: " + funcionario.toString());

	}
}
