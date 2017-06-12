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
public class concernThreads {
    //hilo1
    //hilo2
    
    //SHARED DATA
    //Static and instance fields are potentially shared by threads
    private int i;//ejemplo de un field 
    //regresa un unico valor
    public int obtenerSiguiente(){
        return i++;
    }
    
    //FUNCIONALIDAD:
    //AL FIELD i SE LE ASIGNA UN VALOR
    //DESPUES ESTE SE COPIA 
    //SE AGREGA VALOR +1
    //Y SE COPIA DE NUEVO AL FIELD
    
    //PROBLEMA:
    //QUE PASA SI SE INTERRUMPE EL PROCESO ANTES DE QUE TEERMINE DE COPIARSE
    //la razon del por que de los instance y static fields...
    //SON CREADOS EN UN AREA DE MEMORIA CONOCIDA COMO HEAP
    //PUEDE SER COMPARTIDA X CADA THREAD
    
    
    
}
