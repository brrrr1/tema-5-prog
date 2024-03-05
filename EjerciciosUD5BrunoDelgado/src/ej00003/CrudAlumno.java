package ej00003;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CrudAlumno {

	private Set <Alumno> lista;

	public CrudAlumno(Set<Alumno> lista) {
		super();
		this.lista = lista;
	}

	public Set<Alumno> getLista() {
		return lista;
	}

	public void setLista(Set<Alumno> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudAlumno [lista=" + lista + "]";
	}
	
	public void agregar (Alumno a) {
		lista.add(a);
	}
	
	public void borrar (int id) {
		lista.remove(buscarPorId(id));
	}
	
	public Alumno buscarPorId (int id) {
		for (Alumno alumno : lista) {
			if(alumno.getId()==id) {
				return alumno;
			}
		}
		return null;
	}
	
	public void modificarNombre (String nuevoNombre, int id) {
		buscarPorId(id).setNombre(nuevoNombre);
	}
	
	public Set<Alumno> verAlumnosConMismoNombre(String nombre){
		Set <Alumno> listaNombreCompartido = new HashSet<>();
		for (Alumno alumno : listaNombreCompartido) {
			if(alumno.getNombre().equalsIgnoreCase(nombre)) {
				listaNombreCompartido.add(alumno);
			}
		}
		return listaNombreCompartido;
	}
	

}
