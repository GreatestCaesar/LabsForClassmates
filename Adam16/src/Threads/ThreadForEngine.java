package Threads;

import Engine.Engine;

public class ThreadForEngine extends Thread{
    Engine e;

    public ThreadForEngine(Engine e){
        super("Поток для двигателя");
        this.e = e;
        start();
    }

    public void run(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        e.change();
        e.fuel("Дизель");
        e.rep(6000);
        System.out.println(e);
    }
}
