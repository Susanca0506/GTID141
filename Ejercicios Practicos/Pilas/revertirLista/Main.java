package revertirLista;

import java.util.Scanner;


/**
 * Clase main que mandará llamar los métodos y verificar 
 * el buen funcionamiento de los métodos de la pila
 * 
 * @author Susana Cárdenas Vázquez
 * @author 1.0  19/10/2025
 */

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /** Ingresar palabra */
        System.out.print("Ingrese palabra: ");
        String palabra = sc.nextLine();
        
        /**Crear pila*/
        StackArray<Character> pila = new StackArray<>();
 
        /**For para guardar en la pila*/
        for (char c : palabra.toCharArray()) pila.push(c);
 
        /** Variable que almacenará la palabra invertida */
        String invertida = "";
 
        /** Ciclo que invierte la palabra */
        while (!pila.isEmpty()) invertida += pila.pop();
        
        /** Comparacion de palabra original e invertida
         Tambien se define si es o no palíndromo*/
        if (palabra.equalsIgnoreCase(invertida))
            System.out.println("Es palíndromo");
        else
            System.out.println("No es palíndromo");
    }
    
}
