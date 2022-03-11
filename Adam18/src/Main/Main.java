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
import Write.*;
import Read.*;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Read read = new Read();
        String[] fields;
        Hill hill = new Hill();
        boolean l = true;
        String f="";
        int km = 0;
        int km1 = 0;
        Scanner scanner = new Scanner(System.in);
        Engine ex1 = new Engine();
        fields = read.read(ex1,"C:\\Users\\Julius\\IdeaProjects\\Adam17\\Engine\\e.txt"); // путь к папкам из 17 лабы
        Engine engine = new Engine(Integer.parseInt(fields[0]),Double.parseDouble(fields[1]));
        System.out.println("Данные для класса Engine, взятые из файла\n" + engine);
        Car ex2 = new Car();
        fields = read.read(ex2,"C:\\Users\\Julius\\IdeaProjects\\Adam17\\Car\\c.txt"); // путь
        Car car = new Car(Integer.parseInt(fields[0]),Double.parseDouble(fields[1]));
        System.out.println("Данные для класса Car, взятые из файла\n" + car);
        Plant ex3 = new Plant();
        fields = read.read(ex3,"C:\\Users\\Julius\\IdeaProjects\\Adam17\\Plante\\p.txt"); // путь
        Plant plant = new Plant(fields[0], Double.parseDouble(fields[1]), fields[2]);
        System.out.println("Данные для класса Plant, взятые из файла\n" + plant);
        /*new ForSynch(e);
        new ForSynch(c);
        new ForSynch(p);*/
    }
}
