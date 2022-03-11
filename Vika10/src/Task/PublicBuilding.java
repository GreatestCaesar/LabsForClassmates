package Task;

import java.util.Calendar;
import java.util.Date;

public abstract class PublicBuilding implements Building{ // Общественное здание
    private String name; // название
    private double height; // высота
    private double widht; // ширина
    private int year; // год постройки

    public PublicBuilding() {
        name = "";
        height = 0;
        widht = 0;
        year = 0;
    }

    public PublicBuilding(String name, double height, double widht, int year) {
        this.name = name;
        this.height = height;
        this.widht = widht;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidht() {
        return widht;
    }

    public void setWidht(double widht) {
        this.widht = widht;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public double area() {
        return widht*height;
    }

    @Override
    public void year() {
        System.out.println("Возраст здания: " + (Calendar.getInstance().get(Calendar.YEAR) - year));
    }

    @Override
    public String toString() {
        return "Публичное здание{" +
                "название='" + name + '\'' +
                ", высота=" + height +
                ", ширина=" + widht +
                ", год постройки=" + year +
                '}';
    }

    abstract void corona();
}
