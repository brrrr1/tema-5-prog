package ejemploList;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dni;
		
		List <Persona> lista = new ArrayList<>();
		
		Persona p = new Persona("Ermenegildo", 8, "123");
		
		lista.add(new Persona("Cristiano", 39, "777"));
		
		lista.add(new Persona("Ermenegildo", 8, "123"));
		
		lista.add(new Persona("Ermenegildo", 8, "123"));
		
		CrudPersona cp = new CrudPersona(lista);
		
		/*System.out.println(lista);
		
		System.out.println();
		
		System.out.println(lista.get(1));*/
		
		cp.imprimirLista();
		
		System.out.println("Diga dni para buscar");
		
		dni=Leer.dato();
		

		
		System.out.println(cp.buscarPorDni(dni));
		
		System.out.println("Diga dni para borrar");
		
		dni=Leer.dato();
		cp.borrar(dni);
		
		cp.imprimirLista();
	}

}
