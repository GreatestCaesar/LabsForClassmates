package Main;

import Car.Car;
import Cipher.Cip;
import Mechanic.Mechanic;
import MyException.MyException;
import Plant.Plant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException {
        Cip cip = new Cip();
        Plant p = new Plant("Якубович",4600,90000000,4000);
        Car c = new Car("Toyota","Седан",2020,210);
        Mechanic m = new Mechanic("Джордж",34,"Высшее",4500);
        new Plant(p);
        new Car(c);
        new Mechanic(m);
        cip.enc();
        cip.dec();
    }
}
