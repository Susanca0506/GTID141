
package actividad03;

/**
 * Clase que representa un nodo en la lista enlazada simple
 * @author Susana Cárdenas Vázquez
 * @author 1.0  18/10/2025
 */
public class Nodo{
    //Atributos del Nodo
    private double coeficiente;
    private int exponente;
    private Nodo izquierda;

    //Constructores
    public Nodo() {
    }

    public Nodo(double coeficiente, int exponente) {
        this.coeficiente = coeficiente;
        this.exponente = exponente;
    }

    public Nodo(double coeficiente, int exponente, Nodo izquierda) {
        this.coeficiente = coeficiente;
        this.exponente = exponente;
        this.izquierda = null;
    }

    public double getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(int coeficiente) {
        this.coeficiente = coeficiente;
    }

    public double getExponente() {
        return exponente;
    }

    public void setExponente(int exponente) {
        this.exponente = exponente;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    @Override
    public String toString() {
        return "Nodo{" + "coeficiente=" + coeficiente + ", exponente=" + exponente + ", izquierda=" + izquierda + '}';
    }
    
}

