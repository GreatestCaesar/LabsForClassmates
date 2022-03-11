package Laba;

public class Main {
    public static void main(String[] args){
        MotorIndustry m = new MotorIndustry("Мерседес",150,"Универсал","Дизель",6.0);
        Robotics r = new Robotics("Химическое производство",45.5,"Плавление, охлаждение, перевозка","Автоматический",4,3);
        Agriculture a = new Agriculture("Кормоуборочный комбайн", 40, 20000,54);

        m.Price(23);
        m.Reserve();
        m.Power();
        m.Places();
        System.out.println(m.consumption());
        System.out.println(m.oil());
        System.out.print("\n-----------------------------------------------\n");
        r.Turnover(4);
        r.risk_of_breakage();
        r.Reporting();
        r.Availability(5);
        System.out.println(r.ii(1));
        System.out.println(r.term());
        System.out.print("\n-----------------------------------------------\n");
        a.Wage();
        a.Year();
        a.Report();
        System.out.println(a.Charge_of_fuel());
        System.out.println(a.allman());
    }
}
