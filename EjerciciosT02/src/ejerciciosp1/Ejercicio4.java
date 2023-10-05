package ejerciciosp1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Variable para el primer número
		int n1;
		//variable para el segundo número
		int n2;
		//Variable para el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Mensaje para introducir el primer número
		System.out.print("Introduce el primer número: ");
		//Scan del primer número
		n1 = sc.nextInt();
		//Mensaje para introducir el primer número
		System.out.print("Introduce el segundo número: ");
		//Scan del segundo número
		n2 = sc.nextInt();
		//Cálculo y mensaje del resultado final
		if(n1 < n2) {
			System.out.println(n1 + " < " + n2);
		}else {
			System.out.println(n2 + " < " + n1);
		}
		//Ciere del Scanner
		sc.close();
	}
}
