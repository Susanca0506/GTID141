package decimalABinario;

import java.util.Scanner;

/**
 * Clase main que mandará llamar los métodos y verificar 
 * el buen funcionamiento de los métodos de la pila
 * 
 * @author Susana Cárdenas Vázquez
 * @author 1.0  01/11/2025
 */

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /**Pedir numero a transformar en binario*/
        System.out.print("Ingrese número: ");
        int num = sc.nextInt(); /**Almacenar número**/
        
        /**Creamos pila*/
        StackArray<Integer> pila = new StackArray<>();
        
        /**Realizamos proceso de dividir y almacenar*/
        while (num > 0) {
            pila.push(num % 2);
            num /= 2;
        }
        
        /**Imprimimos binario*/
        System.out.print("Binario: ");
        while (!pila.isEmpty()) System.out.print(pila.pop()); 
    }
}
