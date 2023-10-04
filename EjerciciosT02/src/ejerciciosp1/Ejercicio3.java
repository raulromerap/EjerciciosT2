package ejerciciosp1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Variables
		float n1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el número decimal: ");
		n1 = sc.nextFloat();
		
		if(n1 < 1 && n1 > -1) {
			System.out.println("Es un número casi cero");
		}else if (n1 == 0) {
			System.out.println("No es un número casi cero");
		}else {
			System.out.println("No es un número casi cero");
		}
		sc.close();
	}
}
