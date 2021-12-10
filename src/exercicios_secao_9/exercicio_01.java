package exercicios_secao_9;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class exercicio_01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta;
		double valor = 0;
		
		System.out.print("Numero da conta: ");
		int numConta = sc.nextInt();
		System.out.print("Titular da conta: ");
		sc.nextLine();
		String titular = sc.nextLine();
		
		conta = new Conta(numConta,titular);
		
		System.out.print("Tem deposito inicial?(s/n): ");
		char opcao = sc.next().charAt(0);
		
		if(opcao == 's') {
			System.out.print("Informe o valor: ");
			valor = sc.nextDouble();
			conta = new Conta(numConta,titular,valor);
		}else {
			System.out.println("Conta sem valor inicial");
			conta = new Conta(numConta,titular);
		}
		
		System.out.println("Dados da conta:");
		System.out.println(conta);
		
		System.out.print("\nDeposite um valor: ");
		valor = sc.nextDouble();
		conta.Deposito(valor);
		System.out.println("Atualização da conta: ");
		System.out.println(conta);
		
		System.out.print("\nSaque um valor: ");	
		valor = sc.nextDouble();
		conta.Saque(valor);
		System.out.println("Atualização da conta: ");
		System.out.println(conta);
		
		
		sc.close();

	}

}
