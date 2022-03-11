package Threads;

import Cipher.*;
import MyException.MyException;

public class SynchDec extends Thread{
    private Decryptyon d;
    public SynchDec(Decryptyon d){
        super("Синхронизация");
        this.d = d;
        start();
    }

    public void run(){
        synchronized (d){
            d.dec();
        }
    }
}
