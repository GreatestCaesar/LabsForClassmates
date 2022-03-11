package Task2;

import java.util.ArrayList;



public class Salad {
    private String name;
    private double calorie; // калорийность
    private double weight; // вес
    private String color; // цвет
    private int vitamins; // кол-во витаминов

    public Salad(String name, double calorie, double weight, String color, int vitamins) {
        this.name = name;
        this.calorie = calorie;
        this.weight = weight;
        this.color = color;
        this.vitamins = vitamins;
    }

    public Salad() {
        name = "";
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList creat(ArrayList<Salad> a){
        Cabbage cb = new Cabbage();
        cb.setName("Капуста");
        cb.setCalorie(25);
        cb.setWeight(100);
        cb.setColor("Зеленая");
        cb.setVitamins(7);
        a.add(cb);
        Carrot cr = new Carrot();
        cr.setName("Морковь");
        cr.setCalorie(32);
        cr.setWeight(100);
        cr.setColor("Красная");
        cr.setVitamins(6);
        a.add(cr);
        Pepper p = new Pepper();
        p.setName("Перец");
        p.setCalorie(21);
        p.setWeight(100);
        p.setColor("Красный");
        p.setVitamins(2);
        a.add(p);
        cb = new Cabbage();
        cb.setName("Капуста");
        cb.setCalorie(33);
        cb.setWeight(100);
        cb.setColor("Жёлтая");
        cb.setVitamins(4);
        a.add(cb);
        p = new Pepper();
        p.setName("Перец");
        p.setCalorie(26);
        p.setWeight(100);
        p.setColor("Зелёный");
        p.setVitamins(8);
        a.add(p);
        cb = new Cabbage();
        cb.setName("Капуста");
        cb.setCalorie(49);
        cb.setWeight(100);
        cb.setColor("Морская");
        cb.setVitamins(10);
        a.add(cb);
        return a;
    }

    public ArrayList sort(ArrayList<Salad> a){
        Salad sa = new Salad();
        for(int i=0;i<a.size();i++){
            for(int j=i+1;j<a.size();j++){
                if(a.get(i).getVitamins() > a.get(j).getVitamins()){
                    sa = a.get(i);
                    a.set(i,a.get(j));
                    a.set(j,sa);
                }
            }
        }
        return a;
    }

    public double calor(ArrayList<Salad> a){
        double d=0;
        for(int i=0;i<a.size();i++){
            d += a.get(i).getCalorie();
        }
        return d;
    }

    @Override
    public String toString() {
        return "Овощь{" +
                "название'=" + name + '\'' +
                ", калорийность=" + calorie +
                ", вес=" + weight +
                ", цвет='" + color + '\'' +
                ", кол-во витаминов=" + vitamins +
                '}';
    }
}
