package mx.com.generation;

import java.util.ArrayList;

public class ArrayListCollection {

	public static void main(String[] args) {
		
		//Una lista es una colecci�n ordenada
		//la cual permite elementos duplicados
		//El contenido de ArrayList puede ser din�mico
		//Puede aumentar su tama�o

		//Definimos un Array6List de tipo String
		//Entre <> se define el tipo de dato envolvente
		ArrayList<String> cars = new ArrayList<String>();
		
		System.out.println(cars);
		
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("Tsuru");
		
		System.out.println(cars);
		
		//Obtenemos el tama�o de ArrayList
		int size = cars.size();
		System.out.println(size);
		
		//Obtenemos el dato "Tsuru"
		String miAuto = cars.get(4);
		System.out.println("Mi auto rom�ntico: " + miAuto);
		
		//Eliminar el auto "Ford"
		cars.remove(2);
		System.out.println(cars);
		
		//Iterar todos los elementos en ciclo for
		for(int i=0; i < cars.size(); i++) {
			System.out.println("Te regalo el auto: " + cars.get(i));
		}
		
		//Otra forma de iterar con for
		for(String car : cars) {
			System.out.println("Auto " + car);
		}
		
		//Tercera forma de iterar usando forEach
		cars.forEach(car -> {
			System.out.println("Autos en forEach: " + car);
		});
		
	}

}
