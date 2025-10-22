
package actividad01;

/**
 * Clase para el manejo de la lista enlazada
 * @author Susana Cárdenas Vázquez
 * @author 1.0  18/10/2025
 */
public class Numeros<T extends Number> {
    
    //Cabeza de la lista
    private Nodo<T> cabeza;
    
    //Método para insertar elementos en la lista
    public void insertar(T num){
        //Nodo con valor de cabeza
        Nodo<T> temp = cabeza;
        //Creación de nodo nuevo
        Nodo<T> nuevo = new Nodo<>(num);
        
        //Proceso si la cabeza es nula
        if (cabeza == null) {
            cabeza = nuevo;
        } else{
            //Proceso si la cabeza no es nula
            while (temp.getIzquierda()!=null) {
                //Recorre al siguiente nodo
                temp = temp.getIzquierda();
            }
            
            //Agrega el nuevo nodo al final
            temp.setIzquierda(nuevo);
        }
    }
    
    //Método para recorrer e imprimir la lista enlazada
    public void recorrer(){
        //Nodo con valor de la cabeza
        Nodo<T> i = cabeza;
        
        //Sentencia para validar que la lista no este vacía
        if(cabeza == null){
            System.out.println("La lista está vacía");
            return;
        }
        
        //Si no esta vacia, se realiza el recorrido de esta
        while (i != null) {
            //Impresion del valor guardado en el Nodo
            System.out.println(i.getDato());
            
            //Recorrido de la lista
            i = i.getIzquierda();
        }
    }
    
    //Método para eliminar Nodos a partir de una condición
    public void eliminarMayores(int n){
        //Sentencia para validar que la lista este vacía
        if(cabeza == null){
            System.out.println("La lista está vacía");
            return;
        }
        
        //Si no esta vacía se declaran nuevos atributos
        //Indices
        Nodo<T> actual = cabeza;
        Nodo<T> anterior = null;
        
        //Ciclo para recorrer toda la lista
        while (actual != null) {
            //Validar que el dato del Nodo sea mayor que el limite
            if ((int)actual.getDato()>n) {
                
                //Eliminar nodo actual
                if(anterior == null){
                    
                    //Elimina el nodo cabeza
                    cabeza = actual.getIzquierda();
                    
                    //Actualizar punteros
                    actual.setIzquierda(null);
                    actual = cabeza;
                }else{
                    //Eliminar nodos internos y actualizar punteros
                    anterior.setIzquierda(actual.getIzquierda());
                    actual.setIzquierda(null);
                    actual = anterior.getIzquierda();
                }
            }else{
                //Actualiza punteros
                anterior = actual;
                actual = actual.getIzquierda();
            }
        }
    }
}
