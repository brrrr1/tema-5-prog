package ejemploList;

import java.util.List;

public class CrudPersona {

	private List <Persona> lista;

	public CrudPersona(List<Persona> lista) {
		super();
		this.lista = lista;
	}
	
	public Persona buscarPorDni(String dni) {
		boolean encontrado = false;
		int i = 0;
		while(i<lista.size() && !encontrado) {
			Persona deLista = lista.get(i);
			if(deLista.getDni().equalsIgnoreCase(dni)) {
				encontrado = true;
			}else {
				i++;
			}
		}
		
		if(encontrado) {
			return lista.get(i);
		}else {
			return null;
		}
	}
	
	public void agregar(Persona p) {
		lista.add(p);
	}
	
	//no pasar parámetros nunca never, ni imprimimos un mensaje de se ha guardado. no se guarda e imprime a la vez
	public void agregar2(Persona p) {
		lista.add(p);
	}
	
	
	public void imprimirLista() {
		for(Persona p : lista) {
			System.out.println(p);
		}
	}
	
	public void borrar(String dni) {
		if(buscarPorDni(dni)!=null) {
			lista.remove(buscarPorDni(dni));
		}
		
	}
}
