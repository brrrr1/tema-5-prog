package proyecto;

public class OjeadorEmpleado extends Ojeador{

	private double horasTrabajadas;
	private double kmHechos;
	public OjeadorEmpleado(int idOjeador, double sueldoOjeador, double horasTrabajadas, double kmHechos) {
		super(idOjeador, sueldoOjeador);
		this.horasTrabajadas = horasTrabajadas;
		this.kmHechos = kmHechos;
	}
	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}
	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	public double getKmHechos() {
		return kmHechos;
	}
	public void setKmHechos(double kmHechos) {
		this.kmHechos = kmHechos;
	}
	@Override
	public String toString() {
		return "OjeadorEmpleado [horasTrabajadas=" + horasTrabajadas + ", kmHechos=" + kmHechos + "]";
	}
	
	public double OjearJugador(int continente, double gastoOjeo) {
		return super.OjearJugador(continente, gastoOjeo)+horasTrabajadas*0.15+kmHechos*0.3;
	}
}
