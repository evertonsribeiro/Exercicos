package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		//variaveis
		int metros, centimentros;
		Scanner teclado = new Scanner(System.in);
		
		
		//Entrada
		System.out.println("Informe o valor em metros: ");
		metros = teclado.nextInt();
		
		//Processamento
		centimentros = (metros * 100);
		
		//Saída
		System.out.println(metros + " metros em centimetros é " + centimentros + " centimetros");
	}

}
