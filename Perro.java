/**
 * @author HMartin
 */

/*
*Creamos la clase Licantropo la cual es hija de la clase Mascota
*/
public class Licantropo extends Mascota{
    //ATRIBUTE
    /*
    * Añadimos el atributo de la clase
    *//
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

    @Override
    public String toString() {
        return "Licantropo{" + "raza=" + raza + '}';
    }
    
    /*
    * Sobreecribimos el metodo toString() 
    */
  
    //CONSTRUCTOR

    public Licantropo() {
    }

    public Licantropo(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String sonido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

       
    
}
