package up;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class SinDecimalesVe {

	static RoundingMode redondeo = RoundingMode.UP;
	final static int  SCALE = 0;
	public static void main(String[] args) {

		Factura factura1 = new Factura("Cliente Retira",
				                         BigDecimal.valueOf(105934),
				                         BigDecimal.valueOf(64146.29), 
				                         BigDecimal.valueOf(25226.58), 
				                         BigDecimal.valueOf(16561.13));
		
		Factura factura2 = new Factura("Domicilio",
                						 BigDecimal.valueOf(15842),
                					  	 BigDecimal.valueOf(9592.817), 
                						 BigDecimal.valueOf(3772.533), 
                						 BigDecimal.valueOf(2476.65));
		
		Factura factura3 = new Factura("Caja",
                						 BigDecimal.valueOf(24788),
                						 BigDecimal.valueOf(15009.89),	 
                						 BigDecimal.valueOf(5902.887), 
                						 BigDecimal.valueOf(3875.223));
		
		redondeo(factura1);
		redondeo(factura2);
		redondeo(factura3);
		
		Factura facturaTotal=totalesGlobales(factura1, factura2, factura3);
		
		//imprimirFactura(facturaTotal);
		
		//******************************Segunda Prueba*******************************************//
		
		
		
		ArrayList<Factura> f = new ArrayList<Factura>();

		Factura global = new Factura("Global", 
				BigDecimal.valueOf(285324) , 
				BigDecimal.valueOf(152903), 
				BigDecimal.valueOf(838542),  
				BigDecimal.valueOf(48879));
		
		Factura f1 = new Factura("Cliente Retira",BigDecimal.valueOf(210530));
		Factura f2 = new Factura("Caja",BigDecimal.valueOf(50000));
		Factura f3 = new Factura("Domicilio",BigDecimal.valueOf(24794));
		
		f.add(0, f1);
		f.add(1, f2);
		f.add(2, f3);
		
		BigDecimal multiplicacion = f1.getTotal().multiply(global.getMontoFDP1());
		System.out.println("Multiplicacion: " +multiplicacion);
		//f=Factura.crearSubFacturas(global, f);
		BigDecimal entre = global.getTotal();
		BigDecimal division = global.getTotal().divide(BigDecimal.valueOf(32190668590L),3,RoundingMode.CEILING);
		System.out.println("entre: "+entre);
		System.out.println("Division: "+division);
		for (Factura factura : f) {
			imprimirFactura(factura);
		}
		
	}//fin del metodo main

	private static void redondeo(Factura f) {
		
		f.setMontoFDP1(f.getMontoFDP1().setScale(SCALE, redondeo));
		f.setMontoFDP2(f.getMontoFDP2().setScale(SCALE, redondeo));
		f.setMontoFDP3(f.getTotal().subtract(f.getMontoFDP1().add(f.getMontoFDP2())));
	}
	
	private static Factura totalesGlobales(Factura f1,Factura f2,Factura f3) {
		
		Factura f0 = new Factura("Factura Total",
								 f1.getTotal().add(f2.getTotal().add(f3.getTotal())),
				                 f1.getMontoFDP1().add(f2.getMontoFDP1().add(f3.getMontoFDP1())),
				                 f1.getMontoFDP2().add(f2.getMontoFDP2().add(f3.getMontoFDP2())), 
				                 f1.getMontoFDP3().add(f2.getMontoFDP3().add(f3.getMontoFDP3())) 
				                 );
		return f0;
	}
	
	private static String imprimirFactura(Factura f) {
		
		
		System.out.println("Nombre: "+ f.getNombre() +"\n"+
		                   "Visa: "+ f.getMontoFDP1()+"\n"+
						   "Efectivo: "+ f.getMontoFDP2()+"\n"+
						   "Acreencia: "+ f.getMontoFDP3()+"\n"+
						   "Total Global: "+ f.getTotal());
		
		
		
		return null;
	
	}

}
