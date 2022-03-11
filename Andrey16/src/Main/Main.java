package Main;

import Cipher.Cip;

import java.util.Scanner;
import Exception.*;
import Cipher.*;
import Synch.ForSynch;

public class Main {
    public static void main(String[] args){
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
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        DaityPlant.DaityPlant d = new DaityPlant.DaityPlant("Милка", "Куницкий", 2);
        System.out.println(d);
        d.update();
        d.close();
        System.out.println(d.check(false));
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        Curd.Curd p = new Curd.Curd("Мила", 2.5, 45, 2);
        System.out.println(p);
        p.numb();
        p.milk();
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        new ForSynch(c);
        new ForSynch(d);
        new ForSynch(p);
    }
}
