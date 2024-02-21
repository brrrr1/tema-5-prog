package ejemploSuperHeroes;

public interface ISuperPoderes {

	private void imprimirVolando() {
		System.out.println("¡Estás volando!");
	}
	
	default void volar() {
		imprimirVolando();
	}
}
