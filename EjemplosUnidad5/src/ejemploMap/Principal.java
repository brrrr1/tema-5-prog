package ejemploMap;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		
		Map <String, String> lista = new HashMap <> ();
		 
		Set<String> listaClaves = lista.keySet();
		
		Collection sin <String> listaValores = lista.values();
		
		lista.put("Uno", "One");
		lista.put("Uno", "Oneee");
		lista.put("Un0", "One");
		lista.put("Dos", "Two");
		
		System.out.println(lista);
		
		System.out.println();
		
		System.out.println("Claves:");
		System.out.println();
		System.out.println(listaClaves);
		
		System.out.println();
		
		System.out.println("Valores:");
		System.out.println();
		System.out.println(listaValores);
		
		*/
		
		
		// num Clase, alumno
		Map <Integer, Alumno> lista = new HashMap<>();
		
		//Set<Entry<Integer, Alumno>>set2 = lista.entrySet();
		
		Alumno a = new Alumno (1, "Brrr", 3.3);
		
		lista.put(6, a);
		
		System.out.println(lista);
		
		a.setNombre("Anuel AA");
		
		System.out.println();
		
		System.out.println(lista);
		
		System.out.println(a);  
		
		
	}

}
