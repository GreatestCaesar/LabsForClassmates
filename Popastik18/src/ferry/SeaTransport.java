package ferry;

abstract public class SeaTransport extends transport {

    public SeaTransport(int quantity, double price, int day, int payback) {
        super(quantity,price,day,payback);
    }

    abstract public  Object[] Input();
    public double Cost(int quantity, double price ) {
        double cost;
        cost=price*quantity;
        System.out.println("Выручка за проданые места:"+ cost);
        return cost;
    }
}
