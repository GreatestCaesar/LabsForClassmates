package Task1;

public class Main {
    public static void main(String[] args){
        Confectionery c = new Confectionery("Коммунарка",1905,1400,"Минск");
        System.out.println(c);
        c.addemp(25);
        c.prod();
        c.fil();
        MeatProducts meat = new MeatProducts("Витовт",2400,1800,3000);
        System.out.println(meat);
        meat.ani();
        meat.exp();
        meat.pig();
        MilkProducts milk = new MilkProducts("Милка","Солдатенко",12,5000000);
        System.out.println(milk);
        milk.acc();
        milk.prod();
        milk.addprod();
    }
}
