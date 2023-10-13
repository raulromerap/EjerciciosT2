package ejerciciosp3;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int num;
		int suma = 0;
		int contador = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un número: ");
		num = sc.nextInt();
		
		contador++;
		suma = suma + num;
		
		while(contador<=10) {
			contador++;
			suma = suma + num;
				System.out.print("Introduzca un número: ");
				num = sc.nextInt();
		
		}
		System.out.println("La suma total de los 10 números es: " + suma);
		
		sc.close();
	}
}
