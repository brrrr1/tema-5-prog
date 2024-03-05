package ej00004;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ejercicio04.Contacto;

public class Agenda {

	private Map <Contacto, String> agenda;
	
	

	public Agenda(Map<Contacto, String> agenda) {
		super();
		this.agenda = agenda;
	}

	public Map<Contacto, String> getAgenda() {
		return agenda;
	}

	public void setAgenda(Map<Contacto, String> agenda) {
		this.agenda = agenda;
	}

	@Override
	public String toString() {
		return "Agenda [agenda=" + agenda + "]";
	}
	
	public void agregar (Contacto c, String tlf) {
		agenda.put(c, tlf);
	}
	
	public void borrar (Contacto c, String tlf) {
		agenda.remove(c, tlf);
	}
	
	public void verAgenda() {
		System.out.println(agenda);
	}


	public List<Contacto> buscarPorNombreLista (String nombre) {		
		List <Contacto> lista = new ArrayList<Contacto>();
		for (Contacto contacto : agenda.keySet()) {
			if(contacto.getNombre().equalsIgnoreCase(nombre)) {
				lista.add(contacto);
			}
		}
		return lista;
	}
	
	public Contacto buscarPorId(int id) {
		for (Contacto contacto : agenda.keySet()) {
			if(contacto.getId()==id) {
				return contacto;
			}
		}
		return null;
	}
	
	public void modificarNombre(String nombre, String nuevoNombre) {
		for (Contacto contacto : agenda.keySet()) {
			if(contacto.getNombre().equalsIgnoreCase(nombre)) {
				contacto.setNombre(nuevoNombre);
			}
		}
	}
	
	
	
}
