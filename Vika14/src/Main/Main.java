package Main;

import Car.Car;
import Cipher.Cip;
import Mechanic.Mechanic;
import MyException.MyException;
import Plant.Plant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException {
        Scanner scan = new Scanner(System.in);
        Cip cip = new Cip();
        Plant p = new Plant("Toyota","Седан",2020,210,"Джордж",34,"Высшее",4500,"Якубович",4600,90000000,4000);
        System.out.println(p);
        p.rebranding();
        p.prof();
        Car c = new Car("Toyota","Седан",2020,210);
        System.out.println(c);
        System.out.println("Введите новые Л.С. к авто: ");
        try {                                                           // ИСКЛЮЧЕНИЕ С СООБЩЕНИЕМ И ЗАВЕРШЕНИЕМ
            c.rebranding(scan.nextDouble());
        }catch (Exception e){
            System.err.println("Ошибка: " + e);
            System.err.println("Выход");
            System.exit(0);
        }
        System.out.println(c.cooper());
        Mechanic m = new Mechanic("Toyota","Седан",2020,210,"Джордж",34,"Высшее",4500);
        System.out.println(m);
        System.out.println("Введите прибавку к ЗП механику: ");
        try {                                                           // ИСКЛЮЧЕНИЕ С СООБЩЕНИЕМ И ПРОДОЛЖЕНИЕМ РАБОТЫ
            m.sal(scan.nextDouble());
        }catch (Exception e){
            System.err.println("Ошибка: " + e);
        }
        try {
            cip.enc();
        }catch(MyException myException){
            System.out.println(myException);
        }
        cip.dec();
    }
}
