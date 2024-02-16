package proyecto;

public class Ojeador implements IFichajes {

	private int idOjeador;
	private double sueldoOjeador;
	
	public Ojeador(int idOjeador, double sueldoOjeador) {
		this.idOjeador = idOjeador;
		this.sueldoOjeador = sueldoOjeador;
	}

	public int getIdOjeador() {
		return idOjeador;
	}

	public void setIdOjeador(int idOjeador) {
		this.idOjeador = idOjeador;
	}

	public double getSueldoOjeador() {
		return sueldoOjeador;
	}

	public void setSueldoOjeador(double sueldoOjeador) {
		this.sueldoOjeador = sueldoOjeador;
	}

	@Override
	public String toString() {
		return "Ojeador [idOjeador=" + idOjeador + ", sueldoOjeador=" + sueldoOjeador + "]";
	}
	
	public double OjearJugador(int continente, double gastoOjeo) {
		/*
		 * 1Europa
		 * 2Africa
		 * 3Sudamérica
		 * 4Norteamerica
		 * 5Asia
		 */
		double costoFinal;
		switch(continente) {
		case 1:
			costoFinal = gastoOjeo*1.5;
			return costoFinal;
			
		case 2:
			costoFinal = gastoOjeo*2;
			return costoFinal;
			
		case 3:
			costoFinal = gastoOjeo*1.75;
			return costoFinal;
			
		case 4:
			costoFinal = gastoOjeo*1.6;
			return costoFinal;
			
		case 5:
			costoFinal = gastoOjeo*1.8;
			return costoFinal;
		}
		return 0;
	}
	
	
}
