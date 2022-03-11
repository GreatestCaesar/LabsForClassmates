package Main;

import Cipher.*;
import MyException.MyException;
import Read.Read;
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
        Read read = new Read();
        String[] field;
        double d = 0;
        int n = 0;
        Refinery ex = new Refinery();
        field = read.read(ex,"C:\\Users\\Julius\\IdeaProjects\\Anya17\\Refinery\\r.txt"); // до \Anya17... путь старых файликов
        Refinery r = new Refinery(field[0],Integer.parseInt(field[1]), Double.parseDouble(field[2]));
        Petrol ex1 = new Petrol();
        field = read.read(ex1,"C:\\Users\\Julius\\IdeaProjects\\Anya17\\Petrol\\p.txt"); // также
        Petrol p = new Petrol(Integer.parseInt(field[1]),field[0], Integer.parseInt(field[2]));
        GasStation ex2 = new GasStation();
        field = read.read(ex2,"C:\\Users\\Julius\\IdeaProjects\\Anya17\\GasStation\\g.txt"); // также
        GasStation g = new GasStation(Integer.parseInt(field[1]),field[0], Integer.parseInt(field[2]));
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
