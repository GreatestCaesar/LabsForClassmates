package Threads;

import Cipher.Decryptyon;
import MyException.MyException;

public class ThreadDecryptyon extends Thread{
    private Decryptyon d;
    public ThreadDecryptyon(Decryptyon d){
        super("Поток расшифровки");
        this.d = d;
        start();
    }

    public void run(){
        try {
            Thread.sleep(2000);
            d.dec();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
