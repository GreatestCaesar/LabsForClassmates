package Thread;

import laba_12.Encryption;

public class ThreadEnc extends Thread {
    private String word;
    private String text;
    private Encryption e;

    public ThreadEnc(String word, String text, Encryption e){
        super("Поток расшифровки");
        this.word = word;
        this.text = text;
        this.e = e;
        start();
    }

    public void run(){
        e.enc(word,text);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }
}
