package Mechanic;

import Car.Car;

public class Mechanic extends Car { // механик
    private String name; // имя
    private int year; // возраст
    private String educ; // образование
    private double salary; // ЗП

    public Mechanic(String name, int year1, String educ, double salary) {
        this.name = name;
        this.year = year1;
        this.educ = educ;
        this.salary = salary;
    }

    public Mechanic() {
        super();
        name = "";
        year = 0;
        educ = "";
        salary = 0;
    }

    public Mechanic(String[] f) {
        this.name = f[0];
        this.year = Integer.parseInt(f[1]);
        this.educ = f[2];
        this.salary = Double.parseDouble(f[3]);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
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

    public void working(Mechanic m){
        m.sal(500);
        System.out.println(m);
        m.assembly();
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

    @Override
    public void assembly() {
        System.out.println("1 механик собирает один автомобиль за 4 месяца");
    }
}
