package Main;

import Cipher.*;
import MyException.MyException;
import Refinery.*;
import Petrol.*;
import GasStation.*;

import java.security.spec.ECField;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException {
        Scanner s = new Scanner(System.in);
        double d = 0;
        int n = 0;
        Refinery r = new Refinery("Нафтан",1956,2000000);
        Petrol p = new Petrol(2019,"Россия",92);
        GasStation g = new GasStation(2011,"Минск",8);
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
        Encryptyon e = new Encryptyon();
        e.enc("Черные в белых костюмах, встали раньше меня, справят половую нужду в коридоре и подотрут, пока я их не накрыл.");
        e.dec();
    }
}
