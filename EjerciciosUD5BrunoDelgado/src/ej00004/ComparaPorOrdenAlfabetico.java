package ej00004;

import java.util.Comparator;


public class ComparaPorOrdenAlfabetico implements Comparator <Contacto> {

	@Override
	public int compare(Contacto c1, Contacto c2) {
		// TODO Auto-generated method stub
		return c1.getNombre().compareTo(c2.getNombre());
	}
	
}
