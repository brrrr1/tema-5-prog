package ejercicio02;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Socio> lista = new ArrayList();
		CRUDSocio cs = new CRUDSocio(lista);
		Club c = new Club(cs, "Club Brrr");
		ClubVerano cv = new ClubVerano(cs, 300);
		int eleccion;
		String dni;
		String nombre;
		String apellidos;
		double cuota;
		int anioEntrada;
		int anioActual;
		int aniosEnElClub;
		int opcion;
		int cuotasAtrasadas;
		double cuotas;
		do {
			System.out.println("""
					1) Añadir nuevo socio
					2) Ver lista
					3) Modificar cuota de un socio
					4) Borrar un socio
					5) Calcular total gastado por un socio
					6) Para pagar tus cuotas atrasadas
					0) Salir
					""");
			eleccion=Leer.datoInt();
			switch(eleccion) {
			
			case 1:
				System.out.println("Diga dni");
				dni=Leer.dato();
				System.out.println("Diga nombre");
				nombre=Leer.dato();
				System.out.println("Diga apellidos");
				apellidos=Leer.dato();
				System.out.println("Diga cuota");
				cuota=Leer.datoDouble();
				Socio s = new Socio (dni, nombre, apellidos, cuota);
				cs.agregar(s);
				
			break;
			
			case 2:
				cs.imprimirLista();
				
			break;
			
			case 3:
				System.out.println("Diga dni del socio");
				dni = Leer.dato();
				System.out.println("Diga nueva cuota");
				cuota=Leer.datoDouble();
				cs.modificarCuotas(dni, cuota);
			
			break;
			
			case 4:
				System.out.println("Diga dni del socio");
				dni = Leer.dato();
				cs.borrar(dni);
				
			break;
			
			case 5:
				System.out.println("Está en el Club de Verano tambén? 1 SI 0 NO");
				opcion=Leer.datoInt();
				if(opcion == 0) {
					System.out.println("Diga dni del socio");
					dni = Leer.dato();
					System.out.println("Diga en que año entró al club");
					anioEntrada=Leer.datoInt();
					System.out.println("Diga que año es");
					anioActual=Leer.datoInt();
					aniosEnElClub=c.calcularAnios(anioActual, anioEntrada);
					System.out.println(c.calcularDineroGastado(aniosEnElClub, dni));
				}if(opcion==1) {
					System.out.println("Diga dni del socio");
					dni = Leer.dato();
					System.out.println("Diga en que año entró al club");
					anioEntrada=Leer.datoInt();
					System.out.println("Diga que año es");
					anioActual=Leer.datoInt();
					aniosEnElClub=cv.calcularAnios(anioActual, anioEntrada);
					System.out.println(cv.calcularDineroGastado(aniosEnElClub, dni));
				}else {
					System.out.println("No has elegido una opción correcta");
				}
				
				
			break;
			
			case 6:
				System.out.println("Diga dni del socio");
				dni = Leer.dato();
				System.out.println("¿Cuántas cuotas tienes atrasadas?");
				cuotasAtrasadas=Leer.datoInt();
				Socio so;
				so= cs.buscarPorDni(dni);
				cuotas=so.getCuota();
				c.pagarCuotasAtrasadas(cuotas, cuotasAtrasadas);
				
			
			case 0:
				System.out.println("Adiós");
			break;
			
			default:
				System.out.println("La opción elegida no es válida. Indique otra opción.");
			}
		}while(eleccion!=0);

	}

}
