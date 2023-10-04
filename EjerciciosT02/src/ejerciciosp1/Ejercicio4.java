package ejerciciosp1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Variables
		int n1;
		int n2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el primer número: ");
		n1 = sc.nextInt();
		System.out.print("Introduce el segundo número: ");
		n2 = sc.nextInt();
		
		if(n1 < n2) {
			System.out.println(n1 + " < " + n2);
		}else {
			System.out.println(n2 + " < " + n1);
		}
		sc.close();
	}
}
