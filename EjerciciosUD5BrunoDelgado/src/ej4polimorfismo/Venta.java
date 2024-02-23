package ej4polimorfismo;

import java.util.Arrays;
import java.util.List;

import ejercicio02.Socio;

public class Venta {
	
	private List <LineaDeVenta> listado;

	
	
	public Venta(List<LineaDeVenta> listado) {
		super();
		this.listado = listado;
	}

	//calculo el total de todo el ticket
	public double calcularTotal() {
		double resultado = 0;
		for(LineaDeVenta ldv : listado) {
			resultado = ldv.calcularPrecio();
		}
		return resultado;
	}
	
	public void imprimir () {
		for(LineaDeVenta ldv : listado) {
			ldv.imprimirLineaDeVenta();
			System.out.println("\n");
		}
	}
	
	public void imprimirCabecera() {
		System.out.println("Producto\tCantidad\tPrecio Unitario\t\tPrecio Final");
	}
	
	public void imprimirFinal() {
		System.out.println("Total: "+calcularTotal());
	}
	
	
	
	public void imprimirListado() {
		for(LineaDeVenta ldv : listado) {
			ldv.imprimirProductos();
		}
	}

	@Override
	public String toString() {
		return "Venta [listado=" + listado + "]";
	}

	
	
	

}
