package ejerciciolunes4;

import java.util.ArrayList;
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
	
	public List<Trastero> buscarPorPrecio (double precio) {
		List <Trastero> mismoPrecio = new ArrayList<Trastero>();
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
	
	public Trastero devolverMasCaro() {
		Trastero masCaro = null;
		
		for (Trastero trastero : lista) {
			if (masCaro == null || trastero.getPrecio() > masCaro.getPrecio()) {
				masCaro = trastero;
			}
		}
		return masCaro;
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
