package Main;

import Cipher.Encryption;
import Eng.SteamEngine;
import MyException.MyException;
import Read.Read;
import Ship.Shipyard;
import Ves.SteamVessel;
import Abstr.Vessel;
import Write.Write;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException, IOException {
        Read read = new Read();
        Scanner scan = new Scanner(System.in);
        String text="";
        String[] fields;
        SteamEngine example = new SteamEngine();
        fields = read.read(example,"C:\\Users\\Julius\\IdeaProjects\\Dar17\\SteamEngine\\se.txt");                                             // путь к файлам из прошлого проекта
        SteamEngine se = new SteamEngine(fields[0], Integer.parseInt(fields[1]), Integer.parseInt(fields[2]), Double.parseDouble(fields[3]));
        SteamVessel example1 = new SteamVessel();
        fields = read.read(example1,"C:\\Users\\Julius\\IdeaProjects\\Dar17\\SteamVessel\\sv.txt");                                             // путь к файлам из прошлого проекта
        SteamVessel sv = new SteamVessel(fields[0], Integer.parseInt(fields[1]), Integer.parseInt(fields[2]), Double.parseDouble(fields[3]), Integer.parseInt(fields[4]));
        Shipyard example2 = new Shipyard();
        fields = read.read(example2,"C:\\Users\\Julius\\IdeaProjects\\Dar17\\Shipyard\\s.txt");                                                // путь к файлам из прошлого проекта
        Shipyard s = new Shipyard(fields[0], Integer.parseInt(fields[1]), Integer.parseInt(fields[2]), Integer.parseInt(fields[3]));

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
