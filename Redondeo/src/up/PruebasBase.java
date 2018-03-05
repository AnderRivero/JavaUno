package up;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;


public class PruebasBase {
	
	
	

	public static void main(String[] args) {
		
		RoundingMode redondeo = RoundingMode.UP;
		final int  SCALE = 0;
		
//		BigDecimal sinRedondear=  BigDecimal.valueOf(1.5262);
//		
//		BigDecimal conRedondeo = sinRedondear.setScale(SCALE, redondeo);
//		
//		BigDecimal diferencia = conRedondeo.subtract(sinRedondear);
		
//		System.out.println(sinRedondear);
//		System.out.println(conRedondeo);
//		System.out.println(diferencia);

		BigDecimal errorAcumulado= BigDecimal.ZERO;
		ArrayList  <BigDecimal> listaRedondeada = new ArrayList<BigDecimal>();

		BigDecimal [] listaMonto = {BigDecimal.valueOf(1.5262),
									BigDecimal.valueOf(1.9684),
									BigDecimal.valueOf(1.1452)
									};
		BigDecimal montoTotal= BigDecimal.ZERO;
		BigDecimal totalTotal= BigDecimal.ZERO;
		
		for (BigDecimal listaSinRedondear : listaMonto) {
			
			listaRedondeada.add(listaSinRedondear.setScale(SCALE, redondeo));
			errorAcumulado=	errorAcumulado.add((listaSinRedondear.setScale(SCALE, redondeo).subtract(listaSinRedondear)));
		}
		System.out.println("Monto redondeados:");
		
		for (BigDecimal bigDecimal : listaRedondeada) {
			System.out.println(bigDecimal);
			montoTotal=montoTotal.add(bigDecimal);
		}
		
		
		System.out.println("Montos Redondeados");
		System.out.println(montoTotal);
		System.out.println("Error Acumulado");
		System.out.println(errorAcumulado);
		
		totalTotal=montoTotal.subtract(errorAcumulado);
		
		System.out.println("Total perfecto");
		System.out.println(totalTotal);
		
	}
	

}
