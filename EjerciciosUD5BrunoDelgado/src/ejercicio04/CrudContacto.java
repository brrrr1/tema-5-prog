package ejercicio04;

import java.util.Map;
import java.util.Set;

import ejercicio02.Socio;

public class CrudContacto {

	private Map <Contacto, String> agenda;

	public Map<Contacto, String> getAgenda() {
		return agenda;
	}

	public void setAgenda(Map<Contacto, String> agenda) {
		this.agenda = agenda;
	}

	public CrudContacto(Map<Contacto, String> agenda) {
		super();
		this.agenda = agenda;
	}

	@Override
	public String toString() {
		return "CrudContacto [agenda=" + agenda + "]";
	}
	
	public void agregar(Contacto c, String tlf) {
		agenda.put(c, tlf);
	}
	

	
	
	public Contacto buscarPorNombre (String nombre) {	
		
		Contacto c = null;
		Set <Contacto> claves = agenda.keySet();
		for (Contacto conct : claves ) {
			if(conct.getNombre().equals(nombre)) {
				c = conct;
			}
		
		}
		return c;
		
	}
}
