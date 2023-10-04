package ejerciciosp1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Variables
		int numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		numero = sc.nextInt();
		
		if(numero >= 0 && numero <= 9) {
			System.out.println("El número tiene una cifra");
		}else if (numero >= 10 && numero <= 99) {
			System.out.println("El número tiene dos cifras");
		}else if (numero >= 100 && numero <= 999) {
			System.out.println("El número tiene tres cifras");
		}else if (numero >= 1000 && numero <= 9999) {
			System.out.println("El número tiene cuatro cifras");
		}else if (numero >= 10000 && numero <= 99999) {
			System.out.println("El número tiene cinco cifras");
		}else {
			System.out.println("El número no está registrado");
		}
		sc.close();
	}
}
