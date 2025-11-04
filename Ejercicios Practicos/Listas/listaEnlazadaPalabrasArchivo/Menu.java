/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author carde
 */
public class Menu {
    private String archivo;
    private ListaPalabras lista;

    public Menu(String archivo) {
        this.archivo = archivo;
        this.lista = new ListaPalabras();
        System.out.println("Buscando archivo en "+ new File(".").getAbsolutePath());
    }
    
    public void leerArchivo(){
        try{
            File file = new File(archivo);
            if(!file.exists()){
                System.out.println("El archivo no existe.");
                return;
            }
            
            Scanner teclado = new Scanner(file);
            
            while (teclado.hasNext()) {
                String palabra = teclado.next();
                lista.insertar(palabra);
            }
            
            teclado.close();
        } catch (FileNotFoundException e){
            System.out.println("Error: No se pudo leer el archivo: "+archivo);
            
        }
    }
    
    //Método para escribir palabras al archivo
    public void escribirArchivo() {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(archivo));
            
            String[] words = lista.array();
            for (int i = 0; i < words.length; i++) {
                writer.print(words[i]);
                if (i < words.length - 1) {
                    writer.print(" ");
                }
            }
            
            writer.close();
            System.out.println("Palabras escritas en el archivo: " + words.length);
            
        } catch (IOException e) {
            System.out.println("Error: No se pudo escribir en el archivo: " + archivo);
        }
    }
    
    //Método para agregar una palabra
    public static void agregarPalabra(String palabra){
        if(palabra != null && !palabra.trim().isEmpty()){
            System.out.println("Palabra '"+palabra+"' agregada exitosamente");
        }else{
            System.out.println("Error: La palabra no puede estar vacía");
        }
    }
    
    //Método para eliminar una palabra 
    public void eliminarPalabra(String palabra){
        if(lista.eliminar(palabra)){
            System.out.println("Palabra '"+palabra+"' eliminada exitosamente");
        }else{
            System.out.println("Error: La palabra '"+palabra+"' no se encontró en la lista");
        }
    }
    
    //Método para mostrar el menú
    public static void menu() {
        System.out.println("\n=== GESTOR DE LISTA DE PALABRAS ===");
        System.out.println("[1] Mostrar palabras");
        System.out.println("[2] Agregar palabra");
        System.out.println("[3] Eliminar palabra");
        System.out.println("[4] Guardar y salir");
        System.out.println("[5] Salir sin guardar");
        System.out.print("Seleccione una opción: ");
    }
    
    public void ejecutar(){
        Scanner teclado = new Scanner(System.in);
        
        //Leer archivo
        leerArchivo();
        
        boolean ejecutar = true;
        
        while (ejecutar) {
            menu();
            int opcion = teclado.nextInt();
            teclado.nextLine(); //Limpiar buffer
            
            switch (opcion) {
                case 1:
                    lista.mostrar();
                    break;
                    
                case 2:
                    System.out.println("Ingrese la palabra a agregar: ");
                    String agregar = teclado.nextLine();
                    agregarPalabra(agregar);
                    break;
                
                case 3:
                    System.out.println("Ingrese la palabra a eliminar: ");
                    String eliminar = teclado.nextLine();
                    eliminarPalabra(eliminar);
                    break;
                    
                case 4:
                    escribirArchivo();
                    System.out.println("Cambios guardados");
                    ejecutar = false;
                    break;
                    
                case 5:
                    System.out.println("Saliendo sin guardar cambios. ¡Hasta luego!");
                    ejecutar = false;
                    break;
                      
                default:
                    System.out.println("Opción no válida");
            }
        }
        
        teclado.close();
    }
}
