package ejemploClub;

public class ClubInvierno implements IAdministracion{
	private CRUDSocio cs;

	

	public ClubInvierno(CRUDSocio cs) {
		super();
		this.cs = cs;
	}

	public void setCs(CRUDSocio cs) {
		this.cs = cs;
	}

	@Override
	public String toString() {
		return "ClubInvierno [cs=" + cs + "]";
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
