package Main;

import Cipher.Encryption;
import Eng.SteamEngine;
import MyException.MyException;
import Ship.Shipyard;
import Ves.SteamVessel;
import Abstr.Vessel;
import Write.Write;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException, IOException {
        Scanner scan = new Scanner(System.in);
        String text="";
        SteamEngine se = new SteamEngine("Быстроходный", 1974, 1500, 23);
        SteamVessel sv = new SteamVessel("Веселый", 1976, 140, 100,2);
        Shipyard s = new Shipyard("Завод",1850,5203,9);

        System.out.println(se);
        new Write("se","C:\\Users\\Julius\\IdeaProjects\\Dar17\\SteamEngine\\",se); // C:\Users\Julius\IdeaProjects\Dar17\ заменить на свой путь, где лежит проект
        System.out.println("Данные сохранены в файл");
        System.out.println();
        System.out.println(sv);
        new Write("sv","C:\\Users\\Julius\\IdeaProjects\\Dar17\\SteamVessel\\",sv); // также заменить кроме \SteamVessel
        System.out.println("Данные сохранены в файл");
        System.out.println();
        System.out.println(s);
        new Write("s","C:\\Users\\Julius\\IdeaProjects\\Dar17\\Shipyard\\",s); // также заменить кроме \Shipyard
        System.out.println("Данные сохранены в файл");
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
        /*Encryption e = new Encryption();
        e.enc();*/
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
