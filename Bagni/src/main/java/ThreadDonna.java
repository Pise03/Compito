
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
public class ThreadDonna extends Thread {

    Semaforo donna;

    public ThreadDonna(Semaforo donna) {
        this.donna = donna;
    }

    public void run() {
 
            donna.P();
            System.out.println(Thread.currentThread().getName() + " è entrato nel bagno");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadDonna.class.getName()).log(Level.SEVERE, null, ex);
            }
            donna.V();
       
    }
}
