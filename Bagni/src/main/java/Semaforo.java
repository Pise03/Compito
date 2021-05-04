
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class Semaforo {
    int val;

    public Semaforo(int val) {
        this.val = val;
    }
    
    synchronized public void P(){
        while(val == 0){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Semaforo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        val--;
    }
    
    synchronized public void V(){
        val++;
        notify();
    }
}
