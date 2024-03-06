package ejercicio;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Carta> lista = new ArrayList<Carta>();
		
		lista.add(new Carta("As", "Oros", 1));
		lista.add(new Carta("Sota", "Bastos", 10));
		lista.add(new Carta("Tres", "Bastos", 3));
		lista.add(new Carta("Rey", "Copas", 12));
		lista.add(new Carta("Siete", "Espadas", 7));
		lista.add(new Carta("Dos", "Copas", 2));
		lista.add(new Carta("Cuatro", "Oros", 4));
		lista.add(new Carta("Nueve", "Espadas", 9));
		
		Mazo m = new Mazo(lista);
		
		int eleccion;
		int numCarta;
		String palo;
		String nombre;
		
		System.out.println("""
				**********************BRISCA**********************
				*						 *
				*						 *
				*						 *
				*						 *
				*						 *												
				*						 *
				*						 *
				*						 *
				*						 *
				*						 *
				********************BIENVENIDO********************
				""");
		
		do {
			System.out.println("""
					1) Ver tu mazo
					2) Ver cartas de tu mazo de valor 0
					3) Calcular puntación total del mazo
					4) Modificar nombre de una carta
					5) Ordenar el mazo por palo
					6) Ordenar el mazo por puntuación
					
					0) Salir
					""");
			
			eleccion=Leer.datoInt();
			
			switch(eleccion) {
				
			case 1:
				m.verLista();
				break;
				
			case 2:
				System.out.println("De tu mazo, estas son las cartas con valor nulo:");
				System.out.println(m.buscarValorNulo());
				break;	
				
			case 3:
				System.out.println("La puntuación total del mazo es de "+m.calcularPuntuacionTotal()+" puntos.");
				break;
				
			case 4:
				System.out.println("Diga número:");
				numCarta=Leer.datoInt();
				
				System.out.println("Diga palo (en plural: oros, espadas...)");
				palo=Leer.dato();
				
				System.out.println("Diga nuevo nombre:");
				nombre=Leer.dato();
				
				if(m.buscarPorNumeroYPalo(numCarta, palo)!=null) {
					m.modificarNombre(numCarta, palo, nombre);
				}else {
					System.out.println("No existe esa carta.");
				}
				
				
				break;
				
			case 5:
				m.ordenarPorPalo();
				m.verLista();
				break;
				
			case 6:
				m.ordenarPorPuntiacion();
				m.verLista();
				break;
				
			case 0:
				System.out.println("Adiós.");
				break;
				
				default:
					System.out.println("Opción incorrecta. Pruebe de nuevo.");
			}

		}while(eleccion!=0);
	}

}
