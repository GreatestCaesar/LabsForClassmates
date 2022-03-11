package Task1;

public class Radio {                                     // радио
    private String range;                                // диапазон частота
    private double width;                                // ширина
    private double height;                               // высота
    private double weight;                                // вес
    private String model;                                // модель
    private int year;                                   // год производства
    private double km;                                    // дальность связи
    private double power;                               // мощность

    public Radio(String range, double width, double height, double weight, String model, int year, double km, double power) {
        this.range = range;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.model = model;
        this.year = year;
        this.km = km;
        this.power = power;
    }

    public Radio() {
        range = "";
        width = 0;
        height = 0;
        weight = 0;
        model = "";
        year = 0;
        km = 0;
        power = 0;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void screen(int n){                             // наличие экрана
        if(n == 1){
            System.out.println("Данное радио имеет экран");
        }else if(n == 2){
            System.out.println("Данное радио не оснащено экраном");
        }
    }

    public void screen(String s){                                               // перегруженный метод
        System.out.println("Установит в радио" + s + " экран");
    }

    public void deincwei(double n){                        // уменьшение веса
        if(n >= weight){
            System.out.println("Вес не может быть уменьшен на " + n + " так как настоящая масса " + weight);
        }else{
            System.out.println("Вес уменьшен до " + (weight-n));
            weight -= n;
        }
    }

    public String rad(){                                   // кол-во радиостанций
        return "Радио улавливает частоты 64 радиостанции";
    }

    public String add(){
        km+=6;
        return "Дальность связи увеличена на 6км";
    }

    public void pow(){
        if(power<30){
            System.out.println("Радио слабой мощности");
        }else{
            System.out.println("Радио большой мощности");
        }
    }

    public String app(){
        return "Данное радио используется в гражданских целях";
    }

    public String amp(){
        return "Даное радио использует амплитудную модуляцию";
    }

    public void rad(String ... s){                                              // изменяемое количество входных параметров
        System.out.println("Компании с которыми контракт на поставку радиообрудования: ");
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }

    @Override
    public String toString() {
        return "Радио{" +
                "диапазон частот=" + range +
                ", ширина=" + width +
                ", высота=" + height +
                ", вес=" + weight +
                ", модель='" + model + '\'' +
                ", год производства=" + year +
                ", дальность сигнала=" + km +
                ", мощность=" + power +
                '}';
    }
}
