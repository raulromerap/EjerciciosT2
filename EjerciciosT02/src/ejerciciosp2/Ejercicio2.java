package ejerciciosp2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Variable para el número del día
		int dia;
		//Variable para el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Mensaje para introducir el número del día
		System.out.print("Introduce el número del día: ");
		//Scan del número
		dia = sc.nextInt();
		
		//Cambio del mensaje segun el valor del número y muestra el mensaje/resultado
		switch(dia) {
			case 1 ->{
				System.out.println("Lunes");
			}
			case 2 ->{
				System.out.println("Martes");
			}
			case 3 ->{
				System.out.println("Miercoles");
			}
			case 4 ->{
				System.out.println("Jueves");
			}
			case 5 ->{
				System.out.println("Viernes");
			}
			case 6 ->{
				System.out.println("Sábado");
			}
			case 7 ->{
				System.out.println("Domingo");
			}

		}
		//Cierre del Scanner
		sc.close();
	}

}
