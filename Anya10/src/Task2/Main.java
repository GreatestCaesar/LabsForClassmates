package Task2;

public class Main {
    public static void main(String[] args){
        Refinery r = new Refinery("Нафтан",1956,2000000);
        Petrol p = new Petrol(2019,"Россия",92);
        GasStation g = new GasStation(2011,"Минск",8);
        System.out.println(r);
        r.bankrupt(120);
        r.accident(true);
        System.out.println("/////////////////////////////////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println(p);
        p.accident(true);
        p.info();
        System.out.println("/////////////////////////////////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println(g);
        g.accident(false);
        g.breakk(2,true);
        System.out.println("/////////////////////////////////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }
}
