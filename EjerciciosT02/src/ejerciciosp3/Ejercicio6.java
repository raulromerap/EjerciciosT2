package ejerciciosp3;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int edad;
		double media;
		int numA = 0;
		int suma = 0;
		int mayor = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca la edad del alumno: ");
		edad = sc.nextInt();
		numA++;
		while(edad>=0) {
			suma = suma + edad;
			numA++;
			if(edad >=18) {
				mayor++;
			}
				System.out.print("Introduzca la edad del alumno: ");
				edad = sc.nextInt();
		}
		media = suma / numA;
		System.out.println("La suma total de las edades es: " + suma + " años\nLa media de las edades es de: " + media + " años\nHay un total de: " + numA + " alumnos\nDe los cuales: " + mayor + " son mayores de edad");
		
		sc.close();
	}
}
