package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		//variaveis
		int numero;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.println("Escreva um numero: ");
		numero = teclado.nextInt();
		
		//processamento
		
		if(numero %2 ==0) {
			if(numero > 0) {
				System.out.println("o numero é par e positivo");
			}else {
				System.out.println("O numero é par e negativo");
			}
		}else {
			if(numero > 0) {
				System.out.println("o numero é impar e positivo");
			}else {
				System.out.println("O numero é impar e negativo");
			}
		}
		teclado.close();
	}

}
