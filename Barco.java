
import java.util.Date;

/**
 * @author HMartin
 */

/*
*Creamos la clase Barco la cual implementa la clase inteface Sonido
 */
public class Barco implements Sonido {

    //ATRIBUTES
    /*
    *Añadimos los atributos de la clase mas la clase Motor 
    *Ya que la clase Barco esta compuesta por motor
     */
    private String Nombre;
    private Date fechaContruccion;
    private int numCamarotes;
    private Motor motor;

    //METHODS
    /*
    * Añadimos los Getters & Setters
     */
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Date getFechaContruccion() {
        return fechaContruccion;
    }

    public void setFechaContruccion(Date fechaContruccion) {
        this.fechaContruccion = fechaContruccion;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    /*
    *Sobreecribimos el metodo toString()
     */
    @Override
    public String toString() {
        return "Barco{" + "Nombre=" + Nombre + ", fechaContruccion=" + fechaContruccion + ", numCamarotes=" + numCamarotes + ", motor=" + motor + '}';
    }

    //CONTRUCTOR
    /*
    * Añadimos los constructores
     */
    public Barco() {
    }

    public Barco(String Nombre, Date fechaContruccion, int numCamarotes) {
        this.Nombre = Nombre;
        this.fechaContruccion = fechaContruccion;
        this.numCamarotes = numCamarotes;
    }

    /*
    * Implementamos la Interfaz
     */
    @Override
    public String sonido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
