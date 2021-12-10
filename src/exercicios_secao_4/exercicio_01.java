package exercicios_secao_4;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
		/**
		 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
m			ensagem explicativa, conforme exemplos.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor1 = sc.nextDouble();
		double valor2 = sc.nextDouble();
		double resultado = valor1 + valor2;
		
		System.out.println("SOMA = " + resultado);
		
		sc.close();

	}

}
