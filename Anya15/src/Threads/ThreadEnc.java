package Threads;

import Cipher.Encryptyon;
import MyException.MyException;

public class ThreadEnc extends Thread{
    Encryptyon e;
    public ThreadEnc(Encryptyon e){
        super("Асинхронные потоки");
        this.e = e;
        start();
    }

    public void run(){
        try {
            Thread.sleep(2000);
            e.enc("Черные в белых костюмах, встали раньше меня, справят половую нужду в коридоре и подотрут, пока я их не накрыл.");
        } catch (MyException | InterruptedException myException) {
            myException.printStackTrace();
        }
    }
}
