package ejemploClub;

public class Club implements IAdministracion {

	private CRUDSocio cs;
	private String nombre;
	
	public Club(CRUDSocio cs, String nombre) {
		this.cs = cs;
		this.nombre = nombre;
	}

	public CRUDSocio getCs() {
		return cs;
	}

	public void setCs(CRUDSocio cs) {
		this.cs = cs;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Club [cs=" + cs + ", nombre=" + nombre + "]";
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
