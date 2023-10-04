package ejerciciosp1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		//Variable
		double nota;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce tu nota: ");
		nota = sc.nextDouble();
		
		if(nota >= 0 && nota < 5) {
			System.out.print(nota + " es Insuficiente");
		}else if (nota >= 5 && nota < 6) {
			System.out.print(nota + " es Suficiente");
		}else if (nota >= 6 && nota < 7) {
			System.out.print(nota + " es Bien");
		}else if (nota >= 7 && nota < 9) {
			System.out.print(nota + " es Notable");
		}else if (nota >= 9 && nota <= 10) {
			System.out.print(nota + " es Sobresaliente");
		}else {
			System.out.println("Has insertado mal los datos");
		}
		sc.close();
	}

}
