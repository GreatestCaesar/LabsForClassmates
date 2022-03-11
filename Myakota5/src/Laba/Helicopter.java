package Laba;

public class Helicopter {
    private String name;
    private double diameter;
    private int year;
    private int place;//название, диаметр лопастей, год производства, число мест

    public Helicopter(String name, double diameter, int year, int place) {
        this.name = name;
        this.diameter = diameter;
        this.year = year;
        this.place = place;
    }

    public Helicopter() {
        name = "";
        diameter = 0;
        year = 0;
        place = 0;
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

    @Override
    public String toString() {
        return "Вертолёт{" +
                "Название='" + name + '\'' +
                ", диаметр крыльев=" + diameter +
                ", год производства=" + year +
                ", количество мест=" + place +
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
        System.out.println("Дальность полёта " + name + " составляет 500км");
    }
}
