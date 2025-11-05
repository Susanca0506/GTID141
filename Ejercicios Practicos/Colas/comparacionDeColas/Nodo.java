
package comparacionDeColas;

/**
 * Clase que representa un Nodo en la cola
 * 
 * @author Susana Cárdenas Vázquez
 * @author 1.0  03/10/2025
 */
public class Nodo<T> {
    /**Atributos en privado*/
    private T dato; /**Dato que se almacenará*/
    private Nodo<T> izquierda;  /**Enlace*/

    /**Constructor*/
    public Nodo(T dato) {
        this.dato = dato;
        this.izquierda = null;
    }

    /**Settres y Getters*/
    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo<T> izquierda) {
        this.izquierda = izquierda;
    }

    /**ToString*/
    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + ", izquierda=" + izquierda + '}';
    }
    
}
