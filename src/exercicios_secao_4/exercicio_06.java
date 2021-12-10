package exercicios_secao_4;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_06 {

	public static void main(String[] args) {
		/**
		 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
		mostre:
		a) a área do triângulo retângulo que tem A por base e C por altura.
		b) a área do círculo de raio C. (pi = 3.14159)
		c) a área do trapézio que tem A e B por bases e C por altura.
		d) a área do quadrado que tem lado B.
		e) a área do retângulo que tem lados A e B.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double pi = 3.14159;
		
		double areaTriangulo = (a * c)/2;
		double areaCirculo = pi * Math.pow(c, 2);
		double areaTrapezio = ((a + b) * c)/2;
		double areaQuadrado = Math.pow(b, 2);
		double areaRetangulo = a * b;
		
		System.out.printf("Triangulo: %.3f%n",areaTriangulo);
		System.out.printf("Circulo: %.3f%n",areaCirculo);
		System.out.printf("Trapezio: %.3f%n",areaTrapezio);
		System.out.printf("Quadrado: %.3f%n",areaQuadrado);
		System.out.printf("Retangulo: %.3f%n",areaRetangulo);
		
		sc.close();
		

	}

}
