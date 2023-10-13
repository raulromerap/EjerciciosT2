package ejerciciosp3;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un número: ");
		num = sc.nextInt();
		
		while(num<0 || num>0) {
			if(num % 2 == 0) {
				System.out.println( num + " es par");
			}else {
				System.out.println( num + " es impar");
			}
				System.out.print("Introduzca un número: ");
				num = sc.nextInt();
		}
		System.out.println("El programa ha cerrado");
		sc.close();
	}
}
