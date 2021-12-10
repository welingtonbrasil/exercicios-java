package exercicios_secao_4;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_03 {

	public static void main(String[] args) {
		/**
		 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
		   de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		int valor3 = sc.nextInt();
		int valor4 = sc.nextInt();
		int diferenca = (valor1 * valor2) - (valor3 * valor4);
		
		System.out.println("DIFERENCA = " + diferenca);
		
		sc.close();
	}

}
