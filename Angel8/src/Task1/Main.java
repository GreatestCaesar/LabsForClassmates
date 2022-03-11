package Task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Mainland m = new Mainland();
        Scanner s = new Scanner(System.in);
        ArrayList<Planet> planet = new ArrayList<>();
        Planet p = new Planet("Земля",510100000);
        boolean l=true;
        char c;
        while (l){
            System.out.println("1. Добавить\t2. Название планеты\t3. Название материков\t 4. Количество материков\t0. Выход");
            c = s.next().charAt(0);
            switch (c){
                case '1':{
                    planet = p.creat(planet);
                    break;
                }
                case '2':{
                    System.out.println(p.getName());
                    break;
                }
                case '3':{
                    for(Planet i:planet){
                        if(i.getClass()==m.getClass()){
                            System.out.println(i.getName());
                        }
                    }
                    break;
                }
                case '4':{
                    int n=0;
                    for(Planet i:planet){
                        if(i.getClass()==m.getClass()){
                            n++;
                        }
                    }
                    System.out.println("Количество = " + n);
                    break;
                }
                case '0':{
                    l=false;
                    break;
                }
            }
        }
    }
}
