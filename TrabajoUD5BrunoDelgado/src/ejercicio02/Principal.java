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
		double cuotaDelAnio;
		int temporadaAlta;
		double matricula;
		double extraPorTemporada;
		do {
			System.out.println("""
					1) Dar de alta a un nuevo socio
					2) Ver lista
					3) Modificar cuota de un socio
					4) Borrar un socio
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
				Socio s = new Socio (dni, nombre, apellidos);
				cs.agregar(s);
				
				System.out.println("¿Cuál es la cuota para este año?");
				cuotaDelAnio=Leer.datoDouble();
				
				System.out.println("¿Estamos en temporada alta? 1 SI / 0 NO");
				temporadaAlta=Leer.datoInt();
				
				System.out.println("¿Cuál es el coste de la matrícula?");
				matricula=Leer.datoInt();
				
				System.out.println("¿Va a entrar también al club de verano? 1 SI / 0 NO");
				opcion=Leer.datoInt();
				
				System.out.println("¿Cuál es el coste extra por temporada alta?");
				extraPorTemporada=Leer.datoDouble();
				switch(opcion) {
				case 1:
					System.out.printf("La cantidad a aportar por la matrícula y el primer mes es de %.2f euros\n", cv.calcularPrimerPago(matricula, temporadaAlta, extraPorTemporada, cuotaDelAnio));
					break;
					
				case 2:
					System.out.printf("La cantidad a aportar por la matrícula y el primer mes es de %.2f euros\n", c.calcularPrimerPago(matricula, temporadaAlta, extraPorTemporada, cuotaDelAnio));
					break;
					
				default: System.out.println("Opción incorrecta");
				}
				
			break;
			
			case 2:
				cs.imprimirLista();
			
			break;
			
			case 3:
				System.out.println("Diga dni del socio");
				dni = Leer.dato();
				cs.borrar(dni);
				
			break;
		
			case 0:
				System.out.println("Adiós");
			break;
			
			default:
				System.out.println("La opción elegida no es válida. Indique otra opción.");
			}
		}while(eleccion!=0);

	}

}
