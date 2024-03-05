package ejercicio04;
public class Contacto {
	private String nombre;
	private int id;

	
	public Contacto(String nombre, int id) {
		super();
		this.nombre = nombre;
		this.id = id;
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
		return "Contacto [nombre=" + nombre + ", id=" + id + "]";
	}

	
	
	
}
