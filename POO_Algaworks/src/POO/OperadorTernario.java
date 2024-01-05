package POO;

import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		String indicacao = (idade >= 18) ? "Adulto" : "Criança/Adolecente";

		// Pode receber outros tipos de dados: 
		int x = (idade >=18) ? 1 :3;
		
		//Não fazer, não é uma boa pratica
		//String indicacao = (idade >= 18) ? "Adulto" : (idade <= 12 ? "Criança" : "Adolecente");

		
		System.out.println("Resultado: " + indicacao);
	}

}
