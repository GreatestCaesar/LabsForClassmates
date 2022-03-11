package Main;

import Cipher.Cip;

import java.io.IOException;
import java.util.Scanner;
import Exception.*;
import Cipher.*;
import Synch.ForSynch;
import Write.*;
import Read.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Read r = new Read();
        String[] fields;
        System.out.println("Cattle без данных из файла: ");
        Cattle.Cattle c = new Cattle.Cattle();
        System.out.println(c);
        System.out.println("Cattle с данными из файла: ");
        fields = r.read(c,"E:\\IdeaProjects\\Andrey17\\Cattle\\c.txt");                                                   // путь к файлам из 17 лабы
        Cattle.Cattle cattle = new Cattle.Cattle(Integer.parseInt(fields[0]),Double.parseDouble(fields[1]));
        System.out.println(cattle);
        try{                                                                                                    // ВЫВОД ОБ ОШИБКЕ, С БЕЗОПАСНЫМ ПРОДОЛЖЕНИЕМ
            System.out.println("Введите кол-во голов, на которое необходимо увеличить скот: ");
            cattle.update(scanner.nextInt());
        }catch (Exception e){
            System.out.println(e);
        }
        scanner.nextLine();
        try {                                                                                                   // ЗАВЕРШЕНИЕ РАБОТЫ ПРОГРАММЫ С ВЫВОДОМ ОБ ОШИБКЕ
            System.out.println("Введите кол-во голов, на которое необходимо сократить: ");
            cattle.red(scanner.nextInt());
        }catch (Exception e){
            System.out.println(e);
            System.exit(0);
        }
        System.out.println(c.check(true));
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        DaityPlant.DaityPlant d = new DaityPlant.DaityPlant();
        System.out.println("DaityPlant без данных из файла: ");
        System.out.println(d);
        System.out.println("DaityPlant с данными из файла: ");
        fields = r.read(d,"E:\\IdeaProjects\\Andrey17\\DaityPlant\\d.txt");                                                 // также
        DaityPlant.DaityPlant daity = new DaityPlant.DaityPlant(fields[0], fields[1], Integer.parseInt(fields[2]));
        System.out.println(daity);
        daity.update();
        daity.close();
        System.out.println(d.check(false));
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        Curd.Curd p = new Curd.Curd();
        System.out.println("Curd без данных из файла: ");
        System.out.println(p);
        System.out.println("Curd с данными из файла: ");
        fields = r.read(p,"E:\\IdeaProjects\\Andrey17\\Curd\\p.txt");                                                           // также
        Curd.Curd curd = new Curd.Curd(fields[0], Double.parseDouble(fields[1]), Double.parseDouble(fields[2]), Integer.parseInt(fields[3]));
        System.out.println(curd);
        curd.numb();
        curd.milk();
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
}
