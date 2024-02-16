package EjemploSet;

import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set <Persona> lista = new HashSet <Persona>();
		
		/*lista.add("Uno");
		lista.add("Dos");
		lista.add("Uno");
		lista.add("Tres");
		lista.add("Catorce");
		
		System.out.println(lista);
		
		lista.remove("Tres");
		
		System.out.println(lista);
		
		
		System.out.println(	lista.contains("Uno"));*/
		
		
		//Ahora con personas
		lista.add(new Persona ("Ángel", 34, "1A"));
		lista.add(new Persona ("Rafa", 37, "1B"));
		lista.add(new Persona ("Miguel", 67, "69"));
		
		System.out.println(lista);
		
		
		
	}

}
