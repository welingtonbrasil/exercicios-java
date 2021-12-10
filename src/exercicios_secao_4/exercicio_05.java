package exercicios_secao_4;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_05 {

	public static void main(String[] args) {
		/**
		 * Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o
		   c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1 = sc.nextInt();
		int quantidadePeca1 = sc.nextInt();
		double valorUnitarioPeca1 = sc.nextDouble();
		double totalPeca1 = valorUnitarioPeca1 * quantidadePeca1;
		
		int codigoPeca2 = sc.nextInt();
		int quantidadePeca2 = sc.nextInt();
		double valorUnitarioPeca2 = sc.nextDouble();
		double totalPeca2 = valorUnitarioPeca2 * quantidadePeca2;
		
		double totalGeral = totalPeca1 + totalPeca2;
		
		System.out.printf("Valor a pagar: R$ %.2f%n", totalGeral);
		
		sc.close();

	}

}
