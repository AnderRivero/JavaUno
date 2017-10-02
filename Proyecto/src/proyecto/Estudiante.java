package proyecto;

/**
 *
 * @author Junior García
 */
public class Estudiante {

    /**
     * Atributos del Objeto
     */
    private String nombre;
    private String apellido;
    private int edad;
    private double notas[];

    /**
     * Metodo constructor 1 de la clase
     */
    public Estudiante() {
        nombre = " ";
        apellido = " ";
        edad = 0;
        notas = null;
    }

    /**
     * Metodo constructor 2 de la clase
     *
     * @param nombre
     * @param apellido
     * @param edad
     * @param notas
     */
    public Estudiante(String nombre, String apellido, int edad, double notas[]) {
        notas = new double[3];
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.notas = notas;
    }

    //Metodos SETTERS (Establecer atributos al objeto)
    /**
     * Establecer nombre
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establecer apellido
     *
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Establecer edad
     *
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Establecer notas
     *
     * @param notas
     */
    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    //Metodos GETTERS (Obtener atributos del objeto)
    /**
     * Obtener nombre
     *
     * @return String nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtener apellido
     *
     * @return String apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Obtener edad
     *
     * @return int edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Obtener Notas
     *
     * @return double[] notas
     */
    public double[] getNotas() {
        return notas;
    }

    //Metodos de la clase
    /**
     * Metodo que devuelve el promedio de notas de un estudiante
     *
     * @param notas
     * @return double promedio de notas
     */
    public double getPromedio(double notas[]) {
        double promedio = 0;
        double suma = 0;

        for (int i = 0; i < 3; i++) {
            suma += notas[i];
        }
        promedio = suma / 3;
        return promedio;
    }

}
