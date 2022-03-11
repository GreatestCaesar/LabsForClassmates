package Task1;

public class TV { // телевизор
    private String mark; // бренд телевизора
    private String model; // модель телевизора
    private int year; // год выпуска
    private double diagonal; // диагональ экрана
    private double depth; // глубина цвета
    private double res; // разрешение
    private double weight; // вес
    private int usb; // кол-во usb

    public TV(String mark, String model, int year, double diagonal, double depth, double res, double weight, int usb) {
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.diagonal = diagonal;
        this.depth = depth;
        this.res = res;
        this.weight = weight;
        this.usb = usb;
    }

    public TV() {
        mark = "";
        model = "";
        year = 0;
        diagonal = 0;
        depth = 0;
        res = 0;
        weight = 0;
        usb = 0;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getUsb() {
        return usb;
    }

    public void setUsb(int usb) {
        this.usb = usb;
    }

    public void newtv(){ // старый/новый
        if (year<2010){
            System.out.println("Телевизор старый");
        }else{
            System.out.println("Телевизор новый");
        }
    }

    public void newtv(double wei){                                                          // перегруженный метод
        System.out.println("Пришёл заказ на поставку телевизора и облегчением веса на " + wei);
    }

    public void adddiiagonal(){ // увеличение диагонали
        System.out.println("Диагональл увеличена на 0.5");
        diagonal += 0.5;
    }

    public void prod(int n){ // производится ли данный телевизор
        switch (n){
            case 1:{
                System.out.println("Данный телевизор больше не выпускается!");
                break;
            }
            case 2:{
                System.out.println("Данный телевизор ещё стоит на производстве");
                break;
            }
        }
    }

    public void towns(String ... s){                                                        // изменяемое количество входных данных
        System.out.println("Города в которых есть магазины с данным телевизором");
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }

    public void diagonal(double ... d){                                                     // изменяемые входные данные
        System.out.println("Запрос на производство телевизоров с данными диагоналями: ");
        for(int i=0;i<d.length;i++){
            System.out.println(d[i]);
        }
    }

    public String smart(){
        return "В данном телевизоре есть smartTV";
    }

    public String time(){
        return "В данном телевизоре так же имеется таймер сна";
    }

    public double weight(){
        return weight-0.90;
    }

    public void col(int n){
        switch (n){
            case 1:{
                System.out.println("Вам будет поставлен телевизор серого цвета");
                break;
            }
            case 2:{
                System.out.println("Вам будет поставлен телевизор чёрного цвета");
                break;
            }
            case 3:{
                System.out.println("Вам будет поставлен телевизор белого цвета");
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Телевизор{" +
                "название='" + mark + '\'' +
                ", модель='" + model + '\'' +
                ", год=" + year +
                ", диагональ=" + diagonal +
                ", глубина цвета=" + depth +
                ", разрешение=" + res +
                ", вес=" + weight +
                ", кол-во usb=" + usb +
                '}';
    }
}
