package ejerciciosp1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		//Constantes del resultado
		final String PIEDRA = "Piedra" , PAPEL = "Papel", TIJERAS = "Tijeras";
		
		//Variable de lo que ponga el ususario 1
		String j1;
		//Variable de lo que ponga el ususario 2
		String j2;
		//Variable del Scanner
		Scanner sc = new Scanner(System.in);
		
		//Mensaje introducción de resultado de usuario 1
		System.out.print("Usuario1: Piedra, Papel o Tijeras: ");
		//Scan del resultado
		j1 = sc.next();
		
		//Separacion de los textos
		System.out.println("\n\n\n\n\n\n");
		
		//Mensaje introducción de resultado de usuario 2
		System.out.print("Usuario2: Piedra, Papel o Tijeras: ");
		//Scan del resultado
		j2 = sc.next();
		
		//Mensaje del lo introducido
		System.out.println("Usuario1: " + j1 + " Usuario2: " + j2);
		
		//Mensaje de los resultados
		if (j1.equals(PIEDRA) && j2.equals(PIEDRA) || j1.equals(PAPEL) && j2.equals(PAPEL) || j1.equals(TIJERAS) && j2.equals(TIJERAS)) {
			System.out.println("Empate");
		}else if (j1.equals(PIEDRA) && j2.equals(PAPEL) || j1.equals(PAPEL) && j2.equals(TIJERAS) || j1.equals(TIJERAS) && j2.equals(PIEDRA)) {
			System.out.println("Usuario2 Gana");
		}else if (j1.equals(PIEDRA) && j2.equals(TIJERAS) || j1.equals(PAPEL) && j2.equals(PIEDRA) || j1.equals(TIJERAS) && j2.equals(PAPEL)) {
			System.out.println("Usuario1 Gana");
		}else {
			System.err.println("ERROR");
		}
		//Cierre Scanner
		sc.close();
	}

}
