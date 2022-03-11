package Laba;

public class Helicopter {
    private String name;
    private double diameter;
    private int year;
    private int place;
    private double length;
    private double width;
    private double weight;
    private double range;//название, диаметр лопастей, год производства, число мест, длина, ширина, масса, дальность

    public Helicopter(String name, double diameter, int year, int place, double length, double width, double weight, double range) {
        this.name = name;
        this.diameter = diameter;
        this.year = year;
        this.place = place;
        this.length = length;
        this.width = width;
        this.weight = weight;
        this.range = range;
    }

    public Helicopter() {
        name = "";
        diameter = 0;
        year = 0;
        place = 0;
        length = 0;
        width = 0;
        weight = 0;
        range = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public String Time(){
        return "Вертолёт пролетел в общей сумме 1400 часов";
    }

    public void QS(){
        System.out.println("Вертолёт укомплектован 4 основными лопастями и 4 лопастями управления");
    }

    public String QF(){
        return "Вертолёту для полёта необходимо 500 литров топлива";
    }

    public void QG(){
        System.out.println("Вёртолёт оснащён пулемётом на правой стороне");
    }

    @Override
    public String toString() {
        return "Вертолёт{" +
                "название='" + name + '\'' +
                ", диаметр лопастей=" + diameter +
                ", год производства=" + year +
                ", количество мест=" + place +
                ", длина=" + length +
                ", ширина=" + width +
                ", масса=" + weight +
                ", дальность=" + range +
                '}';
    }

    public String Сarrying(){
        return "Вертолёт " + name + " поднимает грузы до 2500кг";
    }

    public void Fight(int n){
        if(n == 1){
            System.out.println("Вертолёт не боеспособен");
        }else if(n == 0){
            System.out.println("Вертолёт не боеспособен");
        }
    }

    public void Range(){
        System.out.println("Дальность полёта " + name + " составляет " + range + " км");
    }
}
