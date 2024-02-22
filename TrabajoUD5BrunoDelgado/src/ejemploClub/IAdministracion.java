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
	
	private double calcularPagosExtra(int opcion, double pagoVerano, double pagoInvierno) {
		if(opcion==1) {
			return pagoVerano;
		}if(opcion==2) {
			return pagoInvierno;
		}if(opcion==3) {
			return pagoVerano+pagoInvierno;
		}else {
			return 0;
		}
	}
	
	default double calcularPrimerPago(double matricula, int temporadaAlta, double extraTemporada, double cuota, int opcion, double pagoVerano, double pagoInvierno) {
		return calcularPagoEntrada(matricula, temporadaAlta, extraTemporada) + cuota + calcularPagosExtra(opcion, pagoVerano, pagoInvierno);
	}
	

	
	
	
	
}
