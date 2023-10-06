package ejerciciosp2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		double n1, n2;
		
		double suma, resta, multi, div;
		
		String calculo, respuesta;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el primer número: ");
		n1 = sc.nextDouble();
		System.out.print("Introduce el segundo número: ");
		n2 = sc.nextDouble();
		
		System.out.println("Selecciona el cálculo que quieres realizar \nA.SUMAR LOS NÚMEROS \nB.RESTAR LOS NÚMEROS \nC.MULTIPLICAR LOS NÚMEROS \nD.DIVIDIR LOS NÚMEROS");
		calculo = sc.next();
		
		switch(calculo) {
			case "A" ->{
				System.out.print("¿Estas seguro/a que quieres SUMAR los números \n-? ");
				respuesta = sc.next();
				switch(respuesta) {
					case "Sí" ->{
						suma = n1 + n2;
						System.out.println("El resultado es: " + suma);
					}
					case "No" ->{
						System.err.println("ERROR");
					}
				}
			}
			case "B" ->{
				System.out.print("¿Estas seguro/a que quieres RESTAR los números \n-? ");
				respuesta = sc.next();
				switch(respuesta) {
					case "Sí" ->{
						resta = n1 - n2;
						System.out.println("El resultado es: " + resta);
					}
					case "No" ->{
						System.err.println("ERROR");
					}
				}
			}
			case "C" ->{
				System.out.print("¿Estas seguro/a que quieres MULTIPLICAR los números? \n- ");
				respuesta = sc.next();
				switch(respuesta) {
					case "Sí" ->{
						multi = n1 * n2;
						System.out.println("El resultado es: " + multi);
					}
					case "No" ->{
						System.err.println("ERROR");
					}
				}
			}
			case "D" ->{
				System.out.print("¿Estas seguro/a que quieres DIVIDIR los números \n-? ");
				respuesta = sc.next();
				switch(respuesta) {
					case "Sí" ->{
						div = n1 / n2;
						System.out.println("El resultado es: " + div);
					}
					case "No" ->{
						System.err.println("ERROR");
					}
				}
			}
		}
		//Cierre de Scanner
		sc.close();
	}

}
