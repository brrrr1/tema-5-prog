package ejerciciolunes4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
	
	public Set<Trastero> buscarPorPrecio (double precio) {
		Set <Trastero> mismoPrecio = new HashSet<Trastero>();
		for (Trastero trastero : lista) {
			if(trastero.getPrecio()==precio) {
				mismoPrecio.add(trastero);
				
			}
		}
		return mismoPrecio;
	}
	
	public Trastero buscarPorNum (int numTrastero) {
		for (Trastero trastero : lista) {
			if(trastero.getNumTrastero() == numTrastero) {
			return trastero;
			}
		}
	
	return null;
	}
	
	public List <Trastero> devolverMasCaro() {
		Trastero masCaro = null;
		List <Trastero> masCaros = new ArrayList<>();
		for (Trastero trastero : lista) {
			if (masCaro == null || trastero.getPrecio() > masCaro.getPrecio()) {
				masCaro = trastero;
				masCaros.add(masCaro);
				
			}
		}
		return masCaros;
	}
	
	public void eliminarTrastero(int numTrastero) {
		lista.remove(buscarPorNum(numTrastero));
	}
	
	public void modificarTrastero(int numTrastero, double precio) {
		if(buscarPorNum(numTrastero)!=null) {
			buscarPorNum(numTrastero).setPrecio(precio);
		}
		
		
	}
	
	public void mostrarNoOcupados() {
		for (Trastero trastero : lista) {
			if (!trastero.isOcupado()) {
				System.out.println(trastero);
			}
		}
	}
	
	public void verLista() {
		for (Trastero trastero : lista) {
			System.out.println(trastero);
		}
	}
	
}
