package Thread;

import laba_12.Decryption;
import laba_12.Encryption;

public class ThreadDec extends Thread{
    private String word;
    private String text;
    private Decryption d;

    public ThreadDec(String word, String text, Decryption d){
        super("Поток расшифровки");
        this.word = word;
        this.text = text;
        this.d = d;
        start();
    }

    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        d.dec(word,text);
    }
}
