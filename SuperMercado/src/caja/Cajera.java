package caja;

public class Cajera {
	
	private String nombre;
	private Cliente cliente;
	private long timeStamp;
	
	
	//constructor
	
	public Cajera(String nombre) {
		this.nombre = nombre;
	}
	
	//getters and setters
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public long getTimeStamp() {
		return timeStamp;
	}


	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}

	// metodos 
	public void atenderCliente(Cliente cliente,long timeStamp) {
		this.cliente=cliente;
		this.timeStamp=timeStamp;
	}

	private void esperarXSegundos(int segundos) {
		
		try {
			Thread.sleep(segundos*1000);
		} catch (InterruptedException e) {
			System.out.println("Error durmiendo el hilo");
			e.printStackTrace();
		}
	}
	
	public void procesarCompra() { 
		
		System.out.println("La cajera: "+this.nombre
				+ "\nVa a atender al cliente "+this.cliente.getNombre()
				+ "\nEn un tiempo de: "+((System.currentTimeMillis()-this.timeStamp)/1000)
				+ " segundos");
		
		for (int i = 0; i < this.cliente.getCarroCompra().length; i++) {
			
			esperarXSegundos(this.cliente.getCarroCompra()[i].getTiempo());
			
			System.out.println("Cliente: "+this.cliente.getNombre()
					+ "Producto: "+this.cliente.getCarroCompra()[i].getNombre());
		}
		System.out.println("La cajera: "+this.nombre
				+ "\nAtendio al cliente "+this.cliente.getNombre()
				+ "\nEn un tiempo total de: "+((System.currentTimeMillis()-this.timeStamp)/1000)
				+ " segundos");
	}

}
