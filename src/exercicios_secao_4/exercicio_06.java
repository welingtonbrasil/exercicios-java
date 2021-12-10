package exercicios_secao_4;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_06 {

	public static void main(String[] args) {
		/**
		 * Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e
		mostre:
		a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
		b) a �rea do c�rculo de raio C. (pi = 3.14159)
		c) a �rea do trap�zio que tem A e B por bases e C por altura.
		d) a �rea do quadrado que tem lado B.
		e) a �rea do ret�ngulo que tem lados A e B.
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
