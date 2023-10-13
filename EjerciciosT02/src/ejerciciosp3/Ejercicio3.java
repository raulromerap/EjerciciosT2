package ejerciciosp3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int num;
		int suma = 0;
		int contador = 0;
		double media;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		num = sc.nextInt();
		
		while(num>=0) {
			contador++;
			suma = suma + num;
			
				System.out.print("Introduzca un número: ");
				num = sc.nextInt();
		}
		media = suma/contador;
		System.out.println("La media de los números es: " + media);
		sc.close();
	}
}
