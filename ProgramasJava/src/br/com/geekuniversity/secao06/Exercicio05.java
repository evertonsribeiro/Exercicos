package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		//variaveis
		float  p, m;
		String e = "excesso";
		Scanner teclado = new Scanner(System.in);
		
				
		//entrada
		System.out.println("Informe o peso dos peixes ");
		p = teclado.nextFloat();
		
		//processamento
		if(p > 50) {
			m = (float)(p - 50) * (float)4.00;
			System.out.println("você pagara R$ em multas" + m);
			
		
		}else {
			m = 0;
			e = "0";
			System.out.println("multas: " + m);
			System.out.println("Excesso: " + e);
		}
		//saida
		teclado.close();
	}

}
