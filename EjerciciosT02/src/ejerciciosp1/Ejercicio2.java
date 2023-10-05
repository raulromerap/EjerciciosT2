package ejerciciosp1;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		//Variable para el primer número
		int n1;
		//Variable para el segundo número
		int n2;
		//Variable para el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Mensaje para introducir el primer número
		System.out.print("Introduzca el primero número: ");
		//Scan del primer número
		n1 = sc.nextInt();
		//Mensaje para introducir el primer número
		System.out.print("Introduzca el segundo número: ");
		//Scan del segundo número
		n2 = sc.nextInt();
		
		//Calculo y mesaje del resultado
		if (n1 == n2) {
			System.out.print("Los números son iguales");
		}
		else {
			System.out.print("Los números no son iguales");
		}
		//Ciere del Scanner
		sc.close();
	}
}
