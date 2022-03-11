package Task1;

public class Main {
    public static void main(String[] args){
        Confectionery c = new Confectionery("Коммунарка",1905,1400,"Минск",500,633132,5665756,132314);
        System.out.println(c);
        c.addemp(25);
        c.prod();
        c.fil();
        System.out.println(c.ar(15));
        System.out.println(c.shop());
        System.out.println(c.demand());
        c.mark();
        c.prod(100);
        c.coop("Спартак","Савушкин продукт","Roshen");
        MeatProducts meat = new MeatProducts("Витовт",2400,1800,3000,421,120,23,"Слоним");
        System.out.println(meat);
        meat.ani();
        meat.exp();
        meat.pig();
        System.out.println(meat.lab());
        meat.vol();
        System.out.println(meat.br());
        System.out.println(meat.cash());
        meat.pig(100);
        meat.pig("Седлбек","Пьетрен","Gascon pig");
        MilkProducts milk = new MilkProducts("Милка","Солдатенко",12,5000000,43423467,2,1834,"Боровляны");
        System.out.println(milk);
        milk.acc();
        milk.prod();
        milk.addprod();
        System.out.println("Прибыль завода: " + milk.profit());
        System.out.println(milk.market());
        System.out.println(milk.milk());
        milk.wage();
        milk.tare("Пластиковые бутылки","Пакеты","Стеклянные бутылки","Коробки");
        milk.prod("Сыры","Йогурты","Твороги","Молоко","Мороженное");
    }
}
