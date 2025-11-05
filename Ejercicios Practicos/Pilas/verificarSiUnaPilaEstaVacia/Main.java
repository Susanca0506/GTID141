package verificarSiUnaPilaEstaVacia;

/**
 * Clase main que mandará llamar los métodos y verificar 
 * el buen funcionamiento de los métodos de la pila
 * @author Susana Cárdenas Vázquez
 * @author 1.0  17/10/2025
 */

public class Main {

    public static void main(String[] args) {
        StackArray<Integer> pila = new StackArray<>();
    System.out.println("¿Está vacía la pila? " + pila.isEmpty());
    pila.push(1);
    System.out.println("¿Está vacía la pila? " + pila.isEmpty());
    }    
}
