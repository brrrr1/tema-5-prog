package ejemploOrdenar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Esta lista tendria que estar en la clase Corredores/Carrera
		List<Corredor> corredores = new ArrayList<Corredor>();
		
		corredores.add(new Corredor(2, 1.43, "Jesse Owens"));
		corredores.add(new Corredor(1, 1.02, "Brr"));
		corredores.add(new Corredor(3, 2.43, "Anuel AA"));
		corredores.add(new Corredor(4, 3.43, "Leo Messi"));
		corredores.add(new Corredor(5, 4.43, "Martin Martin"));
		
		//Imprimimos la lista sin ordenar usando for each
		
		
		//case 2 mostrar corredores por dorsal (orden natural)
		Collections.sort(corredores);
		
		
		
		//case 3 mostrar corredores por marca
		Collections.sort(corredores, new ComparaPorMarca());
		System.out.println();
		for(Corredor con : corredores) {
			System.out.println(con);
		}
		
	}

}
