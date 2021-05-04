/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class BagnoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here

        Semaforo uomo = new Semaforo(1); //creo il semaforo che gestice il bagno uomo
        Semaforo donna = new Semaforo(1); //creo il semaforo che gestice il bagno uomo
        
        Thread uomo1 = new ThreadUomo(uomo);
        uomo1.setName("uomo1");
        
        Thread uomo2 = new ThreadUomo(uomo);
        uomo2.setName("uomo2");
        
        Thread donna1 = new ThreadDonna(donna);
        Thread donna2 = new ThreadDonna(donna);
        
        donna1.setName("donna1");
        donna2.setName("donna2");
        
        uomo1.start();
        uomo2.start();
        
        donna1.start();
        donna2.start();
    
    }
    
}
