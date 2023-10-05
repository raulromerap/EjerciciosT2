package ejerciciosp1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Variable para el primer número
		int n1;
		//Variable para el segundo número
		int n2;
		//Variable para el tercer número
		int n3;
		//Variable del Scanner
		Scanner sc = new Scanner(System.in);
		
		//Mensaje para incertar el primer número
		System.out.print("Introduce el primer número: ");
		//Scan del primer número
		n1 = sc.nextInt();
		//Mensaje para incertar el segundo número
		System.out.print("Introduce el segundo número: ");
		//Scan del segundo número
		n2 = sc.nextInt();
		//Mensaje para incertar el tercer número
		System.out.print("Introduce el tercer número: ");
		//Scan del tercer número
		n3 = sc.nextInt();
		
		//Calculo y mensaje del resultado final
		if(n1 > n2 && n1 > n3 && n2 > n3) {
			System.out.println(n1 + " > " + n2 + " > " + n3);
		}else if (n1 > n2 && n1 > n3 && n3 > n2){
			System.out.println(n1 + " > " + n2 + " > " + n3);
		}else if (n3 > n2 && n3 > n1 && n2 > n1){
			System.out.println(n3 + " > " + n2 + " > " + n1);
		}else if (n3 > n2 && n3 > n1 && n1 > n2){
			System.out.println(n3 + " > " + n1 + " > " + n2);
		}else if (n2 > n1 && n2 > n3 && n3 > n1){
			System.out.println(n2 + " > " + n3 + " > " + n1);
		}else{
			System.out.println(n2 + " > " + n1 + " > " + n3);
		}
		//Ciere del Scanner
		sc.close();
	}
}
