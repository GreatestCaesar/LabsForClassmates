package Task1;

import javax.sound.midi.Soundbank;

public class СruiseShip{ // круизный лайнер
    private String captain; // капитан корабля
    private double length; // длина
    private double width; // ширина
    private double carrying; // вместительность
    private int way; // весь путь
    private int deck; // кол-во палуб
    private double height; // высота
    private int cabins; // кол-во кают
    private int pass; // кол-во пассажиров

    public СruiseShip(String captain, double length, double width, double carrying, int way, int deck, double height, int cabins, int pass) {
        this.captain = captain;
        this.length = length;
        this.width = width;
        this.carrying = carrying;
        this.way = way;
        this.deck = deck;
        this.height = height;
        this.cabins = cabins;
        this.pass = pass;
    }

    public СruiseShip() {
        captain = "";
        length = 0;
        width = 0;
        carrying = 0;
        way = 0;
        deck = 0;
        height = 0;
        cabins = 0;
        pass = 0;
    }

    public String getCaptain() {
        return captain;
    }

    public void setCaptain(String captain) {
        this.captain = captain;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getCarrying() {
        return carrying;
    }

    public void setCarrying(double carrying) {
        this.carrying = carrying;
    }

    public int getWay() {
        return way;
    }

    public void setWay(int way) {
        this.way = way;
    }

    public int getDeck() {
        return deck;
    }

    public void setDeck(int deck) {
        this.deck = deck;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getCabins() {
        return cabins;
    }

    public void setCabins(int cabins) {
        this.cabins = cabins;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public void w(int k){ // путь который прошел
        System.out.println("Путь который прошел: " + k
        + ". Процент до конца пути: " + (way-k)*100/way);
    }

    public void clean( double r,double z, double c){ // очистка
        System.out.println("Нарост ракушек: " + z + ", водорослей: " + z + ", соли: " + c);
        if((r+z+c)<7){
            System.out.println("Очистка не требуется");
        }else{
            System.out.println("Необходимо произвести очистку");
        }
    }

    public void sos(int n){ // вызов помощи
        if(n>4){
            System.out.println("К кораблю отправлена помощь");
        }else{
            System.out.println("Связь с кораблем в порядке");
        }
    }

    public String data(){ // дата отплытия
        return "Корабаль начал своий крузи 03.11.2020";
    }

    public void cab(){ // увеличение кают
        cabins += 4;
        System.out.println("Число кают увеличено на 4");
    }

    public void place(){ // отказ в поездке
        if(pass>5942){
            System.out.println("Лайнер не может вместить такое кол-во пассажиров!");
        }else{
            System.out.println("Кол-во пассажиров соответсвует норме");
        }
    }

    public void place(int n){                                                   // перегруженный метод
        pass -= n;
        System.out.println("Забронировано " + n + " мест, осталось " + pass);
    }

    public String location(){ // местонахождение
        return "Корабль покинул территорию нейтральных вод";
    }

    public void location(String ... s){
        System.out.println("Города в которые будет заходить крейсре на своём пути: ");
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }

    @Override
    public String toString() {
        return "Круизный лайнер{" +
                "Капитан='" + captain + '\'' +
                ", длина=" + length +
                ", ширина=" + width +
                ", вместительность=" + carrying +
                ", путь=" + way +
                ", кол-во палуб=" + deck +
                ", высота=" + height +
                ", кол-во кают=" + cabins +
                ", кол-во пассажиров=" + pass +
                '}';
    }
}
