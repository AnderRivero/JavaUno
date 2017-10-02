package caja;

public class Cliente {
	
	private String nombre;
	private Producto[] carroCompra;
	
	//constructor
	public Cliente(String nombre, Producto[] carroCompra) {
		this.nombre = nombre;
		this.carroCompra = carroCompra;
	}

	//getter and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Producto[] getCarroCompra() {
		return carroCompra;
	}

	public void setCarroCompra(Producto[] carroCompra) {
		this.carroCompra = carroCompra;
	}
}
