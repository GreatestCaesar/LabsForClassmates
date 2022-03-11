package Laba;

public class Main {
    public static void main(String[] args){
        MotorIndustry m = new MotorIndustry("Мерседес",150,"Универсал","Дизель");
        Robotics r = new Robotics("Химическое производство",45.5,"Плавление, охлаждение, перевозка","Автоматический",4,3);
        Agriculture a = new Agriculture("Кормоуборочный комбайн", 40, 20000,54);

        m.Price(23);
        m.Reserve();
        m.Power();
        m.Places();
        System.out.print("\n-----------------------------------------------\n");
        r.Turnover(4);
        r.risk_of_breakage();
        r.Reporting();
        r.Availability(5);
        System.out.print("\n-----------------------------------------------\n");
        a.Wage();
        a.Year();
        a.Report();
        a.Charge_of_fuel();
        System.out.print("\n-----------------------------------------------\n");
        m.Price(m.getBrand(),m.getBT());
        m.Out(m.getBrand(),m.getBT(),m.getET());
        System.out.print("\n-----------------------------------------------\n");
        r.Availability(r.getDirection());
        r.Out(r.getDirection(),r.getTasks(),r.getType());
        System.out.print("\n-----------------------------------------------\n");
        a.Report(a.getNum());
        a.Out(a.getType(),a.getNum(),a.getNum1(),(int)a.getPrice());
    }
}
