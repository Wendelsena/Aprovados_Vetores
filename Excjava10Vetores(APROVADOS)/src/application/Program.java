package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Students;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos alunos serão digitados?: ");
		int n = sc.nextInt();
		Students[] vect = new Students[n];
		
		sc.nextLine();
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
			String name = sc.nextLine();
			double firsttrimester = sc.nextDouble();
			double secondtrimester = sc.nextDouble();
			
			sc.nextLine();
			
			vect[i] = new Students(name, firsttrimester, secondtrimester);
		}
		
		System.out.print("ALUNOS APROVADOS: \n");
		for(int i = 0; i < vect.length; i++) {
			if (vect[i].finalGrade() >= 6.0) {
				System.out.println(vect[i].getName());
			}
		}
		
		sc.close();

	}

}
