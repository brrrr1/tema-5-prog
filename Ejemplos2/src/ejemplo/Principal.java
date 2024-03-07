package ejemplo;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LocalDate fechaHoy = LocalDate.now();
		
		//System.out.println(fechaHoy);
		
		LocalDate fechaNacimiento = LocalDate.of(2005, 6, 27);
		
		//System.out.println(fechaNacimiento);
		
		LocalDate bicho =LocalDate.parse("1985-02-05");
		
		//System.out.println(bicho);
		
		LocalDate nuevaFecha = bicho.plusYears(15);
		
		System.out.println(nuevaFecha);
	}

}
