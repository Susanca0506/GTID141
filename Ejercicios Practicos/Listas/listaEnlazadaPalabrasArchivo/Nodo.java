
package actividad02;

/**
 * Clase que representa un nodo en la lista enlazada
 * @author Susana Cárdenas Vázquez
 * @author 1.0  18/10/2025
 */
public class Nodo{
    //Atributos del Nodo
    private String dato;
    private Nodo izquierda;

    //Constructores
    public Nodo() {
    }

    public Nodo(String dato) {
        this.dato = dato;
        this.izquierda = null;
    }

    public Nodo(String dato, Nodo izquierda) {
        this.dato = dato;
        this.izquierda = null;
    }

    //Getters y Setters
    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    //Override
    @Override
    public String toString() {
        return "Lista{" + "dato=" + dato + ", izquierda=" + izquierda + '}';
    }
     
}
