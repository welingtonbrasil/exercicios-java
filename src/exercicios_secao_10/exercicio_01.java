package exercicios_secao_10;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class exercicio_01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms well be rented? ");
		int rooms = sc.nextInt();
		String name;
		String email;	
		int busyRoom;
		
		Student[] vect = new Student[9];
		
		for (int i = 1; i <= rooms; i++) {
			System.out.print("\nRent #"+i+": ");
			
			System.out.print("\nName: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.print("E-mail: ");
			email = sc.nextLine();
			
			System.out.print("Room: ");
			busyRoom = sc.nextInt();
			
			vect[busyRoom] = new Student(name,email);
		}
		
		System.out.println("\nBusy rooms:");
		for (int i = 0; i < vect.length; i++) {
			if(vect[i] != null) {
				System.out.println(i+": "+vect[i].getName()+", "+vect[i].getEmail());				
			}
		}
		
		sc.close();

	}

}
