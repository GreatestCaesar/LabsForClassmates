package Task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<MobileConnection> mob = new ArrayList<>();
        MobileConnection Mob = new MobileConnection();
        Scanner scan = new Scanner(System.in);
        char c;
        boolean k=true;
        while (k){
            System.out.println("1. Добавить тариф\t2. Просмотреть список тарифов\t3. Общее число клиентов\n4. Сортировка по абон. плате\t5. Найти диапазон тарифов по сроку действия\t0. Выход");
            c = scan.next().charAt(0);
            switch (c){
                case '1':{
                    mob = Mob.creat(mob);
                    System.out.println();
                    break;
                }
                case '2':{
                    for(MobileConnection m:mob){
                        System.out.println(m);
                    }
                    System.out.println();
                    break;
                }
                case '3':{
                    int n = 0;
                    for(MobileConnection m:mob){
                        n+=m.getNum();
                    }
                    System.out.println("Общее число клиентов = " + n);
                    System.out.println();
                    break;
                }
                case '4':{
                    mob = Mob.sort(mob);
                    for(MobileConnection m:mob){
                        System.out.println(m);
                    }
                    System.out.println();
                    break;
                }
                case '5':{
                    int x,y;
                    System.out.println("Введите начало диапазона:");
                    x = scan.nextInt();
                    System.out.println("Введите конец диапазона: ");
                    y = scan.nextInt();
                    for(MobileConnection m:mob){
                        if(m.getTerm()>=x && m.getTerm()<=y){
                            System.out.println(m);
                        }
                    }
                    break;
                }
                case '0':{
                    k=false;
                    break;
                }
                default:{
                    System.out.println("Повторите ввод");
                    break;
                }
            }
        }
    }
}
