package ejercicio06;

import java.util.Comparator;

public class ComparaPorNombre implements Comparator<Trabajador> {

	@Override
	public int compare(Trabajador t1, Trabajador t2) {
		// TODO Auto-generated method stub
		if(t1.getNombre().equalsIgnoreCase(t2.getNombre())) {
			return t1.compareTo(t2);
		}else {
			return(t1.getNombre().toLowerCase().compareTo(t2.getNombre().toLowerCase()));
		}
		
	}

}

