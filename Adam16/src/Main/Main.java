package Main;

import Cipher.Hill;
import Plante.*;
import Car.*;
import Engine.*;
import MyException.*;
import Threads.ForSynch;
import Threads.ThreadForCar;
import Threads.ThreadForEngine;
import Threads.ThreadForPlant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Hill hill = new Hill();
        boolean l = true;
        String f="";
        int km = 0;
        int km1 = 0;
        Scanner scanner = new Scanner(System.in);
        Engine e = new Engine(8, 5.5);
        Car c = new Car(220, 1500);
        Plant p = new Plant("Ford", 250, "USA");
        new ForSynch(e);
        new ForSynch(c);
        new ForSynch(p);
    }
}
