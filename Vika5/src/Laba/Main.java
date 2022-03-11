package Laba;

public class Main {
    public static void main(String[] args){
        MotorIndustry m = new MotorIndustry("Мерседес",150,"Универсал","Дизель");
        Robotics r = new Robotics("Химическое производство",45.5,"Плавление, охлаждение, перевозка","Автоматический",4,3);
        Agriculture a = new Agriculture("Кормоуборочный комбайн", 40, 20000,54);

        m.Price(23);
        m.Reserve();
        m.Power();
        System.out.print("\n-----------------------------------------------\n");
        r.Turnover(4);
        r.risk_of_breakage();
        r.Reporting();
        System.out.print("\n-----------------------------------------------\n");
        a.Wage();
        a.Year();
        a.Report();
    }
}
