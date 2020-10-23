package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		//Variaveis
		float altura, peso_ideal;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Qual a sua altura? ");
		altura = teclado.nextFloat();
		
		
		//processamento
		peso_ideal = (float)(altura * 72.7) - 58;
		
		//saida
		System.out.printf("seu peso ideal seria: %.2f" , peso_ideal);
		
		teclado.close();

	}

}
