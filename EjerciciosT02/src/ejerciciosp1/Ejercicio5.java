package ejerciciosp1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Variables
		int n1;
		int n2;
		int n3;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el primer número: ");
		n1 = sc.nextInt();
		System.out.print("Introduce el segundo número: ");
		n2 = sc.nextInt();
		System.out.print("Introduce el tercer número: ");
		n3 = sc.nextInt();
		
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
		sc.close();
	}
}
