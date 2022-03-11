package Task1;

public class PC { // персональный компьютер
    private String name; // название
    private int year; // год производства
    private double vol; // мощность процессора
    private int RAM; // оперативная память
    private String soft; // Операционная система
    private double tact; // тактовая частота
    private int cost; // стоимость
    private double weight; // вес

    public PC(String name, int year, double vol, int RAM, String soft, double tact, int cost, double weight) {
        this.name = name;
        this.year = year;
        this.vol = vol;
        this.RAM = RAM;
        this.soft = soft;
        this.tact = tact;
        this.cost = cost;
        this.weight = weight;
    }

    public PC() {
        name = "";
        year = 0;
        vol = 0;
        RAM = 0;
        soft = "";
        tact = 0;
        cost = 0;
        weight = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getVol() {
        return vol;
    }

    public void setVol(double vol) {
        this.vol = vol;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getSoft() {
        return soft;
    }

    public void setSoft(String soft) {
        this.soft = soft;
    }

    public double getTact() {
        return tact;
    }

    public void setTact(double tact) {
        this.tact = tact;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void addvol(){ // увеличение мощности процессора
        System.out.println("Мощность процессора увеличена");
        vol += 0.03;
    }

    public void addram(int n){ // увеличение оперативной памяти
        System.out.println("Оперативная память увеличена на " + n);
        RAM += n;
    }

    public String type(){ // игровой
        return "Данный ПК является игровым";
    }

    public String vers(){
        return "В данном ПК имеется последняя версия " + soft;
    }

    public String wei(){
        weight -= 0.1;
        return "Вес уменьшен до " + weight;
    }

    public void scr(){
        System.out.println("У компьютера в комплекте 2-ой монитор");
    }

    public void tact(){
        if(tact<3.5){
            System.out.println("Компьютер подоёдет для работы и средних игр");
        }else{
            System.out.println("Компьютер подойдёт для мощных игр");
        }
    }

    @Override
    public String toString() {
        return "Персональный компьютер{" +
                "Название='" + name + '\'' +
                ", год производства=" + year +
                ", мощность процессора=" + vol +
                ", оперативная память =" + RAM +
                ", операционная сис-ма='" + soft + '\'' +
                ", тактовая частота=" + tact +
                ", стоимость=" + cost +
                ", вес=" + weight +
                '}';
    }
}
