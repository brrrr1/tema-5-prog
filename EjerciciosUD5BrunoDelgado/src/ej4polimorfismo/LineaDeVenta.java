package ej4polimorfismo;

public class LineaDeVenta {
	
	private Producto p;
	private int cantidad;
	
	public LineaDeVenta(Producto p, int cantidad) {
		this.p = p;
		this.cantidad = cantidad;
	}
	
	//calculo el precio por cantidad. al meter un producto, este utilizará el meetodo reescrito que le corresponda (alimentacion o electronica)
	public double calcularPrecio() {
		return cantidad*p.calcularPrecioUnitario();
	}
	
	
	public void imprimirLineaDeVenta() {
		//System.out.println(p.getNombre()+"\t\t"+cantidad+"\t\t"+p.calcularPrecioUnitario()+"\t"+calcularPrecio());
		System.out.printf(p.getNombre()+"\t\t"+cantidad+"\t\t%.2f\t\t\t%.2f",p.calcularPrecioUnitario(),calcularPrecio());
	}
	
	public void imprimirProductos() {
		p.imprimirProducto();
	}
	
	
	
	

}
