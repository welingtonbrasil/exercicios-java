package exercicios_secao_5;

import java.util.Scanner;

public class exercicios_01 {

	public static void main(String[] args) {
		/**
		 * Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.
		 */
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if(numero >= 0) {
			System.out.println("N�o negativo");
		} else {
			System.out.println("Negativo");
		}
		
		sc.close();
	}

}
