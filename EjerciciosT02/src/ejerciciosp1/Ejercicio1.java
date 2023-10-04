package ejerciciosp1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Variables
		int n1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un número: ");
		n1 = sc.nextInt();
		
		if (n1 % 2 == 0) {
			System.out.println("El número es par");
		}
		else {
			System.out.println("El número es impar");
		}
		sc.close();
	}
}
