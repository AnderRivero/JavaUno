package up;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Factura {
	
	private String nombre;
	private BigDecimal total;
	private BigDecimal montoFDP1;
	private BigDecimal montoFDP2;
	private BigDecimal montoFDP3;
	
	
	//Constructores
	public Factura() {
		
	}
	
	
	public Factura(String nombre, BigDecimal total) {
		this.nombre = nombre;
		this.total = total;
	}



	public Factura(String nombre, BigDecimal total, BigDecimal montoFDP1, BigDecimal montoFDP2, BigDecimal montoFDP3) {
		this.nombre = nombre;
		this.total = total;
		this.montoFDP1 = montoFDP1;
		this.montoFDP2 = montoFDP2;
		this.montoFDP3 = montoFDP3;
	}
	
	// Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public BigDecimal getMontoFDP1() {
		return montoFDP1;
	}

	public void setMontoFDP1(BigDecimal montoFDP1) {
		this.montoFDP1 = montoFDP1;
	}

	public BigDecimal getMontoFDP2() {
		return montoFDP2;
	}

	public void setMontoFDP2(BigDecimal montoFDP2) {
		this.montoFDP2 = montoFDP2;
	}

	public BigDecimal getMontoFDP3() {
		return montoFDP3;
	}

	public void setMontoFDP3(BigDecimal montoFDP3) {
		this.montoFDP3 = montoFDP3;
	}
	
	
	//Metodos
	public BigDecimal sumaFDP() {
		
		return montoFDP1.add(montoFDP2.add(montoFDP3));	
		
	}
	
	
	public static ArrayList<Factura> crearSubFacturas(Factura global,ArrayList<Factura>f) {
		ArrayList<Factura> facturasPonderadas = new ArrayList<Factura>();
		
		for (Factura factura : f) {
			
			factura.setMontoFDP1(global.getTotal().divide(factura.getTotal().multiply(global.getMontoFDP1())));
			factura.setMontoFDP2(global.getTotal().divide(factura.getTotal().multiply(global.getMontoFDP2())));
			factura.setMontoFDP3(global.getTotal().divide(factura.getTotal().multiply(global.getMontoFDP3())));
			
			facturasPonderadas.add(factura);
		}
		
		return facturasPonderadas;
	}
	 
	
	

}
