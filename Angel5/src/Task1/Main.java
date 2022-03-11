package Task1;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        Radio r = new Radio("0.3...3.4",10,15,140);
        System.out.println(r.rad());
        r.screen(2);
        r.deincwei(15);
        System.out.println(r);
        Microphone m = new Microphone("Чёрный",1.5,5,12);
        m.inclen(6);
        System.out.println(m.inc());
        m.decdiam();
        System.out.println(m);
        Headphones h = new Headphones(1.2,3.5,"Беспроводные","Пластик");
        System.out.println(h.color());
        h.mic(1);
        h.ti();
        System.out.println(h);
    }
}
