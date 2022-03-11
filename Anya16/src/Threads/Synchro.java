package Threads;

import Cipher.Encryptyon;
import MyException.MyException;

public class Synchro extends Thread{
    Encryptyon e;
    public Synchro(Encryptyon e){
        super("Синхронизация");
        this.e = e;
        start();
    }

    public void run(){
        System.out.println("Создался поток");
        synchronized (e){
            try {
                e.enc("Черные в белых костюмах, встали раньше меня, справят половую нужду в коридоре и подотрут, пока я их не накрыл.");
            } catch (MyException myException) {
                myException.printStackTrace();
            }
        }
    }
}
