package Task1;

import java.util.Arrays;
import java.util.Scanner;

public class District{ // район
    String name;
    Town[] town;

    public District(String name, Town[] town) {
        this.name = name;
        this.town = town;
    }

    public District() {
        name = "";
        town = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Town[] getTown() {
        return town;
    }

    public void setTown(Town[] town) {
        this.town = town;
    }

    public District[] create(District[] districts){
        Scanner scanner = new Scanner(System.in);
        Town t = new Town();
        District d = new District();
        District[] dist;
        boolean l = true;
        char n;
        System.out.println("Введите название района: ");
        d.setName(scanner.nextLine());
        while (l){
            System.out.println("1. Создать город\t2. Работать с определённым городом\t0. Вернуться назад");
            n = scanner.next().charAt(0);
            switch (n){
                case '1':{
                    if(districts == null){
                        dist = new District[1];
                    }else{
                        dist = new District[districts.length+1];
                        for(int i=0;i< districts.length;i++){
                            dist[i] = districts[i];
                        }
                    }
                    d.setTown(t.create(d.getTown()));
                    dist[dist.length-1] = d;
                    districts = dist;
                    break;
                }
                case '2':{

                    break;
                }
                case '0':{
                    l = false;
                    break;
                }
                default:{
                    System.out.println("Ошибка");
                    break;
                }
            }
        }
        return districts;
    }

    public Town[] work(Town[] towns, int p){
        Town town = new Town();
        Scanner scanner = new Scanner(System.in);
        boolean l = true;
        char n;
        while (l){
            System.out.println("1. Сменить название города\t2. Новое население города\t3. Новая площадь города\t0. Вернуться назад");
            n = scanner.next().charAt(0);
            switch (n){
                case '1':{
                    System.out.println("Введите новое название города: ");
                    scanner.nextLine();
                    towns[p].setName(scanner.nextLine());
                    break;
                }
                case '2':{
                    System.out.println("Введите новое население города: ");
                    towns[p].setPopulation(scanner.nextInt());
                    break;
                }
                case '3':{
                    System.out.println("Введите новую площадь города: ");
                    towns[p].setArea(scanner.nextDouble());
                }
                case '0':{
                    l = false;
                    break;
                }
                default:{
                    System.out.println("Ошибка");
                    break;
                }
            }
        }
        return towns;
    }

    @Override
    public String toString() {
        return "\nРайон{" +
                "\nназвание='" + name + '\'' +
                "\nгорода=" + Arrays.toString(town) +
                '}';
    }
}
