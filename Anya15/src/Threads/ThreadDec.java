package Threads;

import Cipher.Decryprtyon;

public class ThreadDec extends Thread{
    Decryprtyon d;
    public ThreadDec(Decryprtyon d){
        super("Асинхронные потоки");
        this.d = d;
        start();
    }

    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        d.dec();
    }
}
