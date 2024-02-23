package ej4polimorfismo;

public class Alimentacion extends Producto{

	private int diasParaCaducar;
	private double descuentoAlimentacion;
	public Alimentacion(double precioUnitario, String nombre, int id, int diasParaCaducar,
			double descuentoAlimentacion) {
		super(precioUnitario, nombre, id);
		this.diasParaCaducar = diasParaCaducar;
		this.descuentoAlimentacion = descuentoAlimentacion;
	}
	public int getDiasParaCaducar() {
		return diasParaCaducar;
	}
	public void setDiasParaCaducar(int diasParaCaducar) {
		this.diasParaCaducar = diasParaCaducar;
	}
	public double getDescuentoAlimentacion() {
		return descuentoAlimentacion;
	}
	public void setDescuentoAlimentacion(double descuentoAlimentacion) {
		this.descuentoAlimentacion = descuentoAlimentacion;
	}
	@Override
	public String toString() {
		return "Alimentacion [diasParaCaducar=" + diasParaCaducar + ", descuentoAlimentacion=" + descuentoAlimentacion
				+ "]";
	}
	

	public void avisarCaducidad () {
		if (diasParaCaducar <= 2) {
			System.out.println("¡APUNTO DE CADUCAR!");
		}
	}
	
	//calculo el precioUnitario según la caducidad
	public double calcularPrecioUnitario() {
		double cien = 100;
		if(diasParaCaducar >=2) {
			return super.calcularPrecioUnitario()-super.calcularPrecioUnitario()*descuentoAlimentacion/cien;
		}else{
			return super.calcularPrecioUnitario();
		}
	}
	
	public void imprimirProducto() {
		super.imprimirProducto(); 
		System.out.print("\t\tDías para caducar: "+diasParaCaducar+"\t\tDescuento: "+descuentoAlimentacion+"\t\t");
		avisarCaducidad();
		
	}
}
