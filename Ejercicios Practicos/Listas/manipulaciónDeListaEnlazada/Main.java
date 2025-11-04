
package actividad01;

import java.util.Scanner;

/**
 * Clase main que manejará los métodos creados en 
 * las clases Nodo y Numeros.
 * Manejara la insercción, eliminación y el ingreso del 
 * límite.
 * 
 * @author Susana Cárdenas Vázquez
 * @author 1.0  18/10/2025
 */
public class Main {
    public static void main(String[] args) {
        //Creación de objetos
        Scanner scanner = new Scanner(System.in);
        Numeros<Number> listaEnlazada = new Numeros<Number>();
        
        //Inserción de números al azar
        listaEnlazada.insertar(15);
        listaEnlazada.insertar(81);
        listaEnlazada.insertar(220);
        listaEnlazada.insertar(200);
        listaEnlazada.insertar(27);
        listaEnlazada.insertar(824);
        listaEnlazada.insertar(532);
        listaEnlazada.insertar(238);
        
        //Impresión de lista
        System.out.println("Datos en lista: ");
        listaEnlazada.recorrer(); //Método para imprimir la lista
        
        //Solicitud de valor límite
        System.out.println("Valor límite: ");
        int n = scanner.nextInt();
        
        //Método para eliminar los valores mayores al límite
        listaEnlazada.eliminarMayores(n);
        
        //Impresión de la nueva lista
        System.out.println("Nueva lista: ");
        listaEnlazada.recorrer(); //Método para imprimir la lista
    }

}
