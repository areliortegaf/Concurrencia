/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoprogramming;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author asortega
 */
public class hilo2 implements Callable {
    //CALLABLE TASK
    //la interface callable corre en los genericos
    //La interface callable tira una exception y cuanta con un unico metodo (CALL) que regresa un tipo
    //mas que un tipo es una subclase futura
    
    private final String nombre;
    private final int len;
    private int sum = 0;
    
private hilo2 (String nombre, int len){
    this.nombre = nombre;
    this.len = len;
}
    

    @Override
    public Object call() throws Exception {
        for(int i=0; i<len; i++){
            System.out.println(nombre + " : " + i);
            sum+=i;
        }
        return "sum: " + sum;
    }
    //la interface Future es usada para obtener el resultado de un Callable's V call() Metodo
    public void ejemploFuture(){
        ExecutorService es = Executors.newFixedThreadPool(4);
        Future<String> f1 = es.submit(new hilo2("uno",10));//los dos parametro por el constructor
        Future<String> f2 = es.submit(new hilo2("dos",20));
        
        try{
            es.shutdown();
            es.awaitTermination(5, TimeUnit.SECONDS);
            String redultado1 = f1.get();
            String resultado2 = f2.get();
            System.out.println(redultado1);
            System.out.println(resultado2);
        }catch(ExecutionException | InterruptedException e){
            System.out.println("Exception: " + e);
        }
    }
    
    
}
