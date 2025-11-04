/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad04;

/**
 * Clase que representa un nodo en la lista enlazada
 * 
 * @author Susana Cárdenas Vázquez
 * @author 1.0  21/10/2025
 */
public class Nodo<T> {
    private int coeficiente;
    private int exponente;
    private Nodo siguiente;
    
    public Nodo(int coeficiente, int exponente) {
        this.coeficiente = coeficiente;
        this.exponente = exponente;
        this.siguiente = null;
    }
    
    public int getCoeficiente() {
        return coeficiente;
    }
    
    public void setCoeficiente(int coeficiente) {
        this.coeficiente = coeficiente;
    }
    
    public int getExponente() {
        return exponente;
    }
    
    public void setExponente(int exponente) {
        this.exponente = exponente;
    }
    
    public Nodo getSiguiente() {
        return siguiente;
    }
    
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
