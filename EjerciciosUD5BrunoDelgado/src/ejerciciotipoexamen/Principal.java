package ejerciciotipoexamen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Palabra> diccionario = new ArrayList<>();
		
		Diccionario d = new Diccionario (diccionario);
		
		diccionario.add(new Palabra (1, "Speak", "Hablar"));
		diccionario.add(new Palabra (2, "Jump", "Saltar"));
		diccionario.add(new Palabra (3, "Sausage", "Chalchicha"));
		diccionario.add(new Palabra (4, "For", "para"));
		
		int eleccion;
		String nombre;
		String significado;
		int id=5;
		
		do {
			System.out.println("""
			
					1) Ver diccionario completo
					2) Buscar una palabra
					3) Añadir una palabra al diccionario
					4) Modificar significado de una palabra
					5) Ordenar diccionario por orden alfabético
					6) Borrar una palabra del diccionario
					
					0) Salir
					
					""");

			eleccion = Leer.datoInt();
			
			switch(eleccion) {
			case 1:
				d.mostrarDiccionario();
				break;
				
			case 2:
				System.out.println("Diga nombre");
				nombre=Leer.dato();
				
				Palabra p;
				p = d.buscarPorNombre(nombre);
				
				System.out.println();
				
				System.out.println("PALABRA\t\tSIGNIFICADO");
				System.out.println(p.getNombre()+"\t\t"+p.getSignificado());
				
				System.out.println();
				break;
				
			/*case 3:

				System.out.print("Palabra en inglés:");
				nombre=Leer.dato();
				System.out.print("Significado en español:");
				significado=Leer.dato();

				
				Palabra pal = new Palabra(id, nombre, significado);
				d.agregar(pal, significado);
				id++;
				break;*/
				
			case 4:
				
				System.out.println("Diga palabra para cambiar significado");
				nombre=Leer.dato();
				
				
				System.out.println("Indique nuevo significado");
				significado=Leer.dato();
				
				System.out.println();
				
				d.modificarSignificado(significado, d.buscarPorNombre(nombre));
				
				break;
				
			case 5:
				
				Collections.sort(diccionario, new OrdenaPorOrdenAlfabetico());
				break;
				
			case 6:
				System.out.println("¿Qué palabra quiere borrar?");
				nombre=Leer.dato();
				d.borrarPalabra(nombre);
				break;
				
			
				
			case 0:
				System.out.println("Adiós");
				break;
				
				default:
					System.out.println("Opción incorrecta, pruebe de nuevo.");
			}
			
		}while(eleccion!=0);
	}

}
