package caja;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente ("Ander", new Producto[] {
			new Producto ("Azucar",2000,2),
			new Producto ("Café",4000,3),
			new Producto ("Papa",1000,6),				
		} );
		
		Cliente cliente2 = new Cliente ("Hellmuth", new Producto[] {
				new Producto ("Leche",3500,2),
				new Producto ("Colifor",2000,5),
				new Producto ("Pasta",5000,2),				
			} );
		
		
		Cajera cajera1 =new Cajera("Andreina");
		cajera1.atenderCliente(cliente1,System.currentTimeMillis());
		Cajera cajera2 =new Cajera("Magali");
		cajera2.atenderCliente(cliente2,System.currentTimeMillis());
		
		cajera1.procesarCompra();
		cajera2.procesarCompra();
		
	}//fin del main

}//fin de la clase
