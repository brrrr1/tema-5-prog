package ejercicio06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Trabajador> trabajadores = new ArrayList<Trabajador>();
		
		trabajadores.add(new Trabajador("Cristiano", "CR7", 10, 15000));
		trabajadores.add(new Trabajador("Bruno", "1A", 30, 2000));
		trabajadores.add(new Trabajador("Bruno", "2A", 65, 1520));
		trabajadores.add(new Trabajador("Messi", "3A", 45, 3200));
		
		
		/*System.out.println("POR SUELDO:");
		System.out.println();
		Collections.sort(trabajadores);
		for (Trabajador t : trabajadores) {
			System.out.println(t);
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("POR HORAS DE MENOR A MAYOR:");
		System.out.println();
		Collections.sort(trabajadores, new ComparaPorHoras());
		for (Trabajador t : trabajadores) {
			System.out.println(t);
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("POR HORAS DE MAYOR A MENOR:");
		System.out.println();
		Collections.sort(trabajadores, new ComparaPorHorasDesc());
		for (Trabajador t : trabajadores) {
			System.out.println(t);
		}*/
		
		System.out.println("COMPARA POR NOMBRE. SI SON IGUALES COMPARA POR SUELDO:");
		System.out.println();
		Collections.sort(trabajadores, new ComparaPorNombre());
		for (Trabajador t : trabajadores) {
			System.out.println(t);
		}
	}

}
