package Laba;

public class Refinery { // завод нефтепродуктов
    private String name;
    private String city;
    private int count; // количество сотрудников
    private int countF; // количество филиалов
    private double countO; // количество перерабатываемой нефти
    private double cost; //

    public Refinery(String name, String city, int count, int countF, double countO, double cost) {
        this.name = name;
        this.city = city;
        this.count = count;
        this.countF = countF;
        this.countO = countO;
        this.cost = cost;
    }

    public Refinery() {
        this.name = "";
        this.city = "";
        this.count = 0;
        this.countF = 0;
        this.countO = 0;
        this.cost = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCountF() {
        return countF;
    }

    public void setCountF(int countF) {
        this.countF = countF;
    }

    public double getCountO() {
        return countO;
    }

    public void setCountO(double countO) {
        this.countO = countO;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void percentoil(){
        System.out.println("Количетсов продукции, которая идёт на произвоство масла: " + (countO*2/100));
    }

    public void credit(){
        if(profit()>200000){
            System.out.println("Получен кредит на сумму: 1000000");
        }else if(profit()<200000){
            System.out.println("В кредите отказано");
        }
    }

    public void county(String s){
        switch (s){
            case "Россия":{
                System.out.println("Экспорт в Россию составляет: " + (countO/2));
                break;
            }
            case "Германия":{
                System.out.println("Экспорт в Германию составляет: " + (countO*40/100));
                break;
            }
            case "США":{
                System.out.println("Экспорт в Германию составляет: " + (countO*30/100));
                break;
            }
            case "Франция":{
                System.out.println("Экспорт в Германию составляет: " + (countO*20/100));
                break;
            }
            default:{
                break;
            }
        }
    }

    public double profit(){
        return countO*cost;
    }

    @Override
    public String toString() {
        return "Завод нефтепрдуктов{" +
                "Название='" + name + '\'' +
                ", Город='" + city + '\'' +
                ", Количество сотрудников=" + count +
                ", Количество филилалов=" + countF +
                ", Количество переработанной нефти(л)=" + countO +
                ", Цена за л=" + cost +
                '}';
    }
}
