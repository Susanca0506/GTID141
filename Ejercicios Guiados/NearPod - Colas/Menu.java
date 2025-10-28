
package cola;

import java.util.Scanner;

/**
 * Clase que contiene el menú de las acciones
 * Además de un ciclo que mandentra constantes operaciones.
 * @author Susana Cárdenas Vázquez
 * @author 1.0  24/10/2025
 */
public class Menu {
    //Creación de cola
    private Cola<String> cola = new Cola<>();
    
    //Constructor
    public Menu() {
    }
    
    //Método para mostrar el menú
    public void menu(){
        //variable que almacenará la opción escogida
        int op = 0;
        //Ciclo que mantendrá la iteración del menú
        do {
            Scanner scanner = new Scanner(System.in);
            
            //Impresión del menú
            System.out.println("======== [ MENÚ ] ========");
            System.out.println("{1} Solicitar tamaño");
            System.out.println("{2} Consultar frente");
            System.out.println("{3} Agregar tarea");
            System.out.println("{4} Eliminar tarea");
            System.out.println("{5} Mostrar estado final");
            System.out.println("{6} Salir");
            System.out.println("Escoga la opción de su preferencia: ");
            
            //Almacenamiento de la opción escogida
            op = scanner.nextInt();
            
            scanner.nextLine(); //Limpiamos buffer
            //Método para ejecutar la opción escogida
            casos(op);
        } while (op != 6);
        
        //Despedida
        System.out.println("Hasta luego :D");
        
    }
    
    //Método para ejecutar cada una de las opciones
    public void casos(int op){
        Scanner scanner = new Scanner(System.in);
        
        //Switch para llevar el control de las ejecuciones segun la opción
        switch (op) {
            
            //Caso 1: imprime la cantidad de elementos en la cola
            case 1 -> System.out.println("Tareas: "+cola.tamano());
              
            //Caso 2: imprime el primer elemento de la cola (cabeza)
            case 2 -> System.out.println("Primer tarea: "+cola.peek());
                
            //Caso 3: inserta elementos en la cola
            case 3 -> {
                System.out.println("Escriba la tarea a ingresar: ");
                String elemento = scanner.nextLine();
                cola.encolar(elemento);
                }
             
            //Elimina último elemento de la cola
            case 4 -> System.out.println("Tarea eliminada: "+cola.desencolar());
              
            //Muestra todos los elementos de la cola
            case 5 -> {
                System.out.println("Tareas en cola");
                cola.mostrar();
                }
            
            //Si no se ingresa un valor dentro del indice se avisa al usuario
            default -> {
                if(op != 6){
                    System.out.println("Ingrese un valor correcto");
                }}
        }
    }
}
