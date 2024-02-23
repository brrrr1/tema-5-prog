package ej4polimorfismo;

public class Producto {

	private double precioUnitario;
	private String nombre;
	private int id;
	
	public Producto(double precioUnitario, String nombre, int id) {
		this.precioUnitario = precioUnitario;
		this.nombre = nombre;
		this.id = id;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Producto [precioUnitario=" + precioUnitario + ", nombre=" + nombre + ", id=" + id + "]";
	}
	
	//creo el método que voy a reescribir en las clases hijas
	public double calcularPrecioUnitario() {
		return precioUnitario;
	}
	
	public void imprimirProducto() {
		System.out.printf("id: "+id+"\t\tNombre: "+nombre+"\t\tPrecio Unitario: %.2f",precioUnitario);
	}
	
	
	
}
