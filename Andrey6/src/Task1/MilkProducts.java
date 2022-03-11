package Task1;

public class MilkProducts { // молочная продукция
    private String name;     // название предприятия
    private String director; // фамилия директора
    private int num;         // кол-во акционеров
    private int count;       // кол-во выпускаемой продукции
    private int mil;         // кол-во перерабатываемого молока
    private double cost;     // стоимость единицы продукции(средняя)
    private int year;        // год основания
    private String place;    // город

    public MilkProducts() {
        name = "";
        director = "";
        num = 0;
        count = 0;
        mil = 0;
        cost = 0;
        year = 0;
        place = "";
    }

    public MilkProducts(String name, String director, int num, int count, int mil, double cost, int year, String place) {
        this.name = name;
        this.director = director;
        this.num = num;
        this.count = count;
        this.mil = mil;
        this.cost = cost;
        this.year = year;
        this.place = place;
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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getMil() {
        return mil;
    }

    public void setMil(int mil) {
        this.mil = mil;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void prod(){
        System.out.println("Продукция предприятия представлена под марками: \nСлавянские традиции\nВенский завтрак\nАристей");
    }

    public void acc(){
        System.out.println("Количество акционеров уменьшилось на 2");
        num-=2;
    }

    public void addprod(){
        System.out.println("Предприятие стало выпускать на 10000(ед) продукции больше");
        count+=10000;
    }

    public double profit(){
        return (cost*mil);
    }

    public String market(){
        return "Целевой рынок \n" +
                "          Беларусь\n" +
                "          Россия \n" +
                "          Украина";
    }

    public String milk(){
        mil += 100000;
        return "Количество перерабатываемого молока увеличилось до " + mil;
    }

    public void wage(){
        System.out.println("Средняя заработная плата составляет 900р");
    }

    @Override
    public String toString() {
        return "Молочная продкукция{" +
                "название предприятия='" + name + '\'' +
                ", директор='" + director + '\'' +
                ", кол-во акционеров=" + num +
                ", кол-во выпускаемой продукции=" + count +
                ", кол-во перерабатываемого молока=" + mil +
                ", цена за ед=" + cost +
                ", год основания=" + year +
                ", город='" + place + '\'' +
                '}';
    }
}
