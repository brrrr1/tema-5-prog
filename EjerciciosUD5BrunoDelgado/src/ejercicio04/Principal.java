package ejercicio04;

import java.util.HashMap;
import java.util.Map;

import utilidades.Leer;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <Contacto, String> agenda = new HashMap<>();
		Contacto c = new Contacto("Peter");
		Contacto c2 = new Contacto("Malito");
		Contacto c3 = new Contacto("Manue");
		CrudContacto cc = new CrudContacto(agenda);
		agenda.put(c, "123");
		agenda.put(c2, "456");
		agenda.put(c3, "789");
		
		String nombre=Leer.dato();
		
		System.out.println(cc.buscarPorNombre(nombre));
	}

}
