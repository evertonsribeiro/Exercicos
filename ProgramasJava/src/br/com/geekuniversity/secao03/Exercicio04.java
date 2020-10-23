package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// Variaveis
		int num1, num2, soma;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		
	    System.out.println("Informe o primeiro numero ");
	    num1 = teclado.nextInt();
			
	    System.out.println("informe o segundo numero ");
	    num2 = teclado.nextInt();
	    
	   
	
		//processamento
	    
	    soma = (num1 + num2);
	    
	    
		//Saída
	    System.out.println("A soma é: " + soma);
	
	    teclado.close();
	    

	}

}
