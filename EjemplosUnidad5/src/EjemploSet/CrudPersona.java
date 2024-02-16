package EjemploSet;

import java.util.Iterator;
import java.util.Set;

public class CrudPersona {

	private Set <Persona> lista;

	public CrudPersona(Set<Persona> lista) {
		this.lista = lista;
	}

	public Set<Persona> getLista() {
		return lista;
	}

	public void setLista(Set<Persona> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudPersona [lista=" + lista + "]";
	}
	
	public Persona buscarPorDni(String dni) {
		boolean encontrado = false;
		int i = 0;
		Persona dniBuscado;
		Iterator <Persona> ite = lista.iterator();
		while(ite.hasNext()) {
			dniBuscado = ite.next();
			
			if(dniBuscado.getDni() == dni) {
				encontrado = true;
			}else {
				encontrado = false;
			}
			
			if(encontrado) {
				return dniBuscado;
			}else {
				return null;
			}
				
		}
		return null;
		
	}
	
	/*public Persona findDni(String dni) {
		Iterator<Persona> it = lista.iterator();//Creamos el objeto it de tipo Iterator con String
		String tmpAnalizando;
		while (it.hasNext()) {//Utilizamos el método hasNext de los objetos tipo Iterator
		tmpAnalizando = it.next();//Utilizamos el método next de los objetos  	tipo Iterator
		System.out.println ("Analizando elemento... " + tmpAnalizando);
		if (tmpAnalizando.contains(cadenaBuscar)) {
		System.out.println ("Cadena encontrada!!!");
		} else { }//else vacío. No hay acciones a ejecutar.
			}
	}*/
		
	
	
}
