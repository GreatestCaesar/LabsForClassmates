package Synch;

public class ForSynch extends Thread{
    Object o;
    public ForSynch(Object o){
        super("Синхронизация");
        this.o = o;
        start();
    }

    public void run(){
        System.out.println("Входим в гиперпространство...");
        synchronized (o){
            System.out.println(o);
        }
    }
}
