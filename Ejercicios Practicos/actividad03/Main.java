/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad03;

import java.util.Scanner;

/**
 * Clase main que manejará los métodos creados en 
 * las clases Nodo y ListaPolinomios.
 * 
 * @author Susana Cárdenas Vázquez
 * @author 1.0  21/10/2025
 */

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ListaPolinomio polinomio = new ListaPolinomio();
        
        // 1. Entrada del polinomio
        System.out.println("POLINOMIO");
        System.out.print("Cuantos terminos tiene el polinomio? ");
        int cantidad = scanner.nextInt();
        
        if (cantidad <= 0) {
            System.out.println("Error: Debe ingresar al menos un termino.");
            scanner.close();
            return;
        }
        
        System.out.println("\nIngrese los terminos (coeficiente y exponente):");
        
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Termino " + i + ":");
            System.out.print("  Coeficiente: ");
            int coeficiente = scanner.nextInt();
            
            System.out.print("  Exponente: ");
            int exponente = scanner.nextInt();
            
            polinomio.insertar(coeficiente, exponente);
            System.out.println();
        }
        
        //Mostrar Polinomio
        System.out.println("\n" + "=".repeat(55));
        System.out.println("POLINOMIO INGRESADO");
        polinomio.mostrarPolinomio();
        
        //Evaluación de polinomio
        System.out.println("EVALUACION DEL POLINOMIO");
        System.out.println("Evaluando desde x = 0.0 hasta x = 5.0");
        System.out.println("Incremento: 0.5");
        
        polinomio.evaluarRango();
        
        // Opción para evaluar valores específicos
        System.out.println("\n Desea evaluar valores específicos de x? (s/n): ");
        String respuesta = scanner.next();
        
        while (respuesta.equalsIgnoreCase("s")) {
            System.out.print("Ingrese el valor de x: ");
            double x = scanner.nextDouble();
            double resultado = polinomio.evaluar(x);
            System.out.printf("P(%.2f) = %.2f%n", x, resultado);
            
            System.out.print("\n¿Desea valuar otro valor? (s/n): ");
            respuesta = scanner.next();
        }
    }
    
}
