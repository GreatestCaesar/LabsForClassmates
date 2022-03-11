public class Main {
    public static void main(String[] args){
        TireFactory t = new TireFactory("Белшина","Кравцов","Смолевичи",1120000,100,"Среднее","ОАО",700,600);
        t.shares();
        t.immport();
        System.out.println(t.prod());
        System.out.println("Прибыль с Шин: " + t.profit());
        t.comp();
        t.cond();
        System.out.println(t.coop());
        System.out.println("----------------------------------------------------------------------------------");
        Refinery r = new Refinery("Нафтан","Гродно",3000,2,10000000,40,4000000,43,1922,1350);
        r.county("Германия");
        r.credit();
        r.percentoil();
        System.out.println(r.transp());
        r.share();
        r.branch();
        String.valueOf(r.oil());
        System.out.println("----------------------------------------------------------------------------------");
        MineralFertilizerPlant m  = new MineralFertilizerPlant("Фторик", 5, "Государственное", "Пупка", 230, 700000,2,"Линейная",45000,33000);
        m.eco();
        m.pr();
        m.nitr();
        m.eff();
        System.out.println(m.tech());
        System.out.println(m.cred());
        m.imp(1);
    }
}
