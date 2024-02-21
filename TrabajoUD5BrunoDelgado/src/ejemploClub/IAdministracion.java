package ejemploClub;



public interface IAdministracion {
	
	public double calcularAlquilerPista();
	
	public double calcularGastoLimpieza();
	
	public void verNumeroTrabajadores();
	
	public void verObjetosPerdidos(); 
	
	public double calcularPrecioMenuDelDia();
	
	public double calcularGastoAspersores();
	
	public double calcularGastoMaterial();
	
	public void verPistasLibres();
	
	public void verMaterial();
	
	public void calcularGastoTorneo();
	
	public void calcularPremioTorneo();
	
	
	

	
	private double calcularPagoEntrada (double matricula, int temporadaAlta, double extraTemporada) {
		if(temporadaAlta == 1) {
			return matricula + extraTemporada;
		}if(temporadaAlta == 0) {
			return matricula;
		}else {
			return 0;
		}
	}
	
	default double calcularPrimerPago(double matricula, int temporadaAlta, double extraTemporada, double cuota) {
		return calcularPagoEntrada(matricula, temporadaAlta, extraTemporada) + cuota;
	}
	

	
	
	
	
}
