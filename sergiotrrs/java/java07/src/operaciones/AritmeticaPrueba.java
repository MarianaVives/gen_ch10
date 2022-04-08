package operaciones;

public class AritmeticaPrueba {

	public static void main(String[] args) {
		Aritmetica operacion = new Aritmetica();
		operacion.a = 3;
		operacion.b = 2;
		operacion.sumar();

		int resultado = operacion.sumanConReturn();
		System.out.println("Con return :" + resultado);
		imprimirResultado(resultado);
		
		System.out.println( Math.round(5.5));
		System.out.println("Aleatorio :"+operacion.numeroRandom(100));
	}

	// Declarar una funci�n en psvm
	static void imprimirResultado(int valor) {
		System.out.println("Impresi�n en funci�n :"+valor);
	}

}
