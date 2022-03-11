package Main;

import Cipher.Cip;

import java.io.IOException;
import java.util.Scanner;
import Exception.*;
import Cipher.*;
import Synch.ForSynch;
import Write.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Cattle.Cattle c = new Cattle.Cattle(250, 2.5);
        System.out.println(c);
        try{                                                                                                    // ВЫВОД ОБ ОШИБКЕ, С БЕЗОПАСНЫМ ПРОДОЛЖЕНИЕМ
            System.out.println("Введите кол-во голов, на которое необходимо увеличить скот: ");
            c.update(scanner.nextInt());
        }catch (Exception e){
            System.out.println(e);
        }
        scanner.nextLine();
        try {                                                                                                   // ЗАВЕРШЕНИЕ РАБОТЫ ПРОГРАММЫ С ВЫВОДОМ ОБ ОШИБКЕ
            System.out.println("Введите кол-во голов, на которое необходимо сократить: ");
            c.red(scanner.nextInt());
        }catch (Exception e){
            System.out.println(e);
            System.exit(0);
        }
        System.out.println(c.check(true));
        new Write("c","E:\\IdeaProjects\\Andrey17\\Cattle\\",c);                                                        // до \\Cattle вставить свой путь, где будут находится папки с данными
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        DaityPlant.DaityPlant d = new DaityPlant.DaityPlant("Милка", "Куницкий", 2);
        System.out.println(d);
        d.update();
        d.close();
        System.out.println(d.check(false));
        new Write("d","E:\\IdeaProjects\\Andrey17\\DaityPlant\\",d);                                                    // также
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        Curd.Curd p = new Curd.Curd("Мила", 2.5, 45, 2);
        System.out.println(p);
        p.numb();
        p.milk();
        new Write("p","E:\\IdeaProjects\\Andrey17\\Curd\\",p);                                                          // также
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
}
