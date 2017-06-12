/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoprogramming;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author asortega
 */
public class ListaArray implements Runnable {
    //constructor
    public ListaArray(){
        run();
    }
    
    private CopyOnWriteArrayList<String> wordList = new CopyOnWriteArrayList<>();
    
    
    @Override
    public void run() {
        System.out.println(wordList.add("A"));
        System.out.println(wordList.add("B"));
        System.out.println(wordList.add("C"));
        System.out.println(wordList.add("D"));
    }
    
   
    public static void main (String ... args){
        ExecutorService es = Executors.newCachedThreadPool();
        ListaArray lista = new ListaArray();
        es.submit(lista); es.submit(lista); es.shutdown();
        
        //imprimir
        new ListaArray();
        
    }
    
}
