package ejerciciosp1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Variable para el primer número
		float n1;
		//Variable para el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Mensaje para introducir el número
		System.out.print("Introduzca el número decimal: ");
		//Scan del número
		n1 = sc.nextFloat();
		
		//Calculo y mensaje del resultado
		if(n1 < 1 && n1 > -1) {
			System.out.println("Es un número casi cero");
		}else if (n1 == 0) {
			System.out.println("No es un número casi cero");
		}else {
			System.out.println("No es un número casi cero");
		}
		//Ciere del Scanner
		sc.close();
	}
}
