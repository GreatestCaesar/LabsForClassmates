package Laba;

public class Main {
    public static void main(String[] args){
        Rocket r = new Rocket("Фалкон 9",5,"США",3);
        System.out.println(r);
        r.Atmosphere();
        System.out.println(r.Serviceability());
        System.out.println(r.Speed());
        Plain p = new Plain("Боинг 747",56,92,233);
        System.out.println(p);
        p.Auto(1);
        System.out.println(p.Fuel());
        p.Height();
        Helicopter h = new Helicopter("Зубр",18,2010,6);
        System.out.println(h);
        h.Fight(1);
        h.Range();
        System.out.println(h.Сarrying());
    }
}
