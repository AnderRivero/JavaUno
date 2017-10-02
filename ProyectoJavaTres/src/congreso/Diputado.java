package congreso;

public class Diputado extends Legislador{
	
	private String CamaraEnQueTrabaja="Diputado";

	
	//constructor 
	
	public Diputado(String nombre, String apellido, int edad, int cedula, String provinciaQueRepresenta,
			String periodoDeMandato) {
		super(nombre, apellido, edad, cedula, provinciaQueRepresenta, periodoDeMandato);
		
	}


	//metodos abstractos heredados
	
	@Override
	public String getCamaraEnQueTrabaja() {
		return CamaraEnQueTrabaja;
	}






				
	
}
