package exercicios_secao_8;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class exercicio_04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("preço do dollar? ");
		double dollar = sc.nextDouble();
		System.out.print("quantos dolares? ");
		double valor = sc.nextDouble();
		System.out.println("valor em rais a ser pago: R$"+CurrencyConverter.converter(dollar, valor));
		
		sc.close();

	}

}
