package ejerciciosp2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		String n1, n2;
		int resultado;
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el número de la primera tirada (PALABRA): ");
		n1 = sc.next();
		System.out.print("Introduzca el número de la segunda tirada (PALABRA): ");
		n2 = sc.next();
		
		num1 = switch(n1) {
			case "UNO" ->{
				yield 1;
			}
			case "DOS" ->{
				yield 2;
			}
			case "TRES" ->{
				yield 3;
			}
			case "CUATRO" ->{
				yield 4;
			}
			case "CINCO" ->{
				yield 5;
			}
			case "SEIS" ->{
				yield 6;
			}
			default ->{
				System.out.println("Error. Introduzca de nuevo el valor");
				yield -1;
			}
		};
		num2 = switch(n2) {
			case "UNO" ->{
				yield 1;
			}
			case "DOS" ->{
				yield 2;
			}
			case "TRES" ->{
				yield 3;
			}
			case "CUATRO" ->{
				yield 4;
			}
			case "CINCO" ->{
				yield 5;
			}
			case "SEIS" ->{
				yield 6;
			}
			default ->{
				System.out.println("Error. Introduzca de nuevo el valor");
				yield -1;
			}
		};
		if (num1 >= 1 && num1 <=6 || num2 >= 1 && num2 <=6) {
			resultado = num1 + num2;
			System.out.println("El resultado de las tiradas es: " + resultado);	
		}else {
			System.err.println("ERROR");
		}
		
		sc.close();
	}
}
