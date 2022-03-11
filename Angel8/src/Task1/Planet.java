package Task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Planet {
    private String name; // название
    private double area; // площадь

    public Planet(String name, double area) {
        this.name = name;
        this.area = area;
    }

    public Planet() {
        name = name;
        area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public ArrayList<Planet> creat(ArrayList<Planet> p){
        Scanner s = new Scanner(System.in);
        boolean l=true;
        char c;
        while (l){
            System.out.println("1. Материк\t2. Океан\t3. Остров\t0. Назад");
            c = s.next().charAt(0);
            switch (c){
                case '1':{
                    Mainland m = new Mainland();
                    System.out.print("Введите название материка: ");
                    s.nextLine();
                    m.setName(s.nextLine());
                    System.out.print("Введите площадь материка: ");
                    m.setArea(s.nextDouble());
                    System.out.print("Введите население материка: ");
                    m.setPopulation(s.nextInt());
                    System.out.print("Введие кол-во стран на материке: ");
                    m.setCount(s.nextInt());
                    p.add(m);
                    System.out.println();
                    break;
                }
                case '2':{
                    Ocean o = new Ocean();
                    System.out.print("Введите название океана: ");
                    s.nextLine();
                    o.setName(s.nextLine());
                    System.out.print("Введие площадь океана: ");
                    o.setArea(s.nextDouble());
                    System.out.print("Введите объем океана: ");
                    o.setVolume(s.nextDouble());
                    System.out.print("Введите максимальную глубину океана: ");
                    o.setMaxdepth(s.nextDouble());
                    System.out.print("Введите среднюю глубину океана: ");
                    o.setAvdepth(s.nextDouble());
                    p.add(o);
                    break;
                }
                case '3':{
                    int n;
                    Island i = new Island();
                    System.out.print("Введите название острова: ");
                    s.nextLine();
                    i.setName(s.nextLine());
                    System.out.print("Введие площадь острова: ");
                    i.setArea(s.nextDouble());
                    System.out.println("Остров населён? 1. Да 2. Нет");
                    n = s.nextInt();
                    if(n==1){
                        i.setPopulation(true);
                    }else{
                        i.setPopulation(false);
                        p.add(i);
                        break;
                    }
                    System.out.println("Введите население острова: ");
                    i.setPopula(s.nextInt());
                    p.add(i);
                    break;
                }
                case '0':{
                    l=false;
                    break;
                }
                default:{
                    System.out.println("Повторите ввод");
                    break;
                }
            }
        }
        return p;
    }

    @Override
    public String toString() {
        return "Планета{" +
                "название='" + name + '\'' +
                ", площадь=" + area +
                '}';
    }
}
