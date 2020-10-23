package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// Variaveis
		float valor_por_horas_trabalhadas, salario;
		int  horas_trabalhadas;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Quanto você ganha por hora? ");
		valor_por_horas_trabalhadas = teclado.nextFloat();
		
		System.out.println("quantas horas você trabalhou neste mês? ");
		horas_trabalhadas = teclado.nextInt();
		
		//processamento
		salario = (horas_trabalhadas * valor_por_horas_trabalhadas);
		
		//saida
		System.out.println("Nesse mês seu salario sera R$" + salario);
		
		teclado.close();
		
		
	}	

}
