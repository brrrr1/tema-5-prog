package ej00004;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import ejercicio04.Contacto;
import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre, nuevoNombre;
		
		Map <Contacto, String> agenda = new HashMap<>();
		
		agenda.put(new Contacto ("Manolo", 1), "123456789");
		agenda.put(new Contacto ("Manolo", 2), "987654322");
		agenda.put(new Contacto ("Manolín", 3), "111122223");
		
		Agenda a = new Agenda(agenda);
		
		a.verAgenda();
		
		nombre = Leer.dato();
		
		System.out.println(a.buscarPorNombreLista(nombre));
		
		System.out.println("****************");
		System.out.println();
	
		nombre = Leer.dato();
		
		nuevoNombre = Leer.dato();
		
		a.modificarNombre(nombre, nuevoNombre);
		
		a.verAgenda();
		
		System.out.println("id para buscar");
		
		int id=Leer.datoInt();
		
		System.out.println(a.buscarPorId(id));
		

	}

}
