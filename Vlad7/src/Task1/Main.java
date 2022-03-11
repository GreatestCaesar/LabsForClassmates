package Task1;

public class Main {
    public static void main(String[] args){
        TV tv = new TV("LG","DS-4033",2018,70.5,16,1080,5.6,3);
        System.out.println(tv);
        tv.newtv();
        tv.adddiiagonal();
        tv.prod(1);
        System.out.println(tv.smart());
        System.out.println(tv.time());
        System.out.println("Вес уменьшился с " + tv.getWeight() + " до " + tv.weight());
        tv.col(2);
        tv.newtv(120);
        tv.towns("Витебск","Барановичи","Ляховичи","Пинск");
        tv.diagonal(44.5,23.4,66.5,29,95.4,95.2);
        PC pc = new PC("Asus",2019,2.99,8,"Windows 10",3.6,5000,4.5);
        System.out.println(pc);
        pc.addvol();
        pc.addram(2);
        System.out.println(pc.type());
        System.out.println(pc.vers());
        System.out.println(pc.wei());
        pc.scr();
        pc.tact();
        pc.addvol(2.5);
        pc.type("2 ноутбука","1 стационарный","3 игровых","10 комплектов видеокарт");
        MobilePhone mp = new MobilePhone("Обычный",0.5,5.5,2040,1,"FullHD",34.4,128);
        System.out.println(mp);
        mp.addacum();
        mp.newp("Сенсорный");
        mp.remgage();
        System.out.println(mp.NFC(1));
        mp.mem();
        System.out.println(mp.memo());
        System.out.println(mp.sim());
        mp.acum(1080,2040,3000,5010,2060,2020);
        mp.NFC();

    }
}
