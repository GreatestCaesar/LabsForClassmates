package Laba;

public class Plain {
    private String name;
    private double length;
    private double sweep;
    private int place;// название, длина, размах крыльев, число мест

    public Plain(){
        name = "";
        length = 0;
        sweep = 0;
        place = 0;
    }

    public Plain(String name, double length, double sweep, int place) {
        this.name = name;
        this.length = length;
        this.sweep = sweep;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getSweep() {
        return sweep;
    }

    public void setSweep(double sweep) {
        this.sweep = sweep;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Самолёт{" +
                "Название='" + name + '\'' +
                ", длина=" + length +
                ", размах крыльев=" + sweep +
                ", количесто мест=" + place +
                '}';
    }

    public void Height(){
        System.out.println("Самолёт " + name + " может достигать высоты в 15000км");
    }

    public String Fuel(){
        return "Объем бака составляет: 171170 литров";
    }

    public String Auto(int x){
        String s;
        if(x == 1){
            s = "Самолёт переведен в режим автопилота";
        }else if(x == 0){
            s = "Самолёт перевведен в ручной режим";
        }else{
            s = "Ошибка системы";
        }
        return s;
    }
}
