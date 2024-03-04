package ejerciciolunes4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Trastero> lista = new ArrayList <Trastero>();
		
		lista.add(new Trastero (12, "Calle A", 1, 1000, false));
		lista.add(new Trastero (7, "Calle B", 2, 650, true));
		lista.add(new Trastero (9, "Calle C", 3, 1200, false));
		lista.add(new Trastero (10, "Calle D", 4, 900, true));
		
		Oficina o = new Oficina (lista);
		
		int numTrastero = 5;
		
		int eleccion,
			opcionOcupado;
		double capacidad,
				precio;
		String direccion;
		boolean ocupado;

		
		do {
			System.out.println("""
					
					1) Añadir trastero
					2) Buscar por precio
					3) Buscar por numero
					4) Buscar trastero más caro
					5) Eliminar un trastero
					6) Modificar precio de un trastero
					7) Ordenar trasteros por numero
					8) Ordenar por precio (mayor a menor)
					9) Ver trasteros no ocupados
					10) Ver todos los treasteros
					
					0) Salir
					
					""");
			eleccion=Leer.datoInt();
			switch(eleccion) {
			case 1:
				System.out.println("Di capacidad");
				capacidad=Leer.datoDouble();
				System.out.println("Diga direccion");
				direccion=Leer.dato();
				System.out.println("Diga precio");
				precio=Leer.datoDouble();
				System.out.println("¿Está ocupado? 1 SI 0 NO");
				opcionOcupado = Leer.datoInt();
				if(opcionOcupado==1) {
					ocupado = true;
				}else {
					ocupado = false;
				}
				Trastero t = new Trastero (capacidad, direccion, numTrastero, precio, ocupado);
				numTrastero++;
				o.agregar(t);
				
				break;
				
			case 2:
				System.out.println("Diga precio");
				precio=Leer.datoDouble();
				System.out.println(o.buscarPorPrecio(precio));
				
				break;
				
			case 3:
				System.out.println("Diga número");
				numTrastero=Leer.datoInt();
				System.out.println(o.buscarPorNum(numTrastero));
				
				break;
				
			case 4:
				System.out.println(o.devolverMasCaro());
				
				break;
				
			case 5:
				System.out.println("Diga número");
				numTrastero=Leer.datoInt();
				o.eliminarTrastero(numTrastero);
				
				break;
				
			case 6:
				System.out.println("Diga número");
				numTrastero=Leer.datoInt();
				System.out.println("Diga nuevo precio");
				precio=Leer.datoDouble();
				o.modificarTrastero(numTrastero, precio);
				
				break;
				
			case 7:
				Collections.sort(lista);
				
				break;
				
			case 8:
				Collections.sort(lista, new ComparaPorPrecio());
				
				break;
				
			case 9:
				o.mostrarNoOcupados();
				
				break;
				
			case 10:
				o.verLista();
				
				break;
				
			case 0:
				System.out.println("Adiós");
				
				break;
				
				default:
					System.out.println("Has elegido una opción incorrecta");
			}
		}while(eleccion!=0);
	}

}
