package Eng;

import Intfc.Up;

public class SteamEngine extends Thread implements Up {
    private String type; // тип
    private int year; // год сборки
    private int power; // мощность
    private double pressure; // давление
    SteamEngine s;

    public SteamEngine() {
        type = "";
        year = 0;
        power = 0;
        pressure = 0;
    }

    public SteamEngine(String type, int year, int power, double pressure) {
        this.type = type;
        this.year = year;
        this.power = power;
        this.pressure = pressure;
    }

    public SteamEngine(SteamEngine s){
        super("Поток");
        this.s = s;
        start();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public void run(){
        s.on_off(2);
        System.out.println(s);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(s.service());
        s.update();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void on_off(int n){
        switch (n){
            case 1:{
                System.out.println("Запустть двигатель");
                break;
            }
            case 2:{
                System.out.println("Остановить двигатель");
                break;
            }
        }
    }

    public String service(){
        return "Двигатель проходил обслуживание 07.12.2020";
    }

    @Override
    public void update() {
        System.out.println("Двигатель нового поколения выдаёт мощность 2000");
    }

    @Override
    public String toString() {
        return "Паровой двигатель{" +
                "тип='" + type + '\'' +
                ", год сборки=" + year +
                ", мощность=" + power +
                ", давление=" + pressure +
                '}';
    }
}
