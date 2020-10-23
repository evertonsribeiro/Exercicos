package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// variaveis
		int n;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Informe um numero");
		n = teclado.nextInt();
		
	
		//processamento
		
		if(n > 100) {
			System.out.println(n);			
		}else {
			n = 0;
			System.out.println(n);		
		}
		//saida
		teclado.close();
	}

}
