/* Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não. */

import java.util.Locale;
import java.util.Scanner;

public class ex06 {

    public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número:");
		numero = sc.nextInt();
		
		if (numero >= 0) {
			System.out.println("NAO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}
		
		sc.close();
	}
}
