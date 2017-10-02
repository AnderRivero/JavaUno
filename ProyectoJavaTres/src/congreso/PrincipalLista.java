package congreso;

public class PrincipalLista {

	
	public static void main(String[] args) {
	
	    Diputado d1 = new Diputado("Alfredo","Rivero", 25, 19668868, "Carabobo", "2016-2018");
	    Diputado d2 = new Diputado("Hellmuth", "Rivero", 23, 24365987, "Tachira", "2014-2016");
	    Senador s1 = new Senador("Luis", "Chain", 21, 2369854, "Amazonas", "2013-2016");
	    Senador s2 = new Senador("Roberto", "Zumoza", 24, 20123654, "Aragua", "2012-2015");
	    
		
		System.out.println("--------------------------------------------------------------------");
		System.out.println("----------------------Lista de Legisladores-------------------------");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Nombre: "+ d1.getNombre()+" "+d1.getApellido()+" - Camara en la que trabaja: "+d1.getCamaraEnQueTrabaja());
		System.out.println("Nombre: "+ s1.getNombre()+" "+s1.getApellido()+" -Camara en la que trabaja: "+s1.getCamaraEnQueTrabaja());
		System.out.println("Nombre: "+ s2.getNombre()+" "+s2.getApellido()+" -Camara en la que trabaja: "+s2.getCamaraEnQueTrabaja());
		System.out.println("Nombre: "+ d2.getNombre()+" "+d2.getApellido()+" - Camara en la que trabaja: "+d2.getCamaraEnQueTrabaja());

	}

}
