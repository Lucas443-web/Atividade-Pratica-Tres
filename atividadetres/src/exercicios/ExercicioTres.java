package exercicios;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		
		int i = 0;
		int soma = 0;
		System.out.println("Caso queira encerrar o programa, digite 0.");
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Digite um número inteiro: ");
			i = scanner.nextInt();
			if(i > 0) {
				soma += i;
			}
		} while(i != 0);
		
		System.out.println("A soma dos números positivos é " + soma);
		
		
		
		
		
		
	}

}
