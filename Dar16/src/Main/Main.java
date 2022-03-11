package Main;

import Cipher.Encryption;
import Eng.SteamEngine;
import MyException.MyException;
import Ship.Shipyard;
import Synch.Synch;
import Ves.SteamVessel;
import Abstr.Vessel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException {
        Scanner scan = new Scanner(System.in);
        String text="";
        SteamEngine se = new SteamEngine("Быстроходный", 1974, 1500, 23);
        SteamVessel sv = new SteamVessel("Веселый", 1976, 140, 100,2);
        Shipyard s = new Shipyard("Пароходный завод имени Андрея Валерьевича",1850,5203,9);

        System.out.println(se);
        System.out.println();
        System.out.println(sv);
        System.out.println();
        System.out.println(s);
        System.out.println();
        System.out.println("1. Запустить двигатель\t2. Остановить двигатель");
        try{                                                                                        // ВЫВОД ОШИБКИ И ПРЕКРАЩЕНИЕ РАБОТЫ
            se.on_off(scan.nextInt());
        }catch (Exception e){
            System.out.println("Ошибка " + e);
            System.out.println("Завершение работы");
            System.exit(0);
        }
        se.update();
        System.out.println(se.service());
        System.out.println();
        System.out.println("Наследуемый и переопределенный методе: \n" + s.service());
        System.out.println("Введите название реки: ");
        try {                                                                                       // СОБСТВЕННОЕ ИСКЛЮЧЕНИЕ И БЕЗОПАСНОЕ ПРОДОЛЖЕНИЕ ПРОГРАММЫ
            scan.nextLine();
            text = scan.nextLine();
            if (numb(text)) {
                throw new MyException();
            }
        }catch (MyException e){
            System.err.println(e);
        }
        s.river(text);
        System.out.println();
        s.ves();
        s.update();
        Encryption e = new Encryption();
        new Synch(e);
        new Synch(e);
    }

    public static boolean numb(String text){
        for(int i=0;i<text.length();i++){
            if(Character.isDigit(text.charAt(i))){
                return true;
            }
        }
        return false;
    }
}
