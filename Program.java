package application;

import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Entre com as medidas de x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com as medidas de  y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.area();
		
		
		double areaY = y.area();
		
		System.out.printf("Triângulo X area: %.4f%n", areaX);
		System.out.printf("Triângulo Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("A maior área: X");
		}
		else {
			System.out.println("A maior área: Y");
		}
		
		sc.close();
	}

}
