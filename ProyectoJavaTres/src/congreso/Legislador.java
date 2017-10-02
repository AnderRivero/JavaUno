package congreso;

public abstract class Legislador extends Persona {
	
	String provinciaQueRepresenta;
	String periodoDeMandato;	
	
	//constructor
	public Legislador(String nombre, String apellido, int edad, int cedula, String provinciaQueRepresenta,
			String periodoDeMandato) {
		super(nombre, apellido, edad, cedula);
		this.provinciaQueRepresenta = provinciaQueRepresenta;
		this.periodoDeMandato = periodoDeMandato;
	}

	//metodo
	
	public abstract String getCamaraEnQueTrabaja();
	
	
}
