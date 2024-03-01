package ejerciciotipoexamen;

import java.util.Comparator;

public class OrdenaPorOrdenAlfabetico implements Comparator <Palabra>{

	@Override
	public int compare(Palabra p1, Palabra p2) {
		// TODO Auto-generated method stub
		return -(p1.getNombre().toLowerCase().compareTo(p2.getNombre().toLowerCase()));
	}

}
