package Laba;

import java.util.Date;

public class Rocket {
    private String name;
    private int year;
    private String country;
    private int place;// название, срок службы, страна производитель, число места

    Rocket(){
        name = "";
        year = 0;
        country = "";
        place = 0;
    }

    Rocket(String name, int year, String country, int place){
        this.name = name;
        this.year = year;
        this.country = country;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public String Speed(){
        return "Ракета-носитель " + getName() + " разгоняет закреплённый на ней космический корабль до скорости 8650 км/ч";
    }

    public String Serviceability(){
        String str;
        if(year>15){
            str = "Ракета не пригодна к использованию";
        }else{
            str = "Ракету можно использовать";
        }
        return str;
    }

    public void Atmosphere(){
        System.out.println("Ракета носитель " + getName() + " отстыковыввается на высоте в 600км");
    }

    public String toString(){
        return "Название - " + getName() + "\nСрок службы - " + getYear() + "\nСтрана производитель - " + getCountry() + "\nКоличество мест - " + getPlace();
    }
}
