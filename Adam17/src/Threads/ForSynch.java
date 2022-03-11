package Threads;


public class ForSynch extends Thread{
    Object o;

    public ForSynch(Object o){
        super("Синхронизация " + o.getClass());
        this.o = o;
        start();
    }


    @Override
    public void run() {
        System.out.println("Пошла синхронизация\n");
        synchronized (o){
            System.out.println(o);
            System.out.println("В мониторе - " + this.getName());
        }
    }
}
