
package simulacionSupermercado;

/**
 * Clase main que ejecuta el programa completo para
 * la simulación de supermercado con carritos y cajas
 * 
 * @author Susana Cárdenas Vázquez
 * @author 1.0  03/10/2025
 */
public class Main {
    public static void main(String[] args) {
        /** Crear cola */
        Cola<Integer> carritosDisponibles = new Cola<>();
        
        /** Inicialización de los 25 carritos */
        for (int i = 1; i <= 25; i++) {
            carritosDisponibles.encolar(i);
        }
        
        /** Crear las colas para las 3 cajas */
        Cola<Integer> caja1 = new Cola<>();
        Cola<Integer> caja2 = new Cola<>();
        Cola<Integer> caja3 = new Cola<>();
        
        /** Simulación con 5 clientes */
        /** Primer cliente */
        System.out.println("Llegada del cliente 1");
        
        /** Validar que haya carritos disponibles */
        if (!carritosDisponibles.isEmpty()) {
            
            /** Quitar carrito */
            int carrito1 = carritosDisponibles.desencolar();
            System.out.println("Cliente 1 toma su carrito y realiza sus compras");
            
            /** El cliente se forma en la caja con menos fila */
            caja1.encolar(1);
            System.out.println("Cliente 1 formado en Caja 1");
            System.out.println("");
        }
        
        /** Segundo cliente */
        System.out.println("Llegada de cliente 2");
        
        /** Validar que haya carritos disponibles */
        if (!carritosDisponibles.isEmpty()) {
            
            /** Quitar carrito */
            int carrito2 = carritosDisponibles.desencolar();
            System.out.println("Cliente 2 toma su carrito y realiza sus compras");
            
            /** El cliente se forma en la caja con menos fila */
            caja2.encolar(2);
            System.out.println("Cliente 2 formado en Caja 2");
            System.out.println("");
        }
        
        /** Tercer cliente */
        System.out.println("Llegada de cliente 3");
        
        /** Validar que haya carritos disponibles */
        if (!carritosDisponibles.isEmpty()) {
            
            /** Quitar carrito */
            int carrito3 = carritosDisponibles.desencolar();
            System.out.println("Cliente 3 toma su carrito y realiza sus compras");
            
            /** El cliente se forma en la caja con menos fila */
            caja3.encolar(3);
            System.out.println("Cliente 3 formado en Caja 3");
            System.out.println("");
        }
        
        /** Cuarto cliente */
        System.out.println("Llegada de cliente 4");
        
        /** Validar que haya carritos disponibles */
        if (!carritosDisponibles.isEmpty()) {
            
            /** Quitar carrito */
            int carrito4 = carritosDisponibles.desencolar();
            System.out.println("Cliente 4 toma su carrito y realiza sus compras");
            
            /** El cliente se forma en la caja con menos fila */
            caja1.encolar(4);
            System.out.println("Cliente 4 formado en Caja 1");
            System.out.println("");
        }
        
        /** Quinto cliente */
        System.out.println("Llegada de cliente 5");
        
        /** Validar que haya carritos disponibles */
        if (!carritosDisponibles.isEmpty()) {
            
            /** Quitar carrito */
            int carrito5 = carritosDisponibles.desencolar();
            System.out.println("Cliente 5 toma su carrito y realiza sus compras");
            
            /** El cliente se forma en la caja con menos fila */
            caja2.encolar(5);
            System.out.println("Cliente 5 formado en Caja 2");
            System.out.println("");
            
        }
        
        /** Situación despues del ingreso de los 5 clientes */
        System.out.println("");
        System.out.println("Carritos disponibles: " + carritosDisponibles.tamano());
        System.out.println("Caja 1 tiene " + caja1.tamano() + " clientes");
        System.out.println("Caja 2 tiene " + caja2.tamano() + " clientes");
        System.out.println("Caja 3 tiene " + caja3.tamano() + " clientes");
        
        /** Atender cajas */
        System.out.println("");
        System.out.println("Caja 1");
        
        /** Validar que la caja no este vacía */
        if (!caja1.isEmpty()) {
            
            /** Recolectar y eliminar el primero en la cola */
            int clienteAtendido = caja1.desencolar();
            
            /** Aviso de cliente atendio */
            System.out.println("Cliente " + clienteAtendido + " atendido");
            
            /** Encolar carrito desocupado */
            carritosDisponibles.encolar(clienteAtendido);
        }
        
        /** Caja 2 */
        System.out.println("");
        System.out.println("Caja 2");
        
        /** Validar que la caja no este vacía */
        if (!caja2.isEmpty()) {
            
            /** Recolectar y eliminar el primero en la cola */
            int clienteAtendido = caja2.desencolar();
            
            /** Aviso de cliente atendio */
            System.out.println("Cliente " + clienteAtendido + " atendido");
            
            /** Encolar carrito desocupado */
            carritosDisponibles.encolar(clienteAtendido);
        }
        
        /** Caja 3 */
        System.out.println("");
        System.out.println("Caja 3");
        
        /** Validar que la caja no este vacía */
        if (!caja3.isEmpty()) {
            
            /** Recolectar y eliminar el primero en la cola */
            int clienteAtendido = caja3.desencolar();
            
            /** Aviso de cliente atendio */
            System.out.println("Cliente " + clienteAtendido + " atendido");
            
            /** Encolar carrito desocupado */
            carritosDisponibles.encolar(clienteAtendido);
        }
        
        /** Mostrar estado despues de atender 5 clientes */
        System.out.println("");
        System.out.println("Carritos disponibles: " + carritosDisponibles.tamano());
        System.out.print("Carritos: ");
        carritosDisponibles.mostrar();
        System.out.println("");
        System.out.println("");
        System.out.println("Clientes en Caja");
        System.out.println("Caja 1: " + caja1.tamano() + " clientes");
        
        System.out.println("Caja 2: " + caja2.tamano() + " clientes");
        
        System.out.println("Caja 3: " + caja3.tamano() + " clientes");
        System.out.print("  ");
        
    }
}
