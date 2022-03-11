package Laba;

public class Main {
    public static void main(String[] args){
        TireFactory t = new TireFactory("Белшина","Кравцов","Смолевичи",1120000,100);
        t.shares();
        t.immport();
        System.out.println("Прибыль с Шин: " + t.profit());
        System.out.println("----------------------------------------------------------------------------------");
        Refinery r = new Refinery("Нафтан","Гродно",3000,2,10000000,40);
        r.county("Германия");
        r.credit();
        r.percentoil();
        System.out.println("----------------------------------------------------------------------------------");
        MineralFertilizerPlant m  = new MineralFertilizerPlant("Фторик", 5, "Государственное", "Пупка", 230, 700000);
        m.eco();
        m.pr();
        m.nitr();
    }
}
