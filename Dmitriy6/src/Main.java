public class Main {
    public static void main(String[] args){
        Dictaphone d = new Dictaphone("DS-1203",2,58,true,22);
        System.out.println(d);
        d.recording();
        d.listening();
        System.out.println(d.allrecord());
        System.out.println("#############################################################################");
        Tablet t = new Tablet("12 1.3.45","P 10 Lite",100,74,16);
        System.out.println(t);
        t.eco();
        t.incbright();
        t.update(1);
        System.out.println(t.mode(0));
        System.out.println("#############################################################################");
        TV tv = new TV(true,15,"Чёрный",2,"4K");
        System.out.println(tv);
        tv.mode();
        tv.vol();
        System.out.println(tv.info());
        System.out.println("#############################################################################");
    }
}
