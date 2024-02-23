package ej4polimorfismo;

public class Electronica extends Producto {
	
	private double impuestoElectronica;

	public Electronica(double precioUnitario, String nombre, int id, double impuestoElectronica) {
		super(precioUnitario, nombre, id);
		this.impuestoElectronica = impuestoElectronica;
	}

	public double getImpuestoElectronica() {
		return impuestoElectronica;
	}

	public void setImpuestoElectronica(double impuestoElectronica) {
		this.impuestoElectronica = impuestoElectronica;
	}

	@Override
	public String toString() {
		return "Electronica [impuestoElectronica=" + impuestoElectronica + "]";
	}
	
	//calculo el precio con el impuesto
	public double calcularPrecioUnitario() {
		double cien=100;
		return super.calcularPrecioUnitario()+super.calcularPrecioUnitario()*impuestoElectronica/cien;
	}
	
	public void imprimirProducto() {
		super.imprimirProducto(); 
		System.out.print("\t\tImpuesto: "+impuestoElectronica+"\n");
		
	}

}
