package Principal;

/**
 * Sesi�n 05 Flujo de control
 * 
 * @author TuX3
 *
 */
public class Main {

	public static void main(String[] args) {

		boolean condicion = false;
		// Se puede usar solo la estrucura if
		// comando r�pido if + ctrl + space
		if (condicion) {
			System.out.println("La condici�n es verdadera");
		}

		System.out.println("Se prosigue con otras instrucciones");

		// Tambi�n, es posible usar if else
		if (condicion == true) {
			// Se ejecutar� este bloque si la condici�n es verdadera
			// La estructura podr�a quedar if (condicion){ }
			System.out.println("La condici�n es verdadera");
		} else {
			// si la condici�n es falsa, se ejecuta este bloque
			System.out.println("La condici�n es falsa");
		}
		System.out.println("Se prosigue con otras instrucciones");

		int numero = 4;

		if (numero == 0) {
			System.out.println("El n�mero es cero");
		} else if (numero == 1) {
			System.out.println("El n�mero es uno");
		} else if (numero >= 2 && numero <= 20) {
			System.out.println("N�mero est� en rago de 2 a 20");
		} else {
			System.out.println("N�mero no es 0, 1, ni est� en rango de 2 a 20 ");
		}
		
		//El switch puede ser condici�n num�rica o String.
		// se tiene que usar beak, para romper a continuaci�n de los sig. casos
		int seleccion = 4;
		String seleccionTxt = "";
		
		switch (seleccion) {
		case 1:
			seleccionTxt = "Selecci�n uno";
			break;
		case 2:
			seleccionTxt = "Selecci�n dos";
			break;
		case 3:
			seleccionTxt = "Selecci�n Tres";
			break;
		case 4: case 5:
			seleccionTxt = "Seleccion 4 o 5";
			break;
		default:
			seleccionTxt = "Selecci�n indeterminada";			
		}
		System.out.println("Usuario realiz�: " + seleccionTxt);
		

	}
}
