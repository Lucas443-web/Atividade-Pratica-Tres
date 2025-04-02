package exercicios;

import java.util.Scanner;

public class ExericicioUm {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = 0;
		int np = 0;
		int nip = 0;
		
		for(int i=1; i <= 10; i++) {
			System.out.println("Digite o " + i + "° número:");
			n = scanner.nextInt();
			
			if(n%2 == 0) {
				np += 1;
			} else if(n%2 != 0) {
				nip += 1;
			}
			
			
		}
		
		System.out.println("Total de números pares: " + np);
		System.out.println("Total de números ímpares: " + nip);

	}

}
