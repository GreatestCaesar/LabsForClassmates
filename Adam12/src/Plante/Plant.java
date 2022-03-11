package Plante;

import Car.*;

public class Plant extends Car { // авто завод
    private String name; // навзание завода
    private double stock; // стоимость акций завода(за 1)
    private String country; // в какой стране находится

    public Plant() {
        name = "";
        stock = 0;
        country = "";
    }

    public Plant(String name, double stock, String country) {
        this.name = name;
        this.stock = stock;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public void change() {
        System.out.println("В связи с Covid-19 завод вынужден снизить выпуск авто");
    }

    public void types(){
        System.out.println("Кузова выпускаемых авто и виды КПП: \n1. Универсал с АКПП\n2. Седан с МКПП\n3. Грузовик с МКПП");
    }

    @Override
    public String toString() {
        return "Завод{" +
                "название='" + name + '\'' +
                ", цена акции" + stock +
                ", страна='" + country + '\'' +
                '}';
    }
}
