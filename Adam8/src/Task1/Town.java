package Task1;

import java.util.Scanner;

public class Town { // город
    private String name; // название
    private int population; // население
    private int year; // год основания
    private double area; // площадь

    public Town(String name, int population, int year, double area) {
        this.name = name;
        this.population = population;
        this.year = year;
        this.area = area;
    }

    public Town() {
        name = "";
        population = 0;
        year = 0;
        area = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Town[] create(Town[] towns) {
        Scanner scanner = new Scanner(System.in);
        Town t = new Town();
        Town[] tow;
        if (towns == null) {
            tow = new Town[1];
        } else {
            tow = new Town[towns.length + 1];
            for (int i = 0; i < towns.length; i++) {
                tow[i] = towns[i];
            }
        }
        System.out.println("Введите название города: ");
        t.setName(scanner.nextLine());
        System.out.println("Введите население города: ");
        t.setPopulation(scanner.nextInt());
        System.out.println("Введите год основания города: ");
        t.setYear(scanner.nextInt());
        System.out.println("Введите площадь города: ");
        t.setArea(scanner.nextDouble());
        tow[tow.length - 1] = t;
        towns = tow;
        return towns;
    }

    @Override
    public String toString() {
        return "\nГород{" +
                "\nназвание='" + name + '\'' +
                "\nнаселение=" + population +
                "\nгод основания=" + year +
                "\nплощадь='" + area + '\'' +
                '}';
    }
}
