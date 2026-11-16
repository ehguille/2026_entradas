package entradas;

public class Entrada {

	private static int numeroEntradasVendidas; //=0 Este atributo es común para todos los objetos de esta clase.
	private int numeroEntrada; //Este atributo es propio de cada objeto
	public static final int AFORO=1000; //Constante, public porque al ser final no puede modificarse
	
	public Entrada() {
		numeroEntrada=numeroEntradasVendidas;
		System.out.println("Se crea la entrada número "+numeroEntrada);
		numeroEntradasVendidas++;

	}
	
	public static int getNumeroEntradasVendidas() {
		return numeroEntradasVendidas;
	}
	
	public int getNumeroEntrada() {
		return numeroEntrada;
	}
	
}
