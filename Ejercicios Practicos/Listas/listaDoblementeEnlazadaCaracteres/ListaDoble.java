
package actividad05;

/**
 * Clase para el manejo de la lista doblemente enlazada
 * @author Susana Cárdenas Vázquez
 * @author 1.0  21/10/2025
 */

public class ListaDoble {
    private Nodo cabeza;

    public ListaDoble() {
        cabeza = null;
    }
    
    public void insertar(String texto){
        Nodo nuevoNodo = new Nodo(texto);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        }else{
            Nodo temp = cabeza;
            while(temp.getPosterior() != null){
                temp = temp.getPosterior();
            }
            temp.setPosterior(nuevoNodo);  
            nuevoNodo.setAnterior(temp);
        }   
    }
    
    public void ordenarAlfabeticamente(){
        if (cabeza == null || cabeza.getPosterior() == null) {
            return;
        }
        boolean intercambio;
        do {
            intercambio = false;
            Nodo temp = cabeza;
            
            while(temp.getPosterior() != null){
                char c1 = temp.getTexto().charAt(0);
                char c2 = temp.getPosterior().getTexto().charAt(0);
                
                if (c1 >= 'A' && c1 <= 'Z') {
                    c1 = (char)(c1 + 32);
                }
                if (c2 >= 'A' && c2 <= 'Z') {
                    c2 = (char)(c2 + 32);
                }
                if (c1 > c2) {
                    String actual = temp.getTexto();
                    temp.setTexto(temp.getPosterior().getTexto());
                    temp.getPosterior().setTexto(actual);
                    intercambio = true;
                }
                temp = temp.getPosterior();
                
            }
        } while (intercambio);
        
        
    }
    public void mostrarLista() {
        if (cabeza == null) {
            System.out.println("La lista está vacía");
            return;
        }
        
        System.out.println("\n=== Lista de caracteres ordenada alfabéticamente ===");
        Nodo actual = cabeza;
        int posicion = 1;
        
        while (actual != null) {
            System.out.println(posicion + ". " + actual.getTexto());
            actual = actual.getPosterior();
            posicion++;
        }
        System.out.println("");
    }
    
    
}
    
