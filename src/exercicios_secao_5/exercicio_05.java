package exercicios_secao_5;

import java.util.Scanner;

public class exercicio_05 {

	public static void main(String[] args) {
		/**
		 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
		seguir, calcule e mostre o valor da conta a pagar.
		 */
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double preco1 = 4.0;
		double preco2 = 4.5;
		double preco3 = 5.0;
		double preco4 = 2.0;
		double preco5 = 1.5;
		
		double total = 0;
		
		if(codigo == 1) {
			total = preco1 * quantidade;
		} else if(codigo == 2) {
			total = preco2 * quantidade;
		} else if(codigo == 3) {
			total = preco3 * quantidade;
		} else if(codigo == 4) {
			total = preco4 * quantidade;
		} else if(codigo == 5) {
			total = preco5 * quantidade;
		} else {
			System.out.println("Código inválido");
		}
		
		System.out.printf("Total: R$ %.2f%n",total);
		
		sc.close();
	}

}
