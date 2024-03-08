package ejemploLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		String mensaje = "Hola";
		IBienvenida bienvenida = x -> System.out.println(x);
		bienvenida.mostrarBienvenida(mensaje);
		
		int a = 5;

		
		ISuma suma = z -> z+2;
		System.out.println(suma.sumar(a));
		
		//Ahora un proveedor (supplier)
		Supplier <Double> sup = () -> 50.0;
		
		System.out.println(sup.get());
		
		//Ahora un consumer
		List <String> nombres = new ArrayList<>();
		nombres.add("Messi");
		nombres.add("Anuel");
		nombres.add("Luismi");
		nombres.add("Victor");
		
		String palabra = "Palabra";
		Consumer<String> con = (p) -> System.out.println(p);
		for (String string : nombres) {
			con.accept(string);
			
		//Ahora un function
			
		}
	}

}
