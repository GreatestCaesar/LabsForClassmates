package Laba;

public class Main {
    public static void main(String[] args){
        Rocket r = new Rocket("Фалкон 9",5,"США",3,275000,120,"Байконур","22.10.2000");
        System.out.println(r);
        r.Atmosphere();
        System.out.println(r.Serviceability());
        System.out.println(r.Speed());
        r.WeightCargo();
        System.out.println(r.Fuel());
        r.WeightEngine();
        System.out.println(r.Language(1));
        Plain p = new Plain("Боинг 747",56,92,233,4,"Belavia","FG444",2018);
        System.out.println(p);
        p.Auto(1);
        System.out.println(p.Fuel());
        p.Height();
        p.Country("Турция");
        p.QuantityCrew();
        System.out.println(p.BlackBox());
        System.out.println(p.Time());
        Helicopter h = new Helicopter("Зубр",18,2010,6,14.5,5.5,650,860);
        System.out.println(h);
        h.Fight(1);
        h.Range();
        System.out.println(h.Сarrying());
        System.out.println(h.Time());
        h.QS();
        System.out.println(h.QF());
        h.QG();
    }
}
