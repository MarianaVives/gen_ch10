package generation.mx.scanner;

import java.util.Scanner;

public class scannerTest {

	public static void main(String[] args) {
		// Declarar el objeto e inicializar con
		// el objeto de entrada est�ndar predefinido
		Scanner sc = new Scanner(System.in);
		//Entrada de una cadena
		String name = sc.nextLine();
		//Entrada de un caracter
		char gender = sc.next().charAt(0);
		
		//Entrada de datos num�ricos
		int age = sc.nextInt();
		long mobileNo = sc.nextLong();
		double promedio = sc.nextDouble();
		
		System.out.println("Nombre: "+name);
        System.out.println("G�nero: "+gender);
        System.out.println("Edad: "+age);
        System.out.println("Tel�fono: "+mobileNo);
        System.out.println("Promedio: "+promedio);

	}

}
