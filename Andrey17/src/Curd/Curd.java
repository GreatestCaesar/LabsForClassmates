package Curd;

public class Curd extends Product.Product{
    private int time; // срок годности

    public Curd(String name, double cost, double calorific, int time) {
        super(name, cost, calorific);
        this.time = time;
    }

    public Curd() {
        super("", 0, 0);
        time = 0;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public void milk() {
        System.out.println("Для приготовления 1 сырка необходимо 0.3 литра молока");
    }

    @Override
    public String toString() {
        return "Curd{" +
                "название='" + getName() + '\'' +
                ", стоимость=" + getCost() +
                ", калорийность=" + getCalorific() +
                ", срок годности=" + time +
                '}';
    }
}
