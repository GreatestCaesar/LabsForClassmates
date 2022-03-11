package Product;

public abstract class Product extends DaityPlant.DaityPlant{ // продукция
    private String name; // название
    private double cost; // стоимость
    private double calorific; // калорийность

    public Product(String name, String dir, int num, String name1, double cost, double calorific) {
        super(name, dir, num);
        this.name = name1;
        this.cost = cost;
        this.calorific = calorific;
    }

    public Product(int num, double year, String name, String dir, int num1, String name1, double cost, double calorific) {
        super(num, year, name, dir, num1);
        this.name = name1;
        this.cost = cost;
        this.calorific = calorific;
    }

    public Product(String name, double cost, double calorific) {
        this.name = name;
        this.cost = cost;
        this.calorific = calorific;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCalorific() {
        return calorific;
    }

    public void setCalorific(double calorific) {
        this.calorific = calorific;
    }

    public void numb(){
        System.out.println("В сети магазинов евроопт данная продукция стоит на 1 месте по востребованности");
    }

    @Override
    public String toString() {
        return "Продукция{" +
                "название='" + name + '\'' +
                ", стоимость=" + cost +
                ", калорийность=" + calorific +
                '}';
    }

    public abstract void milk();
}
