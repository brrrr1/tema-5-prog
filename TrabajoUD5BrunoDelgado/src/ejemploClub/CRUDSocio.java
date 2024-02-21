package ejemploClub;


import java.util.List;


public class CRUDSocio {

	private List <Socio> lista;

	public CRUDSocio(List<Socio> lista) {
		this.lista = lista;
	}

	public CRUDSocio() {
		// TODO Auto-generated constructor stub
	}

	public List<Socio> getLista() {
		return lista;
	}

	public void setLista(List<Socio> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CRUDSocio [lista=" + lista + "]";
	}
	
	public void agregar(Socio s) {
		lista.add(s);
	}
	
	public Socio buscarPorDni(String dni) {
		boolean encontrado = false;
		int i = 0;
		while(i<lista.size() && !encontrado) {
			Socio deLista = lista.get(i);
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
	
	public void borrar(String dni) {
		if(buscarPorDni(dni)!=null) {
			lista.remove(buscarPorDni(dni));
		}
		
	}
	
	public void imprimirLista() {
		for(Socio s : lista) {
			System.out.println(s);
		}
	}
	

	
	
	
}
