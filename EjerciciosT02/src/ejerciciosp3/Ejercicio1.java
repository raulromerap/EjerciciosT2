package ejerciciosp3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int num;
		int suma = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		num = sc.nextInt();
		
		while(num>=0) {
			suma = suma + num;
				System.out.print("Introduce un número: ");
				num = sc.nextInt();
		}
		System.out.println("La suma total es: " + suma);
		sc.close();
	}
}
