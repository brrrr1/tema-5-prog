package ejemploBasico;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion,
				a,
				b;
		Calculadora c =new Calculadora();
		
		System.out.println("¿Quieres sumar(1) o restar(0)?");
		opcion=Leer.datoInt();
		
		System.out.print("Número 1:");
		a=Leer.datoInt();
		System.out.println();
		System.out.print("Número 2:");
		b=Leer.datoInt();
		
		System.out.println(c.operacionSimple(a, b, opcion));
	}

}
