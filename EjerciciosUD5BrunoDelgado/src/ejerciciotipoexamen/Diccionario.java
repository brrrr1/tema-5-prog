package ejerciciotipoexamen;

import java.util.Iterator;
import java.util.List;

import ejercicio02.Socio;
import ejercicio06.Trabajador;

public class Diccionario {

	private List <Palabra> palabras;

	public Diccionario(List<Palabra> palabras) {
		super();
		this.palabras = palabras;
	}

	public List<Palabra> getPalabras() {
		return palabras;
	}

	public void setPalabras(List<Palabra> palabras) {
		this.palabras = palabras;
	}

	@Override
	public String toString() {
		return "Diccionario [palabras=" + palabras + "]";
	}
	
	
	//Métodos
	public void mostrarDiccionario() {
		
		Palabra p;
		
		Iterator <Palabra> ite = palabras.iterator();
		while(ite.hasNext()) {
			p = ite.next();
			System.out.println(p);
		}
	
	}
	
	public Palabra buscarPorNombre(String nombre) {
		boolean encontrado = false;
		int i = 0;
		while(i<palabras.size() && !encontrado) {
			if(palabras.get(i).getNombre().equalsIgnoreCase(nombre)) {
				encontrado = true;
			}else {
				i++;
			}
		}
		
		if(encontrado) {
			return palabras.get(i);
		}else {
			return null;
		}
	}
	
	public void agregar (Palabra p, String significado) {
		Iterator <Palabra> ite = palabras.iterator();
		Palabra palabraParaRecorrerElIterator;
		while(ite.hasNext()) {
			palabraParaRecorrerElIterator = ite.next();
			
			if (p.getNombre().equalsIgnoreCase(palabraParaRecorrerElIterator.getNombre())){
				
				palabraParaRecorrerElIterator.setSignificado(palabraParaRecorrerElIterator.getSignificado()+", "+significado);				
			}
		}
		while(!ite.hasNext()) {
			if(!p.getNombre().equalsIgnoreCase(palabraParaRecorrerElIterator.getNombre()));
		}
		
	}
	
	public void modificarSignificado(String significado, Palabra p) {
		p.setSignificado(significado);
	}
	
	public void borrarPalabra (String nombre) {
		if (buscarPorNombre(nombre) != null) {
			palabras.remove(buscarPorNombre(nombre));
		}
	}
	
	
	
	

}
