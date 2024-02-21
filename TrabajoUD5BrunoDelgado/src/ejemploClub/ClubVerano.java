package ejemploClub;

public class ClubVerano implements IAdministracion {
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

	@Override
	public double calcularAlquilerPista() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcularGastoLimpieza() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void verNumeroTrabajadores() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verObjetosPerdidos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calcularPrecioMenuDelDia() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcularGastoAspersores() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcularGastoMaterial() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void verPistasLibres() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verMaterial() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calcularGastoTorneo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calcularPremioTorneo() {
		// TODO Auto-generated method stub
		
	}
	



}
