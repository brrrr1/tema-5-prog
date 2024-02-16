package proyecto;


public interface IPrueba {
 
 // Método default

private int calcularResta (int a, int b) {
     
	 return a-b;
 }
 
 private int calcularSuma(int a, int b) {
	 return a+b; 
 }
 
 default int calcularSumaMenosResta (int a, int b) {
     
	 return calcularSuma(a,b)-calcularResta(a,b);
 }
 

 
}

