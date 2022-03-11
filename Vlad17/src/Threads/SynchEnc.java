package Threads;

import Cipher.Cipher;
import MyException.MyException;

public class SynchEnc extends Thread{
    private Cipher c;
    public SynchEnc(Cipher c){
        super("Синхронизация");
        this.c = c;
        start();
    }

    public void run(){
        synchronized (c){
            try {
                c.enc();
            } catch (MyException e) {
                e.printStackTrace();
            }
        }
    }
}
