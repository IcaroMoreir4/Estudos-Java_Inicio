/* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais. */

import java.util.Locale;
import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int nf, ht;
		double vlhr, salario;
		
		System.out.println("Número do funcionário:");
		nf = sc.nextInt();
		System.out.println("Horas trabalhadas:");
		ht = sc.nextInt();
		System.out.println("Valor recebido por hora:");
		vlhr = sc.nextDouble();
		
		salario = vlhr * ht;
		
		System.out.println("NUMBER = " + nf);
		System.out.printf("SALARY = U$ %.2f\n", salario);
		
		sc.close();
	}

}
