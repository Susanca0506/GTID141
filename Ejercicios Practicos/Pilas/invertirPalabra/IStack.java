
package invertirPalabra;

/**
 * Interface que contiene los métodos que podra llevar a cabo la pila
 * 
 * @author Susana Cárdenas Vázquez
 * @author 1.0  18/10/2025
 */
public interface IStack<T> {
    /**Por default es public y abstract*/
    void push(T element); /**Insertar elemento*/
    
    T pop(); /**Sacar o eliminar elemento y retornarlo*/
    
    T peek(); /**Mostrar el elemento de hasta arriba*/
    
    boolean isEmpty(); /**Verificar si esta o no vacía la pila*/
    
    void mostrar(); /**Mostrar elementos de la pila*/
}
