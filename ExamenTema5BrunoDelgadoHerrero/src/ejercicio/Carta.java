package ejercicio;

public class Carta implements Comparable<Carta>{

	private String nombre;
	private String palo;
	private int numCarta;
	
	public Carta(String nombre, String palo, int numCarta) {
		super();
		this.nombre = nombre;
		this.palo = palo;
		this.numCarta = numCarta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	public int getNumCarta() {
		return numCarta;
	}
	public void setNumCarta(int numCarta) {
		this.numCarta = numCarta;
	}

	@Override
	public String toString() {
		return "\nCarta: " + nombre + "\t| Palo:" + palo + "\t| Número: " + numCarta + "\t| Puntos: " + calcularPuntuacion();
	}
	
	//Métodos
	public int calcularPuntuacion() {
		switch(this.numCarta) {
		case 1:
			return 11;
		case 2:
			return 0;
		case 3:
			return 10;
		case 4:
			return 0;
		case 5:
			return 0;
		case 6:
			return 0;
		case 7:
			return 0;
		case 8:
			return 0;
		case 9:
			return 0;
		case 10:
			return 2;
		case 11:
			return 3;
		case 12:
			return 4;
			
			default:
				return 0;
		}
	}
	@Override
	public int compareTo(Carta c) {
		// TODO Auto-generated method stub
		//Uso el compareTo de String
		return this.palo.compareTo(c.palo);
	}
	
}
