package ejerciciosp3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int num;
		
		int contador = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		num = sc.nextInt();
		
		while (num>=0) {
			contador++;
			
			System.out.print("Introduce un número: ");
			num = sc.nextInt();
		}
		
		System.out.println("Usted ha introducido " + contador + " numeros postivos");
		sc.close();
	}
}
