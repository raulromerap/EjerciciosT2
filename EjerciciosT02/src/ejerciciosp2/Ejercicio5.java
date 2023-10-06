package ejerciciosp2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		String categoria;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe el tipo de categoria de carnet de conducir tienes: ");
		categoria = sc.next();
		
		switch(categoria) {
			case "E" ->{
				System.out.println("Usted puede conducir remolques");
			}
			case "D" ->{
				System.out.println("Usted puede conducir autobuses");
			}
			case "C1", "C2", "C3", "C4", "C5" ->{
				System.out.println("Usted puede conducir camiones");
			}
			case "A" ->{
				System.out.println("Usted puede conducir motocicletas");
			}
			case "B1", "B2" ->{
				System.out.println("Usted puede conducir automóviles");
			}
			default ->{
				System.out.println("Categoria no contemplada");
			}
		}
		
		sc.close();
	}

}
