/* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente. */

import java.util.Locale;
import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1;
		int n2;
		
		System.out.println("Digite um número:");
		n1 = sc.nextInt();
		System.out.println("Digite outro número:");
		n2 = sc.nextInt();
		
		if (n1 % n2  == 0 || n2 % n1 == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();
	}

}
