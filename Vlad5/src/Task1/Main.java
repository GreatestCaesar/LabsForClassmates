package Task1;

public class Main {
    public static void main(String[] args){
        TV tv = new TV("LG","DS-4033",2018,70.5);
        System.out.println(tv);
        tv.newtv();
        tv.adddiiagonal();
        tv.prod(1);
        PC pc = new PC("Asus",2019,2.99,8);
        System.out.println(pc);
        pc.addvol();
        pc.addram(2);
        System.out.println(pc.type());
        MobilePhone mp = new MobilePhone("Обычный",0.5,5.5,2040);
        System.out.println(mp);
        mp.addacum();
        mp.newp("Сенсорный");
        mp.remgage();
    }
}
