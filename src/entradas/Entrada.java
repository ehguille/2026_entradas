package entradas;

public class Entrada {

	private static int numeroEntrada; //Este atributo es común para todos los objetos de esta clase.
	
	public Entrada() {
		System.out.println("Se crea la entrada número "+numeroEntrada);
		numeroEntrada++;
	}
	
	public int getNumeroEntrada() {
		return numeroEntrada;
	}
	
}
