//Un paquete es un folder donde se clafifican las clases
package clases;

//para que se puede acceder desde otras clases, 
//se debe utilizar public
public class Persona {
	// definici�n de atributos de la clase
	String apellido;
	String nombre;
	
	//El siguiente m�todo no tiene devoluci�n
	//por lo que se usa void (vac�o)
	//Los argumentos van dentro del parentesis
	public void desplegarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);	
	}
	

}
