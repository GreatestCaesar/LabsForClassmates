package Cipher;

public class ForSync extends Thread{
    Encryptyon2_0 e;
    public ForSync(Encryptyon2_0 e){
        super("Поток зашифровки и расшифровки");
        this.e = e;
        start();
    }

    public void run(){
        System.out.println("Кто успел того и тапки!");
        synchronized (e){
            e.Encryptyon();
        }
    }
}
