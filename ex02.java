/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.*/

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y, soma;
		
		System.out.println("Digite o primeiro número: ");
		x = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		y = sc.nextInt();
		soma = x + y;
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}

}