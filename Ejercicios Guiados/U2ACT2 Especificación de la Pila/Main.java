package pila;

/**
 * Clase main que mandará llamar los métodos y verificar 
 * el buen funcionamiento de los métodos de la pila
 * @author Susana Cárdenas Vázquez
 * @author 1.0  17/10/2025
 */

public class Main {

    public static void main(String[] args) {
        //Creación de la pila
        StackArray<String> amigos = new StackArray<String>();
        
        //Inserción de datos en la pila
        amigos.push("Talat");
        amigos.push("Adrian");
        amigos.push("Cinthia");
        
        //Eliminación e impresión de elementos
        System.out.println(amigos.pop());
        System.out.println(amigos.pop());
    }    
}
