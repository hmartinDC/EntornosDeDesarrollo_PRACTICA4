/**
 * @author HMartin
 */

/*
*Creamos la clase Gato la cual es hija de la clase Mascota
*/
public class Gato extends Mascota {
    //ATRIBUTES
    /*
    * Añadimos el atributo de la clase
    */
    private String raza;
    
    //METHODS
    
    /*
    * Añadimos los Getters & Setters
    */
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    /*
    * Sobreecribimos el metodo toString() 
    */
    @Override
    public String toString() {
        return "Gato{" + "raza=" + raza + '}';
    }
    
    
    
    //CONSTRUCTOR
    /*
    *Creamos los constructores teniendo en cuenta que es una clase hija
    */

    public Gato() {
    }

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String sonido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
