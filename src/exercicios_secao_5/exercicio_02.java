package exercicios_secao_5;

import java.util.Scanner;

public class exercicio_02 {

	public static void main(String[] args) {
		/**
		 * Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
		 */
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int resto = numero % 2;
		
		if(resto == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
		
		sc.close();
	}

}
