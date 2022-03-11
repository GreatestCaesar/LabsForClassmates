package Main;

import Cipher.Hill;
import Plante.*;
import Car.*;
import Engine.*;
import MyException.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Hill hill = new Hill();
        boolean l = true;
        String f="";
        int km = 0;
        int km1 = 0;
        Scanner scanner = new Scanner(System.in);
        Engine e = new Engine(8, 5.5);
        Car c = new Car(220, 1500);
        Plant p = new Plant("Ford", 250, "USA");
        System.out.println(e);
        System.out.println("+--------------------------------------------------------------------------------------------+");
        System.out.println(c);
        System.out.println("+--------------------------------------------------------------------------------------------+");
        System.out.println(p);
        System.out.println("+--------------------------------------------------------------------------------------------+");
        e.change();
        do {
            System.out.println("Введите тип топлива двигателя: ");
            f = scanner.nextLine();
            try {
                if (!f.equals("80")){
                    if(!f.equals("92")){
                        if(!f.equals("95")){
                            if(!f.equals("100")){
                                if(!f.equals("Дизель")){
                                    l = false;
                                    throw new MyException(f); // СОБСТВЕННОЕ ИСКЛЮЧЕНИЕ
                                }else {
                                    break;
                                }
                            }else {
                                break;
                            }
                        }else {
                            break;
                        }
                    }else{
                        break;
                    }
                }
            } catch (MyException m) {
                System.out.println(m);
            }
        } while (l!=true);
        e.fuel(f);
        System.out.println("Введите, сколько километров прошёл двигатель: ");
        try {
            km = scanner.nextInt();
        }catch (Exception z){                                                                           // ИСКЛЮЧЕНИЕ С ЗАВЕРШЕНИЕМ РАБОТЫ ПРОГРАММЫ
            System.out.println(z);
            System.exit(0);
        }
        e.rep(km);
        System.out.println("+--------------------------------------------------------------------------------------------+");
        c.change();
        c.hitch(true);
        System.out.println("Введите, сколько км проехал автомобиль: ");
        try {
            km1 = scanner.nextInt();
        }catch (Exception z){                                                                           // ИСКЛЮЧЕНИЕ С БЕЗОПАСНЫМ ПРОДОЛЖЕНИЕМ РАБОТЫ ПРОГРАММЫ
            System.out.println(z);
        }
        c.rep(km1);
        System.out.println("+--------------------------------------------------------------------------------------------+");
        p.change();
        p.types();

    }
}
