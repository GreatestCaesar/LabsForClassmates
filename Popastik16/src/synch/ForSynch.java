package synch;

import MyException.MyException;
import laba_12.Encryption;
import shipp.Ship;

public class ForSynch extends Thread{
    Encryption e;
    public ForSynch(Encryption e){
        super("Синхронизация");
        this.e = e;
        start();
    }

    public void run(){
        System.out.println("Создались все");
        synchronized (e){
            System.out.println("В мониторе сейчас" + Thread.currentThread());
            try {
                e.enc();
            } catch (MyException myException) {
                myException.printStackTrace();
            }
        }
    }
}
