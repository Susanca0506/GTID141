
package simulacionSimpleDePila;

/**
 * Código para el manejo y control de la pila, 
 * contendrá los métodos necesarios para la inserción,
 * eliminación y método peek para mostrar.
 * 
 * @author Susana Cárdenas Vázquez
 * @author 1.0  19/10/2025
 */

public class StackArray<T> implements IStack<T> {
    private T[] elements;   /**Estructura de datos interna (Array)*/
    private int top;   /**Índice de la cima*/
    
    /**Constructores*/
    public StackArray(){
        elements = (T[])new Object[30];
    }

    public StackArray(int size) {
        elements = (T[])new Object[size];
    }
    
    /**Método para la inserción*/
    @Override
    public void push(T element) {
        /**Validar que el indice de la cima sea menor al tamaño del array*/
        if(top < elements.length -1){
            top++;
            elements[top] = element;
        }else{
            /**Avisar que la pila esta llena de caso contrario*/
            System.out.println("La Pila se encuentra llena");
        }
    }
    
    /**Método para eliminar elemento de la pila*/
    @Override
    public T pop() {
        /**Verificar si la pila esta vacía*/
        if(isEmpty()){
            System.out.println("La pila está vacía");
        }
        
        /**Eliminar elemento*/
        T temp = elements[top];
        elements[top]=null;
        top--;
        return temp;
    }

    /**Método para imprimirla cima de la pila*/
    @Override
    public T peek() {
        /**Verificar si la pila está vacía*/
        if(isEmpty()){
            System.out.println("La pila está vacía");
        } 
        
        /**Imprimir último elemento*/
        System.out.println("Conociendo el último de la pila");
        return (T)elements[top-1];
    }

    /**Método para verificar si la pila esta vacía*/
    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    /** Método para mostrar los elementos de la pila */
    @Override
    public void mostrar() {
        for (T element : elements) {
            if (element != null) {
                System.out.println(element);
            }
        }
    }
    
    
}
