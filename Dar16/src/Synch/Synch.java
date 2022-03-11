package Synch;

import Cipher.Encryption;

public class Synch extends Thread{
    Encryption e;
    public Synch(Encryption e){
        super("Синхронизация");
        this.e = e;
        start();
    }

    public void run(){
        System.out.println("Начало работы");
        synchronized (e){
            System.out.println("В мониторе: " + Thread.currentThread());
            e.enc();
        }
    }
}
