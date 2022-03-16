
/**
 * @author HMartin
 */

/*
*Creamos la clase Mascota la cual es abstracta
*Ademas implementa la interfaz Sonido
 */
abstract class Mascota implements Sonido {

    //ATRIBUTES
    /*
    * Añadimos los atributos de la clase
     */
    private String nombre;
    private int edad;

    //METHODS
    /*
    * Creamos los Getters & Setters
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /*
    * Sobreecribimos el metodo toString()
     */
    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

    //CONTRUCTOR
    /*
    * Creamos los constructores
     */
    public Mascota() {
    }

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

}
