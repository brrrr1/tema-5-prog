package ej4polimorfismo;

public class Tienda {

	private Producto p;

	public Tienda(Producto p) {
		this.p = p;
	}

	public Producto getP() {
		return p;
	}

	public void setP(Producto p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "Tienda [p=" + p + "]";
	}
	
	public void add() {
		
	}
	
}
