package principal;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Definimos una variable booleana
		boolean result = true;
		//Definimos una variable de tipo caracter, se DEBE escribir con ap�strofe
		char capitalC = 'C';
	    // Definimos una variable de tipo byte
		byte b = 100;
		//Definimos una variable de tipo short
		short s = 10000;
		//DEfinimos una varibale de tipo int, representaci�n decimal
		int intVal = 26;
		//Definimos una varible de tipo int, representaci�n hexadecimal
		int hexVal = 0x1a;
		//Definimos una variable de tipo int, representaci�n binaria
		int binVal = 0b11010;
		//Definimos una variable de tipo int, representaci�n octal
		int octVal = 032;
		
		int variableBinSeparada= 0b1011_10_11;
		int variableHexSeparada=10_20;
		System.out.println("holo");
		System.out.println(Integer.toBinaryString(intVal));
		System.out.println(Integer.toHexString(hexVal));
		System.out.println("Valor m�ximo de un long: "+Long.MAX_VALUE);
		System.out.println("Valor m�nimo de un long: "+Long.MIN_VALUE);
		System.out.println("Valor en bytes que tiene un long: "+Long.BYTES);
		System.out.println("Valor m�ximo de un short: "+Short.MAX_VALUE);
		var unicodigo='\u006D';
	}

}
