package ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Mazo {

	private List <Carta> lista;

	public Mazo(List<Carta> lista) {
		super();
		this.lista = lista;
	}

	public List<Carta> getLista() {
		return lista;
	}

	public void setLista(List<Carta> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Mazo [lista=" + lista + "]";
	}
	
	public Carta buscarPorNumeroYPalo(int numCarta, String palo) {
		for (Carta carta : lista) {
			//Busca por la lista una carta que tenga el palo y número introducido por teclado y la vuelve.
			if(carta.getPalo().equalsIgnoreCase(palo) && carta.getNumCarta()==numCarta) {
				return carta;
			}
		}
		//Si no la encuentra, devuelve null y hay un mensaje en el main.
		return null;
	}
	
	public List<Carta> buscarValorNulo(){
		
		List<Carta> valorNulo = new ArrayList<Carta>();
		
		Iterator<Carta> ite = lista.iterator();
		Carta c;
		while(ite.hasNext()) {
			c=ite.next();
			//Va calculando 1 por 1 la puntuación de las cartas con el método en la clase POJO
			//Si la puntuación es 0, añade la carta a una lista que instancio en el método, que es la que más tarde devuelvo.
			if(c.calcularPuntuacion()==0) {
				valorNulo.add(c);
			}
		}
		return valorNulo;
	}
	
	public int calcularPuntuacionTotal() {
		int total=0;
		//Instancio una variable int, a la que se le va sumando el valor de todas las cartas.
		for (Carta carta : lista) {
			total = total + carta.calcularPuntuacion();
		}
		//Devuelvo la variable donde se han almacenado los valores de todas las cartas.
		return total;
	}
	
	public void modificarNombre(int numCarta, String palo, String nuevoNombre) {
		//Seteo un nuevo nombre en una carta buscada.
		buscarPorNumeroYPalo(numCarta,palo).setNombre(nuevoNombre);	
	}
	
	public void verLista() {
		//Entre este método y el toString lo dejo medianamente bonito.
		Iterator<Carta> ite = lista.iterator();
		System.out.println("----------------------------MAZO----------------------------");
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		System.out.println("------------------------------------------------------------");
		System.out.println();
	}
	
	public void ordenarPorPalo() {
		//Ordena la lista por criterio natural, es decir, por el método compareTO de la clase POJO.
		Collections.sort(lista);
	}
	
	public void ordenarPorPuntiacion() {
		//Ordena la lista por criterio no natural, mediante la clase ComparaPorPuntuacion.
		Collections.sort(lista, new ComparaPorPuntuacion());
	}
	
	
}
