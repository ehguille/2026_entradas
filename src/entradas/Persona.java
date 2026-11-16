package entradas;

public class Persona {
	
	public int edad;
	
	public Persona(int edad) {
		this.edad=edad;
		System.out.println("Se crea una persona de "+edad+" años.");
	}
		
	public void cumplirAnyos() {
		edad++;
	}
	
	public int getEdad() {
		return edad;
	}

}
