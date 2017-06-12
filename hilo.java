/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoprogramming;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author asortega
 */
public class hilo implements Runnable {
    public hilo (String criteria){
        
    }
    

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main (String ... args){
        ExecutorService es = Executors.newCachedThreadPool();
        es.execute(new hilo("uno") );//task one
        es.execute(new hilo("dos") );//task two
        es.shutdown();//preventing from accepting any new calls
        try{
            es.awaitTermination(5, TimeUnit.SECONDS);//5 minutes para teminar lo que ya traia
        }catch(InterruptedException e){
            System.out.println("termino mas temprano");
        }
    }
    
    
    
}
