package ejerciciosp1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Variables
		double a;
		double b;
		double c;
		double calculo;
		double calculo2;
		double calculoFinal1;
		double calculoFinal2;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Introduzca el valor de a: ");
		a = sc.nextDouble();
		System.out.print("Introduzca el valor de b: ");
		b = sc.nextDouble();
		System.out.print("Introduzca el valor de c: ");
		c = sc.nextDouble();
		
		calculo = Math.pow(b, 2) -4*a*c;
		calculo2 = Math.sqrt(calculo);
		calculoFinal1 = (-b + calculo2) / (2*a);
		calculoFinal2 = (-b - calculo2) / (2*a);
		
		if (2*a == 0) {
			System.out.println("La ecuación no se puede realizar");
		}else if (calculo <= 0) {
			System.out.println("La ecuación no se puede realizar");
		}else {
			System.out.println(calculoFinal1 + " y " + calculoFinal2);
		}
		sc.close();
	}
}
