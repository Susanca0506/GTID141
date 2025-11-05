
package simulacionAtencionClienteSupermercadoEsperanza;

/**
 * Clase main que ejecuta el programa completo para
 * la simulación del supermercado Esperanza
 * 
 * @author Susana Cárdenas Vázquez
 * @author 1.0  05/10/2025
 */

public class Main {
    public static void main(String[] args) {
        /**Variables para la simulación */
        int HORAS = 7;
        int MINUTOS_TOTALES = HORAS * 60;
        int TIEMPO_POR_CAJA = 3; /* Aprox. 3min por cliente*/
        
        /** Cración de la cola */
        Cola<String> filaClientes = new Cola<>();
        
        /** Creación de cajas */
        int[] cajas = new int[4]; /** 3 cajas más una auxiliar*/
        boolean cuartaCajaAbierta = false;  /** Cerrar y abrir cajas */
        int cuartaCaja = 0;
        
        /** Variables acumuladoras */
        int totalClientesAtendidos = 0;
        int clientesGenerados = 0;
        int maximoFila = 0;
        int tiempoMaximoEspera = 0;
        int sumaEspera = 0;
        int sumaTamanosFila = 0;
        int contadorMediciones = 0;
        
        /** Ciclo que mantendrá la llegada de clientes */
        for (int minuto = 1; minuto <= MINUTOS_TOTALES; minuto++) {
            
            /** Simulación de llegada de clientes
             Este se calcula con un 82% de probabilidades
             de que llegue un cliente por minuto*/
            if (Math.random() < 0.8) {
                
                /** Aumentamos contador de los clientes generados */
                clientesGenerados++;
                
                /** Encolamos cliente */
                filaClientes.encolar(clientesGenerados + "-" + minuto);
                
                /** Aviso de llegada de cliente */
                if (minuto <= 30 || minuto % 60 == 0) {
                    System.out.println("Min " + minuto + ": Cliente " + clientesGenerados + " ingresa");
                }
            }
            
            /** Validación para saber si es necesario abrir la cuarta caja  */
            if (!cuartaCajaAbierta && filaClientes.tamano() > 20) {
                
                /** Abrimos caja */
                cuartaCajaAbierta = true;
                cuartaCaja = minuto;
                
                /** Aviso de apertura */
                System.out.println("");
                System.out.println("Min " + minuto + " - Abrir Cuarta Caja (Fila: " + 
                                 filaClientes.tamano() + ")");
                System.out.println("");
            }
            
            /** Atención en las cajas */
            /** Revisamos cuantas cajas estan activas */
            int cajasActivas = cuartaCajaAbierta ? 4 : 3;
            
            /** Control de las cajas activas */
            for (int i = 0; i < cajasActivas; i++) {
                if (cajas[i] > 0) {
                    cajas[i]--; /** Decrementar tiempo*/
                } else if (!filaClientes.isEmpty()) {
                    
                    /** Atender cliente
                     Desencolamos cliente atendido*/
                    String clienteInfo = filaClientes.desencolar();
                    
                    /** Información de cliente atendido */
                    String[] partes = clienteInfo.split("-");
                    int idCliente = Integer.parseInt(partes[0]);
                    int minutoLlegada = Integer.parseInt(partes[1]);
                    
                    cajas[i] = TIEMPO_POR_CAJA;
                    
                    /** Calcular el tiempo de espera */
                    int tiempoEspera = minuto - minutoLlegada;
                    sumaEspera += tiempoEspera;
                    
                    if (tiempoEspera > tiempoMaximoEspera) {
                        tiempoMaximoEspera = tiempoEspera;
                    }
                    
                    /** Incremento de clientes atendidos */
                    totalClientesAtendidos++;
                    
                    /** Aviso */
                    if (minuto <= 30 || totalClientesAtendidos % 50 == 0) {
                        System.out.println("");
                        System.out.println("Min " + minuto + ": Caja " + (i+1) + 
                                         " atiende Cliente " + idCliente + 
                                         " (Espero: " + tiempoEspera + " min)");
                        System.out.println("");
                    }
                }
            }
            
            /** Calculo de estadisticas */
            int tamanoActual = filaClientes.tamano();
            if (tamanoActual > maximoFila) {
                maximoFila = tamanoActual;
            }
            sumaTamanosFila += tamanoActual;
            contadorMediciones++;
            
            /** Mostrar estados del supermercado */
            if (minuto % 60 == 0) {
                System.out.println("");
                System.out.println("Estado: Hora " + (minuto/60) + " ---");
                System.out.println("Clientes en fila: " + tamanoActual);
                System.out.println("Atendidos: " + totalClientesAtendidos);
                System.out.println("Cajas activas: " + cajasActivas);
                System.out.println("");
            }
        }
        
        /** Calculo de las estadisticas finales*/
        double tamanoPromedioFila = (double) sumaTamanosFila / contadorMediciones;
        double tiempoPromedioEspera = totalClientesAtendidos > 0 ? 
                                      (double) sumaEspera / totalClientesAtendidos : 0;
        
        /** Mostrar estado final */
        System.out.println("");
        System.out.println("Estado final");
        System.out.println("");
        System.out.println("Clientes que ingresaron: " + clientesGenerados);
        System.out.println("Clientes aun en cola: " + filaClientes.tamano());
        System.out.println();
        System.out.println("Tamano maximo de fila: " + maximoFila + " clientes");
        System.out.println("Tamano promedio de fila: " + String.format("%.2f", tamanoPromedioFila) + " clientes");
        System.out.println();
        System.out.println("Tiempo maximo de espera: " + tiempoMaximoEspera + " minutos");
        System.out.println("Tiempo promedio de espera: " + String.format("%.2f", tiempoPromedioEspera) + " minutos");
        System.out.println();
        
        /** Estadisticas de cuarta caja */
        if (cuartaCajaAbierta) {
            System.out.println("Cuarta caja abierta en minuto: " + cuartaCaja + 
                             " (" + (MINUTOS_TOTALES - cuartaCaja) + " min activa)");
        } else {
            System.out.println("Cuarta caja: NO fue necesaria");
        }
        
    }
}