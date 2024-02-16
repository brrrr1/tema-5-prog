package proyecto;

public class OjeadorJefe extends Ojeador {

	private double extraJefe;

	public OjeadorJefe(int idOjeador, double sueldoOjeador, double extraJefe) {
		super(idOjeador, sueldoOjeador);
		this.extraJefe = extraJefe;
	}

	public double getExtraJefe() {
		return extraJefe;
	}

	public void setExtraJefe(double extraJefe) {
		this.extraJefe = extraJefe;
	}

	@Override
	public String toString() {
		return "OjeadorJefe [extraJefe=" + extraJefe + "]";
	}
	
	public double OjearJugador(int continente, double gastoOjeo) {
		return super.OjearJugador(continente, gastoOjeo);
	}
	
	
}
