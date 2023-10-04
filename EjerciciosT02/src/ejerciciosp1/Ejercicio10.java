package ejerciciosp1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		//Variable
		int n1, n2, n3;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserte el primer número: ");
		n1 = sc.nextInt();
		System.out.print("Inserte el segundo número: ");
		n2 = sc.nextInt();
		System.out.print("Inserte el tercer número: ");
		n3 = sc.nextInt();
		
		if (n1 + n2 == n3) {
			System.out.println("La suma del primer y segundo número es igual al tercer número");
		}else if (n2 + n3 == n1){
			System.out.println("La suma del segundo y tercer número es igual al primer número");
		}else if (n3 + n1 == n2) {
			System.out.println("La suma del primer y tercer número es igual al segundo número");
		}else {
			System.out.println("Los números no tienen nada en común");
		}
		sc.close();
	}

}
