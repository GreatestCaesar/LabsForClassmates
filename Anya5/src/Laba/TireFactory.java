package Laba;

public class TireFactory {
    private String name;
    private String director;
    private String country;
    private int count;
    private double cost;

    public TireFactory(String name, String director, String country, int count, double cost) {
        this.name = name;
        this.director = director;
        this.country = country;
        this.count = count;
        this.cost = cost;
    }

    public TireFactory() {
        this.name = "";
        this.director = "";
        this.country = "";
        this.count = 0;
        this.cost = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void shares(){ // акции
        if(profit()>1000000){
            System.out.println("Акции завода растут");
        }else{
            System.out.println("Акции завода падают");
        }
    }

    public double profit(){ // прибыль
        return count*cost;
    }

    public void immport(){ // импорт
        System.out.println("На импорт идёт 50% продукции: " + (count/2));
    }

    @Override
    public String toString() {
        return "Завод Шин{" +
                "Название='" + name + '\'' +
                ", Директор='" + director + '\'' +
                ", Страна='" + country + '\'' +
                ", Количество произдведенной продукции=" + count +
                ", Цена за шт=" + cost +
                '}';
    }
}
