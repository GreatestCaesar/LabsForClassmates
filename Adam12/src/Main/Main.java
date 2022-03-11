package Main;

import Cipher.Hill;
import Plante.*;
import Car.*;
import Engine.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hill hill = new Hill();
        Scanner scanner = new Scanner(System.in);
        Engine e = new Engine(8, 5.5);
        Car c = new Car(220, 1500);
        Plant p = new Plant("Ford", 250, "USA");
        System.out.println(e);
        System.out.println("+--------------------------------------------------------------------------------------------+");
        System.out.println(c);
        System.out.println("+--------------------------------------------------------------------------------------------+");
        System.out.println(p);
        System.out.println("+--------------------------------------------------------------------------------------------+");
        e.change();
        e.fuel("100");
        e.rep(8230);
        System.out.println("+--------------------------------------------------------------------------------------------+");
        c.change();
        c.hitch(true);
        c.rep(2000);
        System.out.println("+--------------------------------------------------------------------------------------------+");
        p.change();
        p.types();
        String text = hill.encrypt("Привет, как дела","я встречаю рассвет");
        System.out.println(text);
    }
}
