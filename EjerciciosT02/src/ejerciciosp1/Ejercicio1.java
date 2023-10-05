package ejerciciosp1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Variable del número
		int n1;
		//Variable del Scanner
		Scanner sc = new Scanner(System.in);
		
		//Mensaje para introducir el número
		System.out.print("Introduzca un número: ");
		//Scan del números
		n1 = sc.nextInt();
		//Mensajes para saber cuando es par o impar
		if (n1 % 2 == 0) {
			System.out.println("El número es par");
		}else {
			System.out.println("El número es impar");
		}
		//Ciere del Scanner
		sc.close();
	}
}
