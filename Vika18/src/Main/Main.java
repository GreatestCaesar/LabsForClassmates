package Main;

import Car.Car;
import Cipher.Cip;
import Mechanic.Mechanic;
import MyException.MyException;
import Plant.Plant;
import Read.Read;
import Threads.ForSynchron;
import Write.Write;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException, IOException {
        Cip cip = new Cip();
        Read read = new Read();
        String[] fields;
        //ArrayList<Car> car = new ArrayList<Car>();
        System.out.println("Объект класса Plant без данных: ");
        Plant p = new Plant();
        System.out.println(p);
        System.out.println("Объект класса Plant с данными из файла: ");
        fields = read.read(p,"C:\\Users\\Julius\\IdeaProjects\\Vika117\\Plant\\plant.txt"); // вставить путь из старого проекта, чтоб программа нашла файлик из которого брать данные
        p = new Plant(fields);
        System.out.println(p);
        /*car.add(p);*/
        Car c = new Car();
        System.out.println("Объект класса Car без данных: ");
        System.out.println(c);
        System.out.println("Объект класса Car с данными из файла: ");
        fields = read.read(c,"C:\\Users\\Julius\\IdeaProjects\\Vika117\\Car\\car.txt");
        c = new Car(fields);
        System.out.println(c);
        /*car.add(c);*/
        Mechanic m = new Mechanic();
        System.out.println("Объект класса Mechanic без данных: ");
        System.out.println(m);
        System.out.println("Объект класса Mechanic с данными из файла: ");
        fields = read.read(m,"C:\\Users\\Julius\\IdeaProjects\\Vika117\\Mechanic\\mechanic.txt");
        m = new Mechanic(fields);
        System.out.println(m);
        /*car.add(m);*/
        /*new ForSynchron(0,car);
        new ForSynchron(1,car);
        new ForSynchron(2,car);*/
    }
}
