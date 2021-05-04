
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
public class ThreadUomo extends Thread {
    Semaforo uomo;

    public ThreadUomo(Semaforo uomo) {
        this.uomo = uomo;
    }

    public void run() {
     
            uomo.P();//vedo se il bagno è libero, se non è libero vado in wait
            System.out.println(Thread.currentThread().getName() + " è entrato nel bagno");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadUomo.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(Thread.currentThread().getName() + "Esce dal bagno");
            uomo.V();//rilascio il bagno
    
    }
}
