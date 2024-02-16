package ejercicio02;

public class ClubVerano implements ITesoreria {
	private CRUDSocio cs;
	private double cuotaVerano;
	
	public ClubVerano(CRUDSocio cs, double cuotaVerano) {
		this.cs = cs;
		this.cuotaVerano = cuotaVerano;
	}

	public CRUDSocio getCs() {
		return cs;
	}

	public void setCs(CRUDSocio cs) {
		this.cs = cs;
	}


	public double getCuotaVerano() {
		return cuotaVerano;
	}

	public void setCuotaVerano(double cuotaVerano) {
		this.cuotaVerano = cuotaVerano;
	}

	@Override
	public String toString() {
		return "ClubVerano [cs=" + cs + ", cuotaVerano=" + cuotaVerano + "]";
	}
	
	public double calcularDineroGastado(int aniosEnElClub, String dni) {
		Socio s;
		s = cs.buscarPorDni(dni);
		return s.getCuota()*(aniosEnElClub)+cuotaVerano;
	}


}
