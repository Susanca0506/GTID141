
package cola;

/**
 * Clase que representa la cola y contiene los metodos que esta llevará a cabo.
 * @author Susana Cárdenas Vázquez
 * @author 1.0  24/10/2025
 */
public class Cola<T> {
    //Atributos 
    private Nodo<T> cabeza;    //Primer elemento de la cola
    private Nodo<T> cola;      //Último elemento de la cola
    private int tamano;        //Tamaño de la cola

    //Constructor
    public Cola() {
        this.cabeza = null;
        this.cola = null;
        this.tamano = 0;
    }

    //Método para añadir elementos a la cola
    public void encolar(T elemento){
        
        //Crear nodo nuevo
        Nodo<T> nuevo = new Nodo<>(elemento);
        
        //Insertar en la cabeza si la cola esta vacía
        if(isEmpty()){
            cabeza = nuevo;
            cola = nuevo;
        }else{
            //Si no esta vacia se enlaza a la cola
            cola.setIzquierda(nuevo);
            //La nueva cola sera el elemento ingresado como nuevo
            cola = nuevo;   
        }
        
        //Aumentamos en uno el tamaño
        tamano++;
        
        //Mensaje de comprobación exitosa
        System.out.println("Tarea insertada correctamente");
        
    }
    
    //Método para eliminar elemento
    public T desencolar(){
        
        //Validar que la cola no este vacía
        if(isEmpty()){
            return (T) "La cola está vacía";
        }
        
        //Almacenar la cabeza
        T eliminado = cabeza.getDato();
        
        //Recorrer el puntero de la cabeza al nodo anterior
        cabeza = cabeza.getIzquierda();
        
        //Validar si la cola se quedo vacía
        if(cabeza == null){
            cola = null;
        }
        
        //Reducimos el tamaño
        tamano--;
        
        //Retornamos el dato del nodo
        return eliminado;
    }
    
    //Método para mostrar el primero dato (cabeza)
    public T peek(){
        
        //Validar si esta o no vacía
        if(isEmpty()){
            return (T) "La cola esta vacia";
        }
        
        //Retornar el valor de la cabeza
        return cabeza.getDato();
        
    }
    
    //Método para validar si la cola esta vacía
    public boolean isEmpty(){
        
        //Retorna true si la cabeza es null
        return cabeza == null;
    }
    
    //Método para retornar el tamaño de la cola
    public int tamano(){
        return tamano; //Regresa el tamaño de la cola
    }
    
    //Método para mostrar los elementos de la cola
    public void mostrar(){
        
        //Validar si esta o no vacía
        if(isEmpty()){
            System.out.println("La colá está vacía");
        }
        
        //Creación del nodo temporal, con valor inicial de la cabeza
        Nodo<T> temp = cabeza;
        int cont = 1; //Contador para enumerar los datos de la cola
        
        //Ciclo while que permite la iteración e impresión de los nodos
        while (temp != null) {
            System.out.println(cont+". "+temp.getDato());
            //Cambiamos puntero
            temp = temp.getIzquierda();
            cont++; //Aumentamos contador
        }
    }
}
