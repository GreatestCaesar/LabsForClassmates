package Car;

import Interface.Process;

public class  Car extends Thread implements Process { // авто
    private String mark; // марка
    private String body; // тип кузова
    private int year; // год выпуска
    private double volume; // объем
    Car c;

    public Car(String mark, String body, int year, double volume) {
        this.mark = mark;
        this.body = body;
        this.year = year;
        this.volume = volume;
    }

    public Car() {
        mark = "";
        body = "";
        year = 0;
        volume = 0;
    }

    public Car(Car c){
        super("Поток1");
        this.c = c;
        start();
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void run(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(c);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        c.rebranding(15);
        System.out.println(c.cooper());
    }

    public void rebranding(double v){
        System.out.println("Увеличение мощности авто на " + v + " л.с.");
        volume += v;
    }

    public String cooper(){
        return "Данная марка авто сотрудничает с производителем шин Michelin";
    }

    @Override
    public String toString() {
        return "Автомобиль{" +
                "марка='" + mark + '\'' +
                ", тип кузова='" + body + '\'' +
                ", год выпуска=" + year +
                ", мощность=" + volume +
                '}';
    }

    @Override
    public void assembly() {
        System.out.println("Сборка одного автомобиля 10 механиками производится за 1 месяц");
    }
}
