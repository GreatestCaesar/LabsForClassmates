package Main;

import Car.Car;
import Mechanic.Mechanic;
import Plant.Plant;
public class Main {
    public static void main(String[] args){
        Plant p = new Plant("Toyota","Седан",2020,210,"Джордж",34,"Высшее",4500,"Якубович",4600,90000000,4000);
        System.out.println(p);
        p.rebranding();
        p.prof();
        Car c = new Car("Toyota","Седан",2020,210);
        System.out.println(c);
        c.rebranding();
        System.out.println(c.cooper());
        Mechanic m = new Mechanic("Toyota","Седан",2020,210,"Джордж",34,"Высшее",4500);
        System.out.println(m);
        m.rebranding();
        m.sal(650.5);
    }
}
