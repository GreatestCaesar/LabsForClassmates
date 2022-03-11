package Threads;

import Plante.Plant;

public class ThreadForPlant extends Thread{
    Plant p;

    public ThreadForPlant(Plant p){
        super("Поток для завода");
        this.p = p;
        start();
    }

    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        p.change();
        p.types();
        System.out.println(p);
    }
}
