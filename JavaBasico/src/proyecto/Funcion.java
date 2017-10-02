package proyecto;

import java.util.Scanner;


public class Funcion {

	private static Scanner sc;

	public static String[] ander(String[] array) {
		
		String resp[]= new String[5];
		
		for (int i = 0; i < resp.length; i++) {
			resp[i]=array[i];
		}
		
		
		return resp;
		
	}
	
	public static void main(String[] args) {

		String datos;
		String concatenado[] = new String[5];
		String array[] = new String[5];

		for (int i = 0; i < 5; i++) {
			
			sc = new Scanner(System.in);
			System.out.println("una frase de 5 palabras pero palabra por palabra");
			datos = sc.nextLine();

			array[i] = datos;
		} // fin del for
		
		
		
		
		
		concatenado=ander(array);
		
		for (int i = 0; i < concatenado.length; i++) {
			System.out.println(concatenado[i]);
		}
		
	} // fin del main
	
}
