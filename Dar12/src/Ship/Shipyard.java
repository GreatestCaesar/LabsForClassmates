package Ship;

import Intfc.Up;
import Ves.SteamVessel;

public class Shipyard extends SteamVessel implements Up {
    private String name; // название
    private int year; // год основания
    private int emp; // кол-во сотрудников
    private int num; // кол-во собираемых пароходов в год

    public Shipyard(String name, int year, int place, double way, int mindepth, String name1, int year1, int emp, int num) {
        super(name, year, place, way, mindepth);
        this.name = name1;
        this.year = year1;
        this.emp = emp;
        this.num = num;
    }

    public Shipyard(String name, int year, int emp, int num) {
        this.name = name;
        this.year = year;
        this.emp = emp;
        this.num = num;
    }

    @Override
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

    public void setYear(int year) {
        this.year = year;
    }

    public int getEmp() {
        return emp;
    }

    public void setEmp(int emp) {
        this.emp = emp;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void ves(){
        System.out.println("Со своего основания завод поставил на воду " + ((2020-year)*num) + " пароходов");
    }

    @Override
    public void update() {
        System.out.println("Завод увеличил штат сотрудников на 500");
        emp += 500;
    }

    @Override
    public String toString() {
        return "Верфь{" +
                "Название='" + name + '\'' +
                ", год основания=" + year +
                ", кол-во работников=" + emp +
                ", кол-во пароходов выпускаемых в год=" + num +
                '}';
    }
}
