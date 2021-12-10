package exercicios_secao_4;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_04 {

	public static void main(String[] args) {
		/**
		 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		   hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
		   decimais.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario = sc.nextInt();
		int horas = sc.nextInt();
		double valorPorHora = sc.nextDouble();
		double calculoSalario = horas * valorPorHora;
		
		System.out.println("Numer = " + numeroFuncionario);
		System.out.println("Salary = U$ " + calculoSalario);

		sc.close();
	}

}
