package exercicios;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int idade;
		int ig; // Identidade de Gênero
		int ps; //Pessoa Desenvolvedora
		
		int bn = 0; // Número de pessoas desenvolvedoras backend
		int mc = 0; // Número de mulheres cis frontend
		int mt = 0; // Número de mulheres trans frontend
		int hc = 0; // Número de homens cis maiores de 40 anos de idade e desenvolvedores mobile
		int ht = 0; // Número de homens trans maiores de 40 anos de idade e desenvolvedores mobile
		int nbf = 0; // Número de não binários desenvolvedores FullStack menores de 30 anos de idade
		int total = 0; // Número total de respondentes
		int idadetotal = 0; //Soma de todas as idades
		int media = 0; // Média de idade das pessoas que responderam à pesquisa 
		String p = "S";
		
		System.out.println("Identidade de Gênero:");
		System.out.println("1 - Mulher Cis");
		System.out.println("2 - Homem Cis");
		System.out.println("3 - Não Binário");
		System.out.println("4 - Mulher Trans");
		System.out.println("5 - Homem Trans");
		System.out.println("6 - Outros");
		System.out.println("******************");
		System.out.println("Pessoa Desenvolvedora:");
		System.out.println("1 - Backend");
		System.out.println("2 - Frontend");
		System.out.println("3 - Mobile");
		System.out.println("4 - FullStack");
		
		while(p.toUpperCase().equals("S")) {
			total += 1;
			System.out.println("Digite a sua idade: ");
			idade = scanner.nextInt();
			idadetotal += idade;
			System.out.println("Digite a sua identidade de gênero: ");
			ig = scanner.nextInt();
			System.out.println("Pessoa desenvolvedora: ");
			ps = scanner.nextInt();
			if(ig == 1 && ps == 2) {
				mc += 1;
			} else if(ig == 4 && ps == 2) {
				mt += 1;
			}
			
			
			if(idade > 40) {
				if(ig == 2 && ps == 3) {
					hc += 1;
				} else if(ig == 5 && ps == 3) {
					ht += 1;
				}
			} else if(idade < 30) {
				if(ig == 3 && ps == 4) {
					nbf += 1;
				}
			}
			System.out.println("Quer continuar? S/N?  ");
			p = scanner.next();
			
			
			//if(p == "N") {
			//	break;
			//} else if(p == "n") {
			//	break;
			//}
		}
		
		media = idadetotal / total;
		
		System.out.println("Número de pessoas desenvolvedoras backend: " + bn);
		System.out.println("Número de mulheres cis frontend: " + mc);
		System.out.println("Número de mulheres trans frontend: " + mt);
		System.out.println("Número de homens cis maiores de 40 anos de idade e desenvolvedores mobile: " + hc);
		System.out.println("Número de homens trans maiores de 40 anos de idade e desenvolvedores mobile: " + ht);
		System.out.println("Número de não binários desenvolvedores FullStack menores de 30 anos de idade" + nbf);
		System.out.println("Número total de respondentes: " + total);
		System.out.println("Média de idade das pessoas que responderam à pesquisa : " + media);
		

	}

}
