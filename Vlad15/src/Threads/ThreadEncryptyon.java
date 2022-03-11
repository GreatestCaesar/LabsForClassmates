package Threads;

import Cipher.Cipher;
import MyException.MyException;

public class ThreadEncryptyon extends Thread{
    private Cipher c;
    public ThreadEncryptyon(Cipher c){
        super("Поток зашифровки");
        this.c = c;
        start();
    }

    public void run(){
        try {
            Thread.sleep(1000);
            c.enc();
        } catch (MyException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
