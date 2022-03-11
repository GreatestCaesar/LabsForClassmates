package Main;

import Car.Car;
import Cipher.Cip;
import Mechanic.Mechanic;
import MyException.MyException;
import Plant.Plant;
import Threads.ForSynchron;
import Write.Write;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException, IOException {
        Cip cip = new Cip();
        ArrayList<Car> car = new ArrayList<Car>();
        Plant p = new Plant("Якубович",4600,90000000,4000);
        System.out.println(p);
        new Write("plant","C:\\Users\\Julius\\IdeaProjects\\Vika117\\Plant\\",p); // "C:\\Users\\Julius\\IdeaProjects\\Vika117\\ поменять на свой путь, где хранится проект, \\Plant не трогать
        /*car.add(p);*/
        Car c = new Car("Toyota","Седан",2020,210);
        System.out.println(c);
        new Write("car","C:\\Users\\Julius\\IdeaProjects\\Vika117\\Car\\",c); // также
        /*car.add(c);*/
        Mechanic m = new Mechanic("Джордж",34,"Высшее",4500);
        System.out.println(m);
        new Write("mechanic","C:\\Users\\Julius\\IdeaProjects\\Vika117\\Mechanic\\",m); // также
        /*car.add(m);*/
        /*new ForSynchron(0,car);
        new ForSynchron(1,car);
        new ForSynchron(2,car);*/
    }
}
