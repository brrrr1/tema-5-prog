package ejercicio02;



public interface ITesoreria {
	
	public double calcularDineroGastado(int anio, String dni);
	
	private int hacerResta(int a, int b) {
		return a-b;
	}
	
	default int calcularAnios(int anioActual, int anioEntrada) {
		return hacerResta(anioActual, anioEntrada);
	}
	
	
	default double pagarCuotasAtrasadas(double cuotas, int cuotasAtrasadas) {
		return cuotas*cuotasAtrasadas;
	}
	
}
