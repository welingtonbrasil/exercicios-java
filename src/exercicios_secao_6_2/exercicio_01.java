package exercicios_secao_6_2;

import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
		/**
		 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os �mpares de 1 at� X, um valor por linha, inclusive o
		X, se for o caso.
		 */
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int resto = 0;
		for(int i = 0; i<x; i++) {
			resto = i % 2;
			if(resto != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
