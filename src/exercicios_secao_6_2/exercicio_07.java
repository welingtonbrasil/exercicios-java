package exercicios_secao_6_2;

import java.util.Scanner;

public class exercicio_07 {

	public static void main(String[] args) {
		/**
		 * Fazer um programa para ler um n�mero inteiro positivo N. O programa deve ent�o mostrar na tela N linhas,
		come�ando de 1 at� N. Para cada linha, mostrar o n�mero da linha, depois o quadrado e o cubo do valor, conforme
		exemplo.
		 */
		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextInt();
		double quadrado = 0;
		double cubo = 0;
		
		for (double i = 1; i <= n; i++) {
			quadrado = Math.pow(i,2);
			cubo = Math.pow(i,3);
			System.out.printf("%.0f %.0f %.0f%n",i,quadrado,cubo);
		}
		sc.close();

	}

}
