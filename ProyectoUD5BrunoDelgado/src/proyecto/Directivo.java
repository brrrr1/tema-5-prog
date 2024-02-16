package proyecto;

public class Directivo implements IFichajes {

	private int idDirectivo;
	private double sueldoDirectivo;
	
	
	public Directivo(int idDirectivo, double sueldoDirectivo) {
		this.idDirectivo = idDirectivo;
		this.sueldoDirectivo = sueldoDirectivo;
	}


	public int getIdDirectivo() {
		return idDirectivo;
	}


	public void setIdDirectivo(int idDirectivo) {
		this.idDirectivo = idDirectivo;
	}


	public double getSueldoDirectivo() {
		return sueldoDirectivo;
	}


	public void setSueldoDirectivo(double sueldoDirectivo) {
		this.sueldoDirectivo = sueldoDirectivo;
	}


	@Override
	public String toString() {
		return "Directivo [idDirectivo=" + idDirectivo + ", sueldoDirectivo=" + sueldoDirectivo + "]";
	}
	
	
	
	
	
}

