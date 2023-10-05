package ejerciciosp1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Variable para a
		double a;
		//Variable para b
		double b;
		//Variable para c
		double c;
		//Variable para calcular el contenido dentro de la raíz
		double calculo;
		//Variable para calcular la raíz
		double calculo2;
		//Variable para calcular el primer resultado
		double calculoFinal1;
		//Variable para calcular el segundo resultado
		double calculoFinal2;
		//Variable del Scanner
		Scanner sc = new Scanner(System.in);
		
		//Mensaje para introducir el valor de a
		System.out.print("Introduzca el valor de a: ");
		//Scan de a
		a = sc.nextDouble();
		//Mensaje para introducir el valor de b
		System.out.print("Introduzca el valor de b: ");
		//Scan de b
		b = sc.nextDouble();
		//Mensaje para introducir el valor de c
		System.out.print("Introduzca el valor de c: ");
		//Scan de c
		c = sc.nextDouble();
		
		//Calculo del interior de la raiz
		calculo = Math.pow(b, 2) -4*a*c;
		//Calculo de la raiz
		calculo2 = Math.sqrt(calculo);
		//Calculo del primer resultado
		calculoFinal1 = (-b + calculo2) / (2*a);
		//Calculo del segundo resultado
		calculoFinal2 = (-b - calculo2) / (2*a);
		
		//Calculo y resultado final, mas posibles errores
		if (2*a == 0) {
			System.out.println("La ecuación no se puede realizar");
		}else if (calculo <= 0) {
			System.out.println("La ecuación no se puede realizar");
		}else {
			System.out.println(calculoFinal1 + " y " + calculoFinal2);
		}
		//Ciere del Scanner
		sc.close();
	}
}
