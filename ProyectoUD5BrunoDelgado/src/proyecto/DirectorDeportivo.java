package proyecto;

public class DirectorDeportivo extends Directivo {

	private double extraDD;

	public DirectorDeportivo(int idDirectivo, double sueldoDirectivo, double extraDD) {
		super(idDirectivo, sueldoDirectivo);
		this.extraDD = extraDD;
	}

	public double getExtraDD() {
		return extraDD;
	}

	public void setExtraDD(double extraDD) {
		this.extraDD = extraDD;
	}

	@Override
	public String toString() {
		return "DirectorDeportivo [extraDD=" + extraDD + "]";
	}
	
	
	
}
