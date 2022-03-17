
/**
 * @author HMartin
 */

/*
* Creación de la clase Motor
* Esta clase sera para la creacion de objetos incluidos de la clase Barco
 */
public class Motor {

    //ATRIBUTES
    /*
    *Definimos los atributos de la clase Motor
     */
    private String Fabricante;
    private String Potencia;
    private int Codigo;

    //METHOD
    /*
    *Definimos los Getters & Setters de los atributos
     */
    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }

    public String getPotencia() {
        return Potencia;
    }

    public void setPotencia(String Potencia) {
        this.Potencia = Potencia;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    /*
    *Sobreescribimos el metodo toString()
     */
    @Override
    public String toString() {
        return "Motor{" + "Fabricante=" + Fabricante + ", Potencia=" + Potencia + ", Codigo=" + Codigo + '}';
    }

    //CONTRUCTOR
    /*
    *Creamos los constructores de la clase
     */
    public Motor() {
    }

    public Motor(String Fabricante, String Potencia, int Codigo) {
        this.Fabricante = Fabricante;
        this.Potencia = Potencia;
        this.Codigo = Codigo;
    }

}
