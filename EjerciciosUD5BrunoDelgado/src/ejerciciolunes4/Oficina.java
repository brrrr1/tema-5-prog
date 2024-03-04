package ejerciciolunes4;

import java.util.Iterator;
import java.util.List;

public class Oficina {
	
	private List <Trastero>lista;

	public Oficina(List<Trastero> lista) {
		super();
		this.lista = lista;
	}

	public List<Trastero> getLista() {
		return lista;
	}

	public void setLista(List<Trastero> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Oficina [lista=" + lista + "]";
	}
	
	public void agregar (Trastero t) {
		lista.add(t);
	}
	
	public Trastero buscarPorPrecio (double precio) {
		for (Trastero trastero : lista) {
			if(trastero.getPrecio()==precio) {
				return trastero;
			}
		}
		return null;
	}
	
	public Trastero buscarPorNum (int numTrastero) {
		for (Trastero trastero : lista) {
			if(trastero.getNumTrastero() == numTrastero) {
			return trastero;
			}
		}
	
	return null;
	}
	
	public Trastero devolverMasCaro() {
		Trastero masCaro = null;
		
		for (Trastero trastero : lista) {
			masCaro = trastero;
			if(trastero.getPrecio() > masCaro.getPrecio()) {
				masCaro = trastero;
			}
		}
		return masCaro;	
		}
	
	public void eliminarTrastero(int numTrastero) {
		Trastero t;
		t = buscarPorNum(numTrastero);
		lista.remove(t);
	}
	
	public void modificarTrastero(int numTrastero, double precio) {
		Trastero t;
		t = buscarPorNum(numTrastero);
		t.setPrecio(precio);
		
	}
	
	public void mostrarNoOcupados() {
		for (Trastero trastero : lista) {
			if (!trastero.isOcupado()) {
				System.out.println(trastero);
			}
		}
	}
	
}
