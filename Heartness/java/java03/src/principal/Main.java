package principal;

public class Main {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
				
		// Definimos una variable booleana
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
		
		int binValSeparado = 0b1011_10_11;
		int intValSeparado = 123_345;
		
		System.out.println(intValSeparado);
		System.out.println(hexVal);
		System.out.println(binVal);
		System.out.println( Integer.toBinaryString(intVal));
		System.out.println( Integer.toHexString(intVal));
		System.out.println("Max Long " + Long.MAX_VALUE);
		System.out.println("Max Long " + Long.BYTES);
		System.out.println("Max Long " + Long.MIN_VALUE);
		System.out.println("Max Long " + Long.SIZE);
	}

}
