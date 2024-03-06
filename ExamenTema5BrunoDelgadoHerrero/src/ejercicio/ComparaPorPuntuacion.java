package ejercicio;

import java.util.Comparator;

public class ComparaPorPuntuacion implements Comparator <Carta>{

	@Override
	public int compare(Carta c1, Carta c2) {
		// TODO Auto-generated method stub
		//Comparo dos int (resultantes del cálculo de puntuacion con el método de la clase POJO).
		if(c1.calcularPuntuacion() > c2.calcularPuntuacion()) {
			return -1;
		}if(c1.calcularPuntuacion() < c2.calcularPuntuacion()) {
			return 1;
		}else {
			return 0;
		}
		
	}

}
