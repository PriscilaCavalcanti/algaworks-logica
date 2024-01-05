package POO;

import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		String indicacao = (idade >= 18) ? "Adulto" : "Crian�a/Adolecente";

		// Pode receber outros tipos de dados: 
		int x = (idade >=18) ? 1 :3;
		
		//N�o fazer, n�o � uma boa pratica
		//String indicacao = (idade >= 18) ? "Adulto" : (idade <= 12 ? "Crian�a" : "Adolecente");

		
		System.out.println("Resultado: " + indicacao);
	}

}
