package ejerciciosp1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		int j1;
		int j2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Usuario1: 1.Piedra 2.Papel 3.Tijeras: ");
		j1 = sc.nextInt();
		
		System.out.println("\n\n\n\n\n\n");
		
		System.out.print("Usuario2: 1.Piedra, 2.Papel o 3.Tijeras: ");
		j2 = sc.nextInt();
		
		System.out.println("Usuario1: " + j1 + " Usuario2: " + j2);
		
		if (j1 == 1 && j2 == 1 ) {
			System.out.println("Empate");
		}else if (j1 == 2 && j2 == 2 ) {
			System.out.println("Empate");
		}else if (j1 == 3 && j2 == 3 ) {
			System.out.println("Empate");
		}else if (j1 == 1 && j2 == 2) {
			System.out.println("Usuario2 Gana");
		}else if (j1 == 2 && j2 == 3) {
			System.out.println("Usuario2 Gana");
		}else if (j1 == 3 && j2 == 1) {
			System.out.println("Usuario2 Gana");
		}else if (j1 == 1 && j2 == 3) {
			System.out.println("Usuario1 Gana");
		}else if (j1 == 2 && j2 == 1) {
			System.out.println("Usuario1 Gana");
		}else if (j1 == 3 && j2 == 2) {
			System.out.println("Usuario1 Gana");
		}else {
			System.err.println("ERROR");
		}
		
		sc.close();
	}

}
