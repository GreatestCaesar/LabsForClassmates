package Task2;

import java.util.ArrayList;
import java.util.Scanner;

public class MobileConnection {
    private String name; // название тарифа
    private int num; // кол-во клиентов
    private double subs; // абон. плата
    private int term; // срок(дни) тарифа

    public MobileConnection() {
        name = "";
        num = 0;
        subs = 0;
        term = 0;
    }

    public MobileConnection(String name, int num, double subs, int term) {
        this.name = name;
        this.num = num;
        this.subs = subs;
        this.term = term;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getSubs() {
        return subs;
    }

    public void setSubs(double subs) {
        this.subs = subs;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public ArrayList<MobileConnection> creat(ArrayList<MobileConnection> mob){
        Scanner scan = new Scanner(System.in);
        Rate r = new Rate();
        System.out.println("Введите название тарифа: ");
        r.setName(scan.nextLine());
        System.out.println("Введите кол-во абонентов: ");
        r.setNum(scan.nextInt());
        System.out.println("Введите абон. плату: ");
        r.setSubs(scan.nextDouble());
        System.out.println("Введите срок действия тарфиа: ");
        r.setTerm(scan.nextInt());
        mob.add(r);
        return mob;
    }

    public ArrayList<MobileConnection> sort(ArrayList<MobileConnection> mob){
        MobileConnection Mob;
        for(int i=0;i<mob.size();i++){
            for(int j=i+1;j<mob.size();j++){
                if(mob.get(i).getSubs()>mob.get(j).getSubs()){
                    Mob = mob.get(i);
                    mob.set(i,mob.get(j));
                    mob.set(j,Mob);
                }
            }
        }
        return mob;
    }

    @Override
    public String toString() {
        return "Мобильная связь{" +
                "название тарифа='" + name + '\'' +
                ", кол-во абонентов=" + num +
                ", абонентская плата=" + subs +
                ", срок дейсвтия=" + term +
                '}';
    }
}
