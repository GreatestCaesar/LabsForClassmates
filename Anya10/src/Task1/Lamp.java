package Task1;

import java.util.Calendar;
import java.util.Date;

public class Lamp implements LightSource{
    private String name; // производитель
    private int light; // размер лампочки
    private double dia; // диаметр плафона
    private double height; // высота
    private int year; // год производства

    public Lamp() {
        name = "";
        light = 0;
        dia = 0;
        height = 0;
        year = 0;
    }

    public Lamp(String name, int light, double dia, double height, int year) {
        this.name = name;
        this.light = light;
        this.dia = dia;
        this.height = height;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLight() {
        return light;
    }

    public void setLight(int light) {
        this.light = light;
    }

    public double getDia() {
        return dia;
    }

    public void setDia(double dia) {
        this.dia = dia;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void time(String t){                                 // метод можно реализовать в по для умного дома, где есть умная лампа с отключением по таймеру
        System.out.println("Время отключения света: " + t);
    }

    @Override
    public void on_off(int n) {
        if(n==1){
            System.out.println("Включить лампу");
        }else if(n==2){
            System.out.println("Выключить лампу");
        }
    }


    @Override
    public void warranty() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        if(calendar.get(Calendar.YEAR)-year>1){
            System.out.println("Гарантия на лампу закончилась");
        }else{
            System.out.println("Гарантия еще актуальна");
        }
    }

    @Override
    public String toString() {
        return "Лампа{" +
                "производитель='" + name + '\'' +
                ", размер лампочки=" + light +
                ", диаметр плафона=" + dia +
                ", высота=" + height +
                ", год произдвоства=" + year +
                '}';
    }
}
