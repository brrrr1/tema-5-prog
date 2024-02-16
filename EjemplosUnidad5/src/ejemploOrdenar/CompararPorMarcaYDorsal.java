package ejemploOrdenar;

public class CompararPorMarcaYDorsal {
	public int compare(Corredor c1, Corredor c2) {
		// TODO Auto-generated method stub
		//Creamos las 2 variables tipo double (marca es double)
		//que vamos a comparar, no haría falta
		double marcac1 = c1.getMarca();
		double marcac2 = c2.getMarca();
		
		if(marcac1 < marcac2) {
			return -1;
		}if(marcac1 > marcac2) {
			return 1;
		}else {
			c1.compareTo(c2);
		}
		return 0;
		
	}
}
