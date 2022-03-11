package Threads;

import Car.Car;

import java.util.ArrayList;

public class ForSynchron extends Thread{
    private int n;
    ArrayList<Car> car;

    public ForSynchron(int n, ArrayList<Car> car){
        super(String.valueOf(car.get(n).getClass()));
        this.n = n;
        this.car = car;
        start();
    }

    public void run(){
        System.out.println("Запустился поток " + Thread.currentThread());
        synchronized (car){
            System.out.println("-------------------------------------------------------");
            System.out.println("\nСейчас выполняется поток " + Thread.currentThread());
            car.get(n).working(car.get(n));
            System.out.println("-------------------------------------------------------");
        }
    }
}
