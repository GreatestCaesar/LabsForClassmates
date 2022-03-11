package Task1;

public class Main {
    public static void main(String[] args){
        TireFactory t = new TireFactory("Белшина","Кравцов","Смолевичи",1120000,100,"Среднее","ОАО",700,600);
        t.shares();
        t.immport();
        System.out.println(t.prod());
        System.out.println("Грязная рибыль с Шин: " + t.profit());
        System.out.println("Грязная рибыль с Шин: " + t.profit(6));
        t.comp();
        t.cond();
        t.coop("Тойота","Мерседес","БМВ","Ламборгини");
        t.size(50,220,45,210,40,195);
        System.out.println("----------------------------------------------------------------------------------");
        Refinery r = new Refinery("Нафтан","Гродно",3000,2,10000000,40,4000000,43,1922,1350);
        r.county("Германия");
        r.credit();
        r.percentoil();
        r.share();
        r.branch();
        String.valueOf(r.oil());
        r.transp("Воздушный","Наземный","Водный");
        r.profit(4000*40,4000*50,2500*60,5000*20,4000*35,2000*80);
        System.out.println("----------------------------------------------------------------------------------");
        MineralFertilizerPlant m  = new MineralFertilizerPlant("Фторик", 5, "Государственное", "Пупка", 230, 700000,2,"Линейная",45000,33000);
        m.eco();
        m.pr();
        m.nitr();
        m.eff();
        System.out.println(m.tech());
        System.out.println(m.cred());
        m.imp(1);
        m.imp("США","Дания","Норвегия","Китай");
        m.eco(120);
    }
}
