
package actividad05;

/**
 * Clase que representa un nodo en la lista doblemente enlazada
 * @author Susana Cárdenas Vázquez
 * @author 1.0  21/10/2025
 */
public class Nodo {
    private String texto;
    private Nodo anterior;
    private Nodo posterior;

    public Nodo(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Nodo getPosterior() {
        return posterior;
    }

    public void setPosterior(Nodo posterior) {
        this.posterior = posterior;
    }
      
}
