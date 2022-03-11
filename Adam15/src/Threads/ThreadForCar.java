package Threads;

import Car.Car;

public class ThreadForCar extends Thread{
    Car c;

    public ThreadForCar(Car c){
        super("Поток для авто");
        this.c = c;
        start();
    }

    public void run(){
        c.change();
        c.hitch(true);
        c.rep(7650);
        System.out.println(c);
    }
}
