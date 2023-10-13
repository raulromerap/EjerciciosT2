package ejerciciosp3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Random r = new Random();
		int t;
		int num = r.nextInt(1, 101);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un número (1-100) para acertar el número secreto: ");
		t = sc.nextInt();
		
		while(t < num && t > 0) {
			System.out.println("Mayor");
				System.out.print("Introduce un número (1-100) para acertar el número secreto: ");
				t = sc.nextInt();
				if(t == -1) {
					System.out.println("Te has rendido");
				}
		}
		while(t> num && t > 0) {
			System.out.println("Menor");
				System.out.print("Introduce un número (1-100) para acertar el número secreto: ");
				t = sc.nextInt();
				if(t == -1) {
					System.out.println("Te has rendido");
				}
		}
		if(t == num) {
			System.out.println("Has acertado");
		}
		sc.close();
	}
}
