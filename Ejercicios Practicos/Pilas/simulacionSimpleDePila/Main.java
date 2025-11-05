package simulacionSimpleDePila;

/**
 * Clase main que mandará llamar los métodos y verificar 
 * el buen funcionamiento de los métodos de la pila
 * 
 * @author Susana Cárdenas Vázquez
 * @author 1.0  19/10/2025
 */

public class Main {

    public static void main(String[] args) {
        
        /** Creación de pila */
        StackArray<Integer> pila = new StackArray<>();
        
        /** Inserción de elementos */
        pila.push(5);
        pila.push(10);
        pila.push(15);
        pila.push(20);
        
        /** Eliminación de elementos */
        pila.pop();
        pila.pop();
        
        /** Imprimir elementos en la pila */
        System.out.println("Contenido actual: ");
        pila.mostrar();
    }    
}
