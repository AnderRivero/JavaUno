package congreso;

public class Persona {
	
	private String nombre;
	private String apellido;
	private int edad, cedula;
	
	//Constructor
	
	public Persona(String nombre, String apellido, int edad, int cedula) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.cedula = cedula;
	}
	
	//Metodos Getters & Setters
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	
	//Metodos varios
	
	
}
