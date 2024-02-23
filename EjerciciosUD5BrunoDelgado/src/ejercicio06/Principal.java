package ejercicio06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Trabajador> trabajadores = new ArrayList<Trabajador>();
		
		trabajadores.add(new Trabajador("NOMBRE", "1A", 30, 1700));
		trabajadores.add(new Trabajador("NOMBRE2", "2A", 65, 1520));
		trabajadores.add(new Trabajador("NOMBRE3", "3A", 45, 3200));
		
		
		System.out.println("POR SUELDO:");
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
		}
	}

}
