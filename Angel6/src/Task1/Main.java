package Task1;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        Radio r = new Radio("0.3...3.4",10,15,140,"FS-22",2018,34,3000);
        System.out.println(r.rad());
        r.screen(2);
        r.deincwei(15);
        System.out.println(r);
        System.out.println(r.add());
        r.pow();
        System.out.println(r.rad());
        System.out.println(r.amp());
        System.out.println("......................................................................................................................................");
        Microphone m = new Microphone("Чёрный",1.5,5,12,"Алюиминий",-42000,430,342);
        m.inclen(6);
        System.out.println(m.inc());
        m.decdiam();
        System.out.println(m);
        System.out.println(m.mic());
        System.out.println(m.game());
        m.addsens();
        m.decborder();
        System.out.println("......................................................................................................................................");
        Headphones h = new Headphones(1.2,3.5,"Беспроводные","Пластик","Redni",600,1200,650);
        System.out.println(h.color());
        h.mic(1);
        h.ti();
        System.out.println(h);
        h.color(2);
        h.addbox(150);
        System.out.println(h.as());
        System.out.println(h.type());
        System.out.println("......................................................................................................................................");
    }
}
