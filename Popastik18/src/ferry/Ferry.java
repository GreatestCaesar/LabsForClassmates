package ferry;

import java.util.Scanner;
public class Ferry extends SeaTransport{

    private	double mesto;
    protected double mass;


    public Ferry(int quantity, double price, int day, int payback, double mass, double mesto) {
        super(quantity,price,day,payback);
        this.mass = mass;
        this.mesto = mesto;
    }

    public Ferry() {
        super(0,0,0,0);
        mass = 0;
        mesto = 0;
    }

    public Ferry(String[] f){
        super(Integer.parseInt(f[0]),Double.parseDouble(f[1]),Integer.parseInt(f[2]),Integer.parseInt(f[3]));
        this.mass = Double.parseDouble(f[5]);
        this.mesto = Double.parseDouble(f[4]);
    }


    public void setMass(double mass)
    {
        this.mass = mass;
    }
    public double getMass()
    {
        return this.mass;
    }
    public double getMesto() {
        return mesto;
    }

    public void setMesto(double mesto) {
        this.mesto = mesto;
    }


    @Override
    public Object[] Input() {

        System.out.println("Паром ");
        Object [] input2=new Object[5];
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество билетов: ");
        input2[0] = scan.nextInt();
        System.out.print("Введите цену за посадочное место: ");
        input2[1] = scan.nextDouble();
        System.out.print("Введите дни в пути: ");
        input2[2] = scan.nextInt();
        System.out.print("Количество проданых билетов: ");
        input2[3] = scan.nextInt();
        System.out.print("Введите массу груза но борту: ");
        input2[4] = scan.nextDouble();
        return input2;
    }



    public double Mes(int quantity, double mass) {
        double mes;
        mes=mass/quantity;
        System.out.println("Средний вес багажа одного человека:"+ mes);
        return mes;
    }
    public double Mes(int quantity, int payback) {
        double cd;
        setMesto((quantity-payback));
        System.out.println("Осталось свободных мест:"+ getMesto());
        return getMesto();
    }
    public void Mas (int quantity, double mesto) {
        if(quantity<=mesto) {
            System.out.println ("Проданых билетов больше, чем свободных мест");
        }
        else {
            System.out.println ("Проданых билетов меньше, чем свободных мест");
        }
    }
    public void Mas ( double mass) {
        if(mass<7000) {
            System.out.println ("Масса груза не превышает грузоподъемность");
        }
        else {
            System.out.println ("Масса груза превышает грузоподъемность");
        }
    }
    public void Mas(int ... deck) {
        int sum=0;
        System.out.println("Количество палуб: "+deck.length );

        for(int i = 0; i < deck.length; i++) {
            sum=sum+deck[i];
        }

        System.out.println("Общее количество кают на палубе: " +sum);
    }

    public  void Sca(int ... sca) {

        for(int i = 0; i < sca.length; i++) {

        }
        System.out.println("Cколько типов различных паромов:  "+ sca.length );

    }
    public  void Ear(int ... scaner) {
        int sum=0;
        for(int i = 0; i < scaner.length; i++) {
            sum=sum+scaner.length;
        }
        System.out.println("Количество паромов: "+sum );
    }

    @Override
    public double Cost(int quantity, double price) {
        return super.Cost(quantity, price);
    }

    @Override
    public String toString() {
       return "Паром{" +
                "посадочных мест=" + quantity +
                ", цена за место=" + price +
                ", дни в пути=" + day +
                ", продано билетов=" + payback +
                ", свободных мест=" + mesto +
                ", масса груза на борту=" + mass +
                '}';
    }


}
