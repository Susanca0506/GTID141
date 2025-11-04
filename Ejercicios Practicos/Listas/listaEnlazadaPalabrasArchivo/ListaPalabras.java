/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad02;

/**
 *
 * @author carde
 */
public class ListaPalabras {
    private Nodo cabeza;

    public ListaPalabras() {
        this.cabeza = null;
    }
    
    public void insertar(String palabra){
        //Nodo con valor de cabeza
        Nodo temp = cabeza;
        
        //Creación de nodo nuevo
        Nodo nuevo = new Nodo(palabra);
        
        //Proceso si la cabeza es nula
        if (cabeza == null) {
            cabeza = nuevo;
        } else{
            //Proceso si la cabeza no es nula
            while (temp.getIzquierda()!=null) {
                //Recorre al siguiente nodo
                temp = temp.getIzquierda();
            }
            
            //Agrega el nuevo nodo al final
            temp.setIzquierda(nuevo);
        }
    }
    
    //Método para eliminar palabra en especifico
    public boolean eliminar(String palabra){
        if(cabeza == null){
            return false;
        }
        
        //Buscar palabra en la lista
        Nodo temp = cabeza;
        
        while (temp.getIzquierda() != null) {
            if(temp.getIzquierda().getDato().equals(palabra)){
                temp.setIzquierda(temp.getIzquierda().getIzquierda());
                
                return true;
            }
            temp = temp.getIzquierda();
        }
        
        return false;
    }
    
    //Método para verificar si la lista contiene una palabra en especifico
    public boolean verificarPalabra(String palabra){
        Nodo temp = cabeza;
        
        while (temp != null) {
            if(temp.getDato().equals(palabra)){
                return true;
            }
            temp = temp.getIzquierda();
        }
        return false;
    }
    
    //Método para verificar si la lista está vacía
    public boolean isEmpty(){
        return cabeza == null;
    }
    
    //Método para mostrar todas las palabras
    public void mostrar(){
        if(isEmpty()){
            System.out.println("La lista está vacía");
            return;
        }
        
        Nodo temp = cabeza;
        System.out.println("Palabras en la lista");
        while (temp != null) {
            System.out.print(temp.getDato() + " ");
            temp = temp.getIzquierda();
        }
        System.out.println();
    }
    
    // Método para obtener todas las palabras como array
    public String[] array() {
        // Primero contamos los elementos
        int cont = 0;
        Nodo temp = cabeza;
        while (temp != null) {
            cont++;
            temp = temp.getIzquierda();
        }
        
        // Creamos array y lo llenamos
        String[] palabras = new String[cont];
        temp = cabeza;
        int index = 0;
        
        while (temp != null) {
            palabras[index++] = temp.getDato();
            temp = temp.getIzquierda();
        }
        
        return palabras;
    }
}
