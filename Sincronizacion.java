/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoprogramming;

/**
 *
 * @author asortega
 */
public class Sincronizacion {
    
    //El KeyWord synchronized se usa para crear bloques de codigo seguro
    //hace que el hilo guarde en memoria principal todos los cambios, cuando se llega al final del block
    //es usado para agrupar bloques de codigo para exclusiva ejecucucion
    //los hilos se bloquean hasta que obtengan acceso exclusivo
    //resulve el problema atomico(no accesa al objeto hasta que este en un estado confirmado)
    
    private static int i = 0;
    
    //EJ. SINCRONIZACION DE METODOS
    public synchronized void incremento(){
        i++;
    }
    
    public synchronized void decremento(){
        i--;
    } 
    public synchronized int obtenerValor(){
        return i;
    }
    
    //EJ SINCRONIZAR UN BLOQUE
    //SI ES UNA VARIABLE ESTATICA, SE USA UN BLOQUEO ESTATICO
    //SI ES UNA VARIABLE DE INSTANCIA, UN BLOQUE DE INSTANCIA (MONITOR)
    
    //OBJECT MONITOR LOCKING
    //cada objeto en java esta asociado con un monitor, el cual puede bloquear o desbloquear un hilo
    //LOS METODOS CON synchronized usan el monitor para THIS object.
    //STATIC SYNCHRONIZED methods usan el monitor de las clases
    //synchronized blocks deben de esfecificar que monitor de que objeto bloquear o desbloquear
    //synchronized blocks can be nested
    
    
}
