/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoprogramming;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author asortega
 */
public class PaqueteConcurrencia {
    //LOS METODOS DENTRO DEL PAQUETE SON ATOMICOS
    //QUIERE DECIR QUE NINGUN OTRO HILO PUEDE ACCESAR A UNA ESPECIFICA VARIABLE HASTA QUE EL TRO METODO TERMINE
    
    public PaqueteConcurrencia(){
        atomicPackage();
    }
    
    public void atomicPackage(){
        AtomicInteger ai = new AtomicInteger(8);
        System.out.println("Nuevo valor: " + ai.incrementAndGet());//NINGUN OTRO METODO PUEDE ACCESAR A AI HASTA QUE TERMINE
        System.out.println("Nuevo valor: " + ai.getAndIncrement());
        System.out.println("Nuevo valor: " + ai.getAndDecrement());
    }
    //cyclicBarrier es un ejemplo de la categoria de sincronizacion
    public void cyclickBarrierPackage(){
        final CyclicBarrier ciclic = new CyclicBarrier(2);//dos hilos deben esperar hasta que se desbloquee
        AtomicInteger threadCount = new AtomicInteger(0);
        ExecutorService es = Executors.newFixedThreadPool(4);
        PaqueteConcurrencia ex = new PaqueteConcurrencia();
        //es.submit(ex);  -- Porque no jala?
        //es.submit(ex);
        es.shutdown();
        //si nunca alcanza el dos nunca continua
        //se usa si se sabe cuantas veces va a ser ejecutado
    }
    
    public static void main(String ... args){
        new PaqueteConcurrencia();
    }
}
