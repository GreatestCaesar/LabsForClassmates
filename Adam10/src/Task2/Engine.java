package Task2;

public class Engine implements Filter{ // двигатель
    private int num; // чисвло цилиндров
    private double volume; // объём двигателя

    public Engine(int num, double volume) {
        this.num = num;
        this.volume = volume;
    }

    public Engine() {
        num = 0;
        volume = 0;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void change(){
        System.out.println("Увеличение мощности двигателя, объем увеличен на 0.6л");
        volume+=0.6;
    }

    public void fuel(String f){
        System.out.println("Данный двигатель работает на " + f + " топливе");
    }

    @Override
    public void rep(int n) {
        if(n>5000){
            System.err.println("CHECK ENGINE");
            System.out.println("Время меня фильтра и проверить двигатель у специалиста");
        }
    }

    @Override
    public String toString() {
        return "Двигатель{" +
                "кол-во цилиндров=" + num +
                ", объем=" + volume +
                '}';
    }
}
