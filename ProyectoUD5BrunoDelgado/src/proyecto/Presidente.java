package proyecto;

public class Presidente extends Directivo {

	private int aniosDePresidencia;

	public Presidente(int idDirectivo, double sueldoDirectivo, int aniosDePresidencia) {
		super(idDirectivo, sueldoDirectivo);
		this.aniosDePresidencia = aniosDePresidencia;
	}

	public int getAniosDePresidencia() {
		return aniosDePresidencia;
	}

	public void setAniosDePresidencia(int aniosDePresidencia) {
		this.aniosDePresidencia = aniosDePresidencia;
	}

	@Override
	public String toString() {
		return "Presidente [aniosDePresidencia=" + aniosDePresidencia + "]";
	}
	
	
}
