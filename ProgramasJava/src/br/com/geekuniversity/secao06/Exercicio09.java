package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio09 {
	
	public static void main(String[] args) {
	// variaveis
		float indice;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.println("Qual é o indice de poluição?");
		indice = teclado.nextFloat();
		
		//processamento
		if(indice >= 0.3 && indice < 0.4) {
			System.out.println("Indutrias do grupo 1 devem suspender as atividades");
		}else if(indice >= 0.4 && indice < 0.5) {
			System.out.println("Indutrias do grupo 1 e 2 devem suspender as atividades");
		}else if (indice > 0.5) {
			System.out.println("todas as indrutias devem suspender as atividades");
		}
		teclado.close();		
  }
	
}
