package Main;

import Cipher.*;
import MyException.MyException;
import Refinery.*;
import Petrol.*;
import GasStation.*;
import Write.Write;

import java.io.IOException;
import java.security.spec.ECField;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException, IOException {
        Scanner s = new Scanner(System.in);
        double d = 0;
        int n = 0;
        Refinery r = new Refinery("Нафтан",1956,2000000);
        new Write("r","C:\\Users\\Julius\\IdeaProjects\\Anya17\\Refinery\\",r); // до \Anya17\Refinery прописать свой путь где будет находится папка
        System.out.println("Файл создан");
        Petrol p = new Petrol(2019,"Россия",92);
        new Write("p","C:\\Users\\Julius\\IdeaProjects\\Anya17\\Petrol\\",p);  // также
        System.out.println("Файл создан");
        GasStation g = new GasStation(2011,"Минск",8);
        new Write("g","C:\\Users\\Julius\\IdeaProjects\\Anya17\\GasStation\\",g);  // также
        System.out.println("Файл создан");
        System.out.println(r);
        try{
            System.out.print("Введите цену за нефть: ");
            d = s.nextDouble();
        }catch (Exception e){
            System.err.println(e);
            System.out.println("Выход");
            System.exit(0);
        }
        r.bankrupt(d);
        r.accident(true);
        System.out.println("/////////////////////////////////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println(p);
        p.accident(true);
        p.info();
        System.out.println("/////////////////////////////////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println(g);
        g.accident(false);
        try{
            System.out.print("Введите время перерыва на АЗС: ");
            n = s.nextInt();
        }catch (Exception e){
            System.err.println(e);
        }
        g.breakk(n,true);
        System.out.println("/////////////////////////////////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        /*Encryptyon e = new Encryptyon();
        e.enc("Черные в белых костюмах, встали раньше меня, справят половую нужду в коридоре и подотрут, пока я их не накрыл.");
        e.dec();*/
    }
}
