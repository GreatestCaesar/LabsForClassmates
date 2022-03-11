package Task1;

public class Cruiser { // крейсер
    private String name; // название
    private double speed; // макс скорость
    private int year; // год постройки
    private int count; // количество экипажа

    public Cruiser(String name, double speed, int year, int count) {
        this.name = name;
        this.speed = speed;
        this.year = year;
        this.count = count;
    }

    public Cruiser() {
        name = "";
        speed = 0;
        year = 0;
        count = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void army(int n){
        switch (n){
            case '1':{
                System.out.println("Крейсер приведен в боевую готовность!");
                break;
            }
            default:{
                System.out.println("Крейсер в обычном режиме");
                break;
            }
        }
    }

    public void helic(int c){
        switch (c){
            case '1':{
                System.out.println("Вертолётная площадка не свободна");
                break;
            }
            default:{
                System.out.println("Вертолётная площадка свободна");
                break;
            }
        }
    }

    public void incspeed(double i){
        if(i>60){
            System.out.println("Крейсер не может развивать такую скорость");
        }else{
            System.out.println("Скоость увеличена до " + i);
            speed = i;
        }
    }

    @Override
    public String toString() {
        return "Крейсер{" +
                "название='" + name + '\'' +
                ", скорость=" + speed +
                ", год постройки=" + year +
                ", кол-во экипажа=" + count +
                '}';
    }
}
