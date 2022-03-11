package Task1;

import java.util.Scanner;

public class Country extends Region{ // государство
    private String name; // название страны
    private String president; // фамилия президента
    private int count; // количество областей
    private double area; // площадь
    private String capital; // столица

    public Country(String name, int population, int year, String surname, int school, double area, int count, String center, double area1, int population1, String name1, int density, int counttown, String governor, int population2, String name2, String president, int count1, double area2, String capital) {
        super(name, population, year, surname, school, area, count, center, area1, population1, name1, density, counttown, governor, population2);
        this.name = name2;
        this.president = president;
        this.count = count1;
        this.area = area2;
        this.capital = capital;
    }

    public Country() {
        super();
        this.name = "";
        this.president = "";
        this.count = 0;
        this.area = 0;
        this.capital = "";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public void setArea(double area) {
        this.area = area;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    @Override
    public void Area() {
        System.out.println("Площадь района: " + area);
    }

    public String cap(){
        return "Столица: " + capital;
    }

    public void num(){
        System.out.println("Количество областей: " + count);
    }

    public void reg(String ... n){
        System.out.print("Областные центры: ");
        for(int i=0;i<n.length;i++){
            System.out.println(n[i] + ". ");
        }
    }

    public String info(){
        System.out.println(super.info());
        return super.toString();
    }

    @Override
    public String toString() {
        return "Государство{" +
                "Название='" + name + '\'' +
                ", президент='" + president + '\'' +
                ", кол-во областей=" + count +
                ", площадь=" + area +
                '}';
    }
}
