package Task2;

public class Cabbage{ // капуста
    private double calorie; // калорийность
    private double weight; // вес
    private String color; // цвет
    private int vitamins; // кол-во витаминов

    public Cabbage(double calorie, double weight, String color, int vitamins) {
        this.calorie = calorie;
        this.weight = weight;
        this.color = color;
        this.vitamins = vitamins;
    }

    public Cabbage() {
        calorie = 0;
        weight = 0;
        color = "";
        vitamins = 0;
    }

    public double getCalorie() {
        return calorie;
    }

    public void setCalorie(double calorie) {
        this.calorie = calorie;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVitamins() {
        return vitamins;
    }

    public void setVitamins(int vitamins) {
        this.vitamins = vitamins;
    }

    @Override
    public String toString() {
        return "\nКапуста{" +
                "\nкалорийность=" + calorie +
                "\nвес=" + weight +
                "\nцвет='" + color + '\'' +
                "\nкол-во витаминов=" + vitamins +
                '}';
    }
}
