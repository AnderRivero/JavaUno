package proyecto;

import java.util.Scanner;

/**
 *
 * @author Junior García
 */
public class Main {

    public static void main(String[] args) {
        /**
         * Atributos de los estudiantes
         */
        String nombre;
        String apellido;
        int edad;
        double notas[] = new double[3];
        Estudiante[] estudiante;
        estudiante = new Estudiante[3];

        Scanner lector = new Scanner(System.in); //Instacia del objeto Scanner que permite leer un dato de la consola

        /**
         * Comienza el ciclo del programa donde de capturan los datos y se calcula el promedio por estudiante
         */
        System.out.println("--Introduzca los datos de los estudiantes--");
        for (int i = 0; i < 3; i++) {
            
            //Capturamos el nombre, apellido y edad del estudiante
            System.out.println("Estudiante " + (i + 1));
            System.out.println("Nombre: ");
            nombre = lector.next();
            System.out.println("Apellido: ");
            apellido = lector.next();
            System.out.println("Edad: ");
            edad = lector.nextInt();

            estudiante[i] = new Estudiante();
            estudiante[i].setNombre(nombre);//Establecemos el nombre del objeto
            estudiante[i].setApellido(apellido);//Establecemos el apellido del objeto
            estudiante[i].setEdad(edad);//Establecemos la edad del objeto

            System.out.println("A continuacion introduzca las notas del primer(1), segundo(2) y tercer(3) lapso: ");
            //Ciclo para capturar cada una de las notas
            for (int j = 0; j < 3; j++) {
                System.out.println("Nota " + (j + 1));
                notas[j] = lector.nextDouble();
            }
            estudiante[i].setNotas(notas);//Establecemos las notas 

            System.out.println("La nota final del estudiante " + estudiante[i].getNombre() + " " + estudiante[i].getApellido() + " es: ");
            System.out.println(estudiante[i].getPromedio(estudiante[i].getNotas()) + " Ptos.");//Se llama al metodo promedio 

        }
    }
}
