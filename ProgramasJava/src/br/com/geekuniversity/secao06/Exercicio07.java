package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// variaveis
		int num1, num2, num3, num4, q1, q2, q3, q4;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.println("informe o numero1: ");
		num1 = teclado.nextInt();
		System.out.println("informe o numero2: ");
		num2 = teclado.nextInt();
		System.out.println("informe o numero3: ");
		num3 = teclado.nextInt();
		System.out.println("informe o numero4: ");
		num4 = teclado.nextInt();
		
		//processamento
		q1 = num1 + num1;
		q2 = num2 + num2;
		q3 = num3 + num3;
		q4 = num4 + num4;
		
		if(q3 >= 1000) {
			System.out.println(q3);
		}else {
			System.out.printf("num1: %d Quadrado: %d\n", num1, q1);
			System.out.printf("num2: %d Quadrado: %d\n", num2, q2);
			System.out.printf("num3: %d Quadrado: %d\n", num3, q3);
			System.out.printf("num4: %d Quadrado: %d\n", num4, q4);
		}
		//saida
		teclado.close();
	}

}
