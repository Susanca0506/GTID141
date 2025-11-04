
package actividad04;

import java.util.Scanner;

/**
 * Clase Main que manejará los métodos creados en 
las clases Nodo y ListaCircular.
 * 
 * @author Susana Cárdenas Vázquez
 * @author 1.0  18/10/2025
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaCircular polinomio = new ListaCircular();
        
        // Solicitar número de términos
        System.out.print("Cuantos terminos tiene el polinomio? ");
        int numTerminos = scanner.nextInt();
        
        if (numTerminos <= 0) {
            System.out.println("Error: Debe ingresar al menos un termino.");
            scanner.close();
            return;
        }
        
        // Entrada del polinomio
        System.out.println("\nIngrese los terminos del polinomio:");
        System.out.println("(Formato: coeficiente exponente)");
        System.out.println("Ejemplo para 3x^4: ingrese 3 4\n");
        
        for (int i = 1; i <= numTerminos; i++) {
            System.out.print("Termino " + i + " - Coeficiente: ");
            int coeficiente = scanner.nextInt();
            
            System.out.print("Termino " + i + " - Exponente: ");
            int exponente = scanner.nextInt();
            
            polinomio.insertar(coeficiente, exponente);
            System.out.println();
        }
        
        // Mostrar información del polinomio      
        System.out.println("Resultado");
        
        // Mostrar polinomio en formato matemático
        polinomio.mostrarPolinomio();
        
        // Mostrar recorrido circular
        polinomio.recorridoCircular();
        
        scanner.close();
    }
        
 }
    
    
    
    

