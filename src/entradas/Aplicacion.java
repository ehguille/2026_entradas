package entradas;

public class Aplicacion {
	
	public Aplicacion() {
	
		Entrada e0=new Entrada();
		Entrada e1=new Entrada();
		Entrada e3=new Entrada();
		
		System.out.println(e0.getNumeroEntrada());

		/* Esto era solo para ejemplificar una cosa.
		Persona p0=new Persona(18);
		Persona p1=new Persona(18);
		
		p0.cumplirAnyos();
		System.out.println(p0.getEdad()); //19
		System.out.println(p1.getEdad()); //18
		*/
	}
	
	
	public static void main(String[] args) {
		Aplicacion a = new Aplicacion();
	}
	
}
