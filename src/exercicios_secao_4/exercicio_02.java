package exercicios_secao_4;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_02 {

	public static void main(String[] args) {
		/**
		 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
			casas decimais conforme exemplos.
			Fórmula da área: area = π . raio2
			Considere o valor de π = 3.14159
		 */
		 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor1 = sc.nextDouble();
		double pi = 3.14159;
		double area = pi * Math.pow(valor1, 2);
		
		System.out.printf("A = %.4f%n",area);
		
		sc.close();
	}

}
