package invertirPalabra;

import java.util.Scanner;

/**
 * Clase main que mandará llamar los métodos y verificar 
 * el buen funcionamiento de los métodos de la pila
 * 
 * @author Susana Cárdenas Vázquez
 * @author 1.0  18/10/2025
 */

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /**Ingresar palabra para invertir*/
        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine(); /**ALmacenar*/
        
        /**Crear pila*/
        StackArray<Character> pila = new StackArray<>();
        
        /**Ciclo para guardar la palabra en la pila e invertir*/
        for (char c : palabra.toCharArray()) pila.push(c);
            System.out.print("Invertida: ");
            while (!pila.isEmpty()) System.out.print(pila.pop());
        }    
}
