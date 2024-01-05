package POO;

import java.util.Scanner;

public class ProgramaIPVA {

	public static void main (String [] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o numero final da sua Placa Veicular: ");
		int finalPlaca = entrada.nextInt();
		
		switch (finalPlaca) {
		case 1: // condicional para cair dentro do parametro da data descrita em Texto
			System.out.println("Veiculo com vencimento dia 11 de Janeiro");
			break;
		case 2:
			System.out.println("Veiculo com Vencimento dia 12 de Janeiro");
			break;
		case 3:
			System.out.println("Veiculo com Vencimento dia 13 de Janeiro");
			break;
		}
		
	}
	
	
	
}
