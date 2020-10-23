package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		//variaveis
		int numero, a, b;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.println("Informe um numero: ");
		numero = teclado.nextInt();
		
		//processamento
		if(numero > 0) {
			a = numero;
			// saida
			System.out.println(a);
		}else {
			b = numero;
			// saida
			System.out.println(b);
			
		}
		
		teclado.close();
	}

}
