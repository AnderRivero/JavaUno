package proyecto;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Usuarios {

	private static Scanner sc;

	public static void escribirArchivo(String[] array) {

		FileWriter fichero = null;
		PrintWriter pw = null;

		try {
			fichero = new FileWriter("Personas.txt");
			pw = new PrintWriter(fichero);

			for (int i = 0; i < array.length; i++) {
				pw.println(array[i]);
			}
		} catch (Exception e) {
			System.out.println("Error al escribir el archivo");
		} finally {
			try {
				if (fichero != null) {
					fichero.close();
				}
			} catch (Exception e2) {
				System.out.println("Error al cerrar el archivo");
			}
		}
	}

	public static void main(String[] args) {

		String datos;
		String array[] = new String[5];

		for (int i = 0; i < 5; i++) {
			
			sc = new Scanner(System.in);
			System.out.println("Ingrese el nombre, apellido y edad del usuario");
			datos = sc.nextLine();

			array[i] = datos;
		} // fin del for
		escribirArchivo(array);
	} // fin del main
}// fin de la clase