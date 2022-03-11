package Main;

import Car.Car;
import Cipher.Cip;
import Mechanic.Mechanic;
import MyException.MyException;
import Plant.Plant;
import Threads.ForSynchron;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException {
        Cip cip = new Cip();
        ArrayList<Car> car = new ArrayList<Car>();
        Plant p = new Plant("Якубович",4600,90000000,4000);
        car.add(p);
        Car c = new Car("Toyota","Седан",2020,210);
        car.add(c);
        Mechanic m = new Mechanic("Джордж",34,"Высшее",4500);
        car.add(m);
        new ForSynchron(0,car);
        new ForSynchron(1,car);
        new ForSynchron(2,car);
    }
}
