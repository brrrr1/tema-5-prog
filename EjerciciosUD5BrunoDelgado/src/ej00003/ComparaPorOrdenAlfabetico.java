package ej00003;

import java.util.Comparator;

public class ComparaPorOrdenAlfabetico implements Comparator <Alumno> {

	@Override
	public int compare(Alumno a1, Alumno a2) {
		// TODO Auto-generated method stub
		return a1.getNombre().compareTo(a2.getNombre());
	}
	
}
