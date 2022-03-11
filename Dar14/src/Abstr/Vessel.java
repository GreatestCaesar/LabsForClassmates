package Abstr;

public abstract class Vessel {
    private String name; // название
    private int year; // год сборки
    private int place; // число мест для пассажиров
    private double way; // запас хода

    public Vessel() {
        name = "";
        year = 0;
        place = 0;
        way = 0;
    }

    public Vessel(String name, int year, int place, double way) {
        this.name = name;
        this.year = year;
        this.place = place;
        this.way = way;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getPlace() {
        return place;
    }

    public double getWay() {
        return way;
    }

    @Override
    public String toString() {
        return "Судно{" +
                "название='" + name + '\'' +
                ", год постройки=" + year +
                ", кол-во мест=" + place +
                ", запас хода=" + way +
                '}';
    }

    public abstract String service();
    public abstract void river(String riv);
}
