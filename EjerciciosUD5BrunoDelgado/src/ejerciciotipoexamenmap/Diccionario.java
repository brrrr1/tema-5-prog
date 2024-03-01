package ejerciciotipoexamenmap;

import java.util.Iterator;
import java.util.Map;

import ejerciciotipoexamen.Palabra;

public class Diccionario {

	private Map <Palabra, String> diccionario;

	public Diccionario(Map<Palabra, String> diccionario) {
		super();
		this.diccionario = diccionario;
	}

	public Map<Palabra, String> getDiccionario() {
		return diccionario;
	}

	public void setDiccionario(Map<Palabra, String> diccionario) {
		this.diccionario = diccionario;
	}

	@Override
	public String toString() {
		return "Diccionario [diccionario=" + diccionario + "]";
	}
	
	public void verDiccionario() {
		Palabra p;
		
		
	}
}
