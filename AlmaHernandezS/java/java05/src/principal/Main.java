package principal;

/*
 * Sesion 05 Flujo de control
 */
public class Main {

	public static void main(String[] args) {
		/*
		 * boolean condicion = true; int bandera = 1; //if se ejecuta si la condicion es
		 * verdadera if(condicion) { bandera = 2;
		 * System.out.println("La condicion es verdadera"); }else { bandera = 3;
		 * System.out.println("La condicion es falsa"); }
		 * System.out.println("Valor de bandera : " +bandera);
		 * System.out.println("Se continua con otras instrucciones");
		 * 
		 * }
		 */

		// Valor entre 0 y 100
	/*	int prueba = 88;
		char calificacion = ' ';
		if (prueba >= 90) {
			calificacion = 'A';
		} else if (prueba >= 80) {
			calificacion = 'B';
		} else if (prueba >= 70) {
			calificacion = 'C';
		} else if (prueba >= 60) {
			calificacion = 'D';
		} else {
			calificacion = 'F';
		}
		System.out.println("Se continua con otras instrucciones");
		System.out.println("Calificacion = " + calificacion);
	}*/
		
		/*
		int mes = 8;
		String mesString;
		
		switch (mes) {
		case 1 : mesString = "Enero";
		break;
		case 2 : mesString = "Febrero";
		break;
		case 3 : mesString = "Marzo";
		break;
		case 4 : mesString = "Abril";
		break;
		case 5 : mesString = "Mayo";
		break;
		case 6 : mesString = "Junio";
		break;
		case 7 : mesString = "Julio";
		break;
		case 8 : mesString = "Agosto";
		break;
		case 9 : mesString = "Septiembre";
		break;
		case 10 : mesString = "Octubre";
		break;
		case 11 : mesString = "Noviembre";
		break;
		case 12 : mesString = "Diciembre";
		break;
		default : mesString = "Mes invalido";
		break;
	}
		System.out.println("Mes indicado : " +mesString);
}*/
	
		//Primavera: 3,4,5
		//Verano: 6,7,8
		//Oto�o: 9,10,11
		//Invierno: 12,1,2
		int mesCalendario = 4;
		String estacion;
		
		switch (mesCalendario) {
		case 1: case 2: case 12:
			estacion = "Invierno";
		break;
		case 3: case 4: case 5:
			estacion = "Primavera";
		break;
		case 6: case 7: case 8:
			estacion = "Verano";
		break;
		case 9: case 10: case 11:
			estacion = "Oto�o";
		break;
		default: 
			estacion = "Mes invalido";
		break;
		
		}
		System.out.println("Estacion : " +estacion);
	}
}
