
package actividad01;

/**
 * Clase que representa un nodo en la lista enlazada
 * @author Susana Cárdenas Vázquez
 * @author 1.0  18/10/2025
 */
public class Nodo<T extends Number> {
    //Atributos del Nodo
    private T dato;
    private Nodo izquierda;

    //Constructores
    public Nodo() {
    }

    public Nodo(T dato) {
        this.dato = dato;
    }

    public Nodo(T dato, Nodo izquierda) {
        this.dato = dato;
        this.izquierda = null;
    }

    //Getters y Setters
    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
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
