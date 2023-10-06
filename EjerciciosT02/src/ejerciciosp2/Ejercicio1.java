package ejerciciosp2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Variable para la nota
		int nota;
		//Variable para el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Mensaje para introducir la nota
		System.out.print("Introduce la nota: ");
		//Scan de la nota
		nota = sc.nextInt();
		
		//Probabilidades según el valor de la nota y mensaje con el resultado
		switch(nota) {
			case 0, 1, 2, 3, 4 ->{
				System.out.println("Insuficiente");
			}
			case 5 ->{
				System.out.println("Suficiente");
			}
			case 6 ->{
				System.out.println("Bien");
			}
			case 7, 8 ->{
				System.out.println("Notable");
			}
			case 9, 10 ->{
				System.out.println("Sobresaliente");
			}
			default ->{
				System.out.println("No has introducido bien la nota");
			}
		}
		//Cierre del Scanner
		sc.close();
	}
}
