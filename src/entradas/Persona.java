package entradas;

public class Persona {
	
	private int edad;
	private final String dni; //Esto no puede cambiarse
	public static final int EDADMINIMA=0; //Esto no puede cambiarse y es propio de la clase, no del objeto
	
	public Persona(int edad, String dni) {
		this.dni=dni;
		this.edad=edad;
		System.out.println("Se crea una persona de "+edad+" años.");
	}
		
	public void cumplirAnyos() {
		edad++;
	}
	
/*	public void setDni(String dni) { Prohibido: no puedo modificar un atributo final.
		this.dni=dni;
	}*/
	
	public int getEdad() {
		return edad;
	}

}
