
package comparacionDeColas;

import java.util.Scanner;

/**
 * Clase main que ejecuta el programa completo para 
 * la comparación de dos colas.
 * 
 * @author Susana Cárdenas Vázquez
 * @author 1.0  03/10/2025
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /** Se solicita el ingreso de ambas colas
        * Asimismo se almacenan en una variable */
        System.out.println("Ingresa los valores de la primer cola: ");
        System.out.println("Ej. 25 89 85 47 12");
        String linea1 = scanner.nextLine();
        
        System.out.println("Ingresa los valores de la segunda cola: ");
        String linea2 = scanner.nextLine();
        
        /** Creamos arreglos para separar los elementos */
        String[] cola1 = linea1.split(" ");
        String[] cola2 = linea2.split(" ");
        
        /** Creamos la primer cola */
        Cola<String> colaUno = new Cola<>();
        
        /** Guardamos los elementos del arreglo en la colá */
        for (String cola11 : cola1) {
            colaUno.encolar(cola11);
        }
        
        /** Creamos la segunda cola */
        Cola<String> colaDos = new Cola<>();
        
        /** Guardamos los elementos del arreglo en la colá */
        for (String cola22 : cola2) {
            colaDos.encolar(cola22);
        }
        
        /** Impresión de true o false si son o no iguales */
        System.out.println("");
        System.out.println(colaUno.equals(colaUno, colaDos));
    }  
}
