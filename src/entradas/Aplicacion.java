package entradas;

public class Aplicacion {
	
	
	public Aplicacion() {
		/*System.out.println(Entrada.getNumeroEntradasVendidas());
		System.out.println(Entrada.AFORO);
		Entrada.AFORO=2000;*/
		
		Persona p1=new Persona(20,"123456789X");
		System.out.println(Persona.EDADMINIMA);
		

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
