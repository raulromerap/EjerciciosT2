package ejerciciosp1;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		//Variables
		int n1;
		int n2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el primero número: ");
		n1 = sc.nextInt();
		System.out.print("Introduzca el segundo número: ");
		n2 = sc.nextInt();
		
		if (n1 == n2) {
			System.out.print("Los números son iguales");
		}
		else {
			System.out.print("Los números no son iguales");
		}
		sc.close();
	}
}
