package Task1;

import javax.print.DocFlavor;

public class Headphones {                                    // наушники
    private double weight;                                   // вес
    private double time;                                     // время зарядки
    private String type;                                     // тип(беспроводные/проводные)
    private String material;                                 // материал(пластик/металл)
    private String name;                                     // название
    private double acum;                                     // ёмкость аккумулятора
    private double box;                                      // ёмкость бокса
    private double border;                                   // нижняя граница диапазона

    public Headphones(double weight, double time, String type, String material, String name, double acum, double box, double border) {
        this.weight = weight;
        this.time = time;
        this.type = type;
        this.material = material;
        this.name = name;
        this.acum = acum;
        this.box = box;
        this.border = border;
    }

    public Headphones() {
        weight = 0;
        time = 0;
        type = "";
        material = "";
        name = "";
        acum = 0;
        box = 0;
        border = 0;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAcum() {
        return acum;
    }

    public void setAcum(double acum) {
        this.acum = acum;
    }

    public double getBox() {
        return box;
    }

    public void setBox(double box) {
        this.box = box;
    }

    public double getBorder() {
        return border;
    }

    public void setBorder(double border) {
        this.border = border;
    }

    public void mic(int n){                                                                         // наличие микрофона
       switch (n){
           case 1:{
               System.out.println("Наушники имеют микрофон");
               break;
           }
           case 2:{
               System.out.println("Наушники не имеют микрофон");
               break;
           }
       }
    }

    public String color(){                                                                                       // цвет
        return "Наушники есть в белом и чёрном цветах";
    }

    public void ti(){                                                                                    // время работы
        if(time<2){
            System.out.println("Время работы наушников 6 часов");
        }else if(time>=2){
            System.out.println("Время работы наушников 8 часов");
        }
    }

    public String color(int n){
        String s = "";
        switch (n){
            case 1:{
                s = "Выбран чёрный цвет";
                break;
            }
            case 2:{
                s = "Выбран белый цвет";
                break;
            }
        }
        return s;
    }

    public void addbox(int n){
        System.out.println("Ёмкость бокса увеличена на " + n);
        box += n;
    }

    public String as(){
        return "Наушники имеют поддержку голосового ассистента";
    }

    public String type(){
        return "Тип излучателя динамический";
    }

    @Override
    public String toString() {
        return "Наушники{" +
                "вес=" + weight +
                ", время зарядки=" + time +
                ", тип='" + type + '\'' +
                ", материал='" + material + '\'' +
                ", название='" + name + '\'' +
                ", ёмкость аккумулятора=" + acum +
                ", ёмкость бокса=" + box +
                ", верхняя граница диапазона=" + border +
                '}';
    }
}
