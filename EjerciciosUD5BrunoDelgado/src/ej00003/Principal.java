package ej00003;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set <Alumno> lista = new HashSet <>();
		
		lista.add(new Alumno (1, "Paco"));
		lista.add(new Alumno (2, "Manolo"));
		lista.add(new Alumno (3, "Evaristo"));
		
		CrudAlumno ca = new CrudAlumno(lista);
		int id = 4;
		String nombre=Leer.dato();
		Alumno a = new Alumno (id, nombre);
		ca.agregar(a);
		
		System.out.println("Id para borrar");
		id=Leer.datoInt();
		ca.borrar(id);
		
		System.out.println("Id para modificar");
		id=Leer.datoInt();
		System.out.println("Nuevo nombre");
		nombre=Leer.dato();
		ca.modificarNombre(nombre, id);
		
		
		System.out.println("Ver alumnos con nombre");
		System.out.println(ca.verAlumnosConMismoNombre(nombre));
		
		
		
	}

}
