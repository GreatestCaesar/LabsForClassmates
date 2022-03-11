package Mechanic;

import Car.Car;

public class Mechanic extends Thread { // механик
    private String name; // имя
    private int year; // возраст
    private String educ; // образование
    private double salary; // ЗП
    Mechanic m;

    public Mechanic(String name, int year1, String educ, double salary) {
        this.name = name;
        this.year = year1;
        this.educ = educ;
        this.salary = salary;
    }

    public Mechanic() {
        name = "";
        year = 0;
        educ = "";
        salary = 0;
    }

    public Mechanic(Mechanic m){
        super("Поток2");
        this.m = m;
        start();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getEduc() {
        return educ;
    }

    public void setEduc(String educ) {
        this.educ = educ;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void run(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(m);
        try {
            Thread.sleep(12000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        m.sal(150);
    }

    public void sal(double n){
        System.out.println("Увеличили ЗП на " + n);
        salary += n;
    }

    @Override
    public String toString() {
        return "Механик{" +
                "имя='" + name + '\'' +
                ", возраст=" + year +
                ", образование='" + educ + '\'' +
                ", ЗП=" + salary +
                '}';
    }

    public void assembly() {
        System.out.println("1 механик собирает один автомобиль за 4 месяца");
    }
}
