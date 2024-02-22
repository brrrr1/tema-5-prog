package ejemploClub;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Socio> lista = new ArrayList<Socio>();
		CRUDSocio cs = new CRUDSocio(lista);
		Club c = new Club(cs, "Club Brrr");
		ClubVerano cv = new ClubVerano(cs);
		ClubInvierno ci = new ClubInvierno(cs);
		int eleccion;
		String dni;
		String nombre;
		String apellidos;
		int opcion;
		double cuotaDelAnio;
		int temporadaAlta;
		double matricula;
		double extraPorTemporada;
		double pagoVerano;
		double pagoInvierno;
		do {
			System.out.println("""
					1) Dar de alta a un nuevo socio
					2) Ver lista
					3) Borrar un socio
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
				
				System.out.println("¿Cuál es el coste de la matrícula?");
				matricula=Leer.datoInt();
				
				System.out.println("¿Estamos en temporada alta? 1 SI / 0 NO");
				temporadaAlta=Leer.datoInt();
				
				System.out.println("¿Cuál es el coste extra por temporada alta?");
				extraPorTemporada=Leer.datoDouble();
				

				
				System.out.println("""
						¿Va a entrar también al club de verano o invierno? 
						1) VERANO
						2) INVIERNO
						3) AMBOS
						0) NINGUNO
						""");
				opcion=Leer.datoInt();
				if(opcion==1) {
					System.out.println("¿Cuál es el pago por el club de verano?");
					pagoVerano=Leer.datoDouble();
					pagoInvierno=0;
					
					System.out.printf("La cantidad a aportar por la matrícula y el primer mes es de %.2f euros.\n", 
							cv.calcularPrimerPago(matricula, temporadaAlta, extraPorTemporada, cuotaDelAnio, opcion, pagoVerano, pagoInvierno));
				}if(opcion==2) {
					System.out.println("¿Cuál es el pago por el club de invierno?");
					pagoInvierno=Leer.datoDouble();
					pagoVerano=0;
					
					System.out.printf("La cantidad a aportar por la matrícula y el primer mes es de %.2f euros.\n", 
							ci.calcularPrimerPago(matricula, temporadaAlta, extraPorTemporada, cuotaDelAnio, opcion, pagoVerano, pagoInvierno));
				}if(opcion==3) {
					System.out.println("¿Cuál es el pago por el club de verano?");
					pagoVerano=Leer.datoDouble();
					
					System.out.println("¿Cuál es el pago por el club de invierno?");
					pagoInvierno=Leer.datoDouble();
					System.out.printf("La cantidad a aportar por la matrícula y el primer mes es de %.2f euros.\n", 
							c.calcularPrimerPago(matricula, temporadaAlta, extraPorTemporada, cuotaDelAnio, opcion, pagoVerano, pagoInvierno));
				}else {
					pagoVerano=0;
					pagoInvierno=0;
					System.out.printf("La cantidad a aportar por la matrícula y el primer mes es de %.2f euros.\n", 
							c.calcularPrimerPago(matricula, temporadaAlta, extraPorTemporada, cuotaDelAnio, opcion, pagoVerano, pagoInvierno));
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
