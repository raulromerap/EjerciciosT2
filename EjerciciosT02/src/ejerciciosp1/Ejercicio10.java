package ejerciciosp1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		//Variables de los números
		int n1, n2, n3;
		//Variable del Scanner
		Scanner sc = new Scanner(System.in);
		
		//Mensaje para insertar el primer número
		System.out.print("Inserte el primer número: ");
		//Scan del primer número
		n1 = sc.nextInt();
		//Mensaje para insertar el segundo número
		System.out.print("Inserte el segundo número: ");
		//Scan del segundo número
		n2 = sc.nextInt();
		//Mensaje para insertar el tercer número
		System.out.print("Inserte el tercer número: ");
		//Scan del tercer número
		n3 = sc.nextInt();
		
		//Mensajes para cuando se hace la suma y se igual (o no)
		if (n1 + n2 == n3) {
			System.out.println("La suma del primer y segundo número es igual al tercer número");
		}else if (n2 + n3 == n1){
			System.out.println("La suma del segundo y tercer número es igual al primer número");
		}else if (n3 + n1 == n2) {
			System.out.println("La suma del primer y tercer número es igual al segundo número");
		}else {
			System.out.println("Los números no tienen nada en común");
		}
		//Cierre del Scanner
		sc.close();
	}

}
