package caja;

public class Producto {
	
	private String nombre;
	private double precio;
	private int tiempo;
	
	// constructor
	public Producto(String nombre, double precio, int tiempo) {
		this.nombre = nombre;
		this.precio = precio;
		this.tiempo = tiempo;
	}
	
	//metodos getters and setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
}
