package ejemploBasico;

public interface IOperaciones {

	private int restar (int a, int b) {
		return a-b;
	}
	
	private int sumar(int a, int b) {
		return a+b;
	}
	
	default int operacionSimple(int a, int b, int operacion) {
		if(operacion==0) {
			return restar(a,b);
		}if(operacion==1) {
			return sumar(a,b);
		}else {
			return 0;
		}
	}
}
