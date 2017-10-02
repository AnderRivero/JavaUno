package congreso;

public class Senador extends Legislador {

	private String CamaraEnQueTrabaja="Senador";
	
	//constructor

	public Senador(String nombre, String apellido, int edad, int cedula, String provinciaQueRepresenta,
			String periodoDeMandato) {
		super(nombre, apellido, edad, cedula, provinciaQueRepresenta, periodoDeMandato);
		
	}

	//metodos abstractos heredados
	@Override
	public String getCamaraEnQueTrabaja() {
		return CamaraEnQueTrabaja;
	}



}
