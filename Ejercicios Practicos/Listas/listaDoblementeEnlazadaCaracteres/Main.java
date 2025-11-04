
package actividad05;

import java.util.Scanner;

/**
 * Clase main que manejará los métodos creados en 
 * las clases Nodo y ListaDoble.
 * 
 * @author Susana Cárdenas Vázquez
 * @author 1.0  21/10/2025
 */
public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        ListaDoble lista = new ListaDoble();
        
        // Solicitar cadena al usuario
        System.out.print("Ingrese una cadena de texto: ");
        String cadena = scanner.nextLine();
        
        if (cadena.isEmpty()) {
            System.out.println("Error: La cadena está vacía.");
            scanner.close();
            return;
        }
        
        // Construir lista con cada carácter
        for (int i = 0; i < cadena.length(); i++) {
            String caracter = String.valueOf(cadena.charAt(i));
            lista.insertar(caracter);
        }
        
        // Ordenar alfabéticamente
        lista.ordenarAlfabeticamente();
        
        // Mostrar lista ordenada
        lista.mostrarLista();
        
        scanner.close();
    }
}
