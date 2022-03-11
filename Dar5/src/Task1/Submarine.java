package Task1;

public class Submarine { //подлодка
    private double length; // длина
    private double depth; // глубина на данный момент
    private String name; // название
    private String country; // страна

    public Submarine(String name, double length, double depth, String country) {
        this.length = length;
        this.depth = depth;
        this.name = name;
        this.country = country;
    }

    public Submarine(){
        length = 0;
        depth = 0;
        name = "";
        country = "";
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void increase(){ // увлеичение подлодки
        System.out.println("Перестроить подлодку и увеличить длину на 2 метра");
        length += 2;
    }

    public void detection(int n){ // обнаружение
        switch (n){
            case '1':{
                System.out.println("Обнаружен неопознанный объект");
                break;
            }
            default:{
                System.out.println("Угроз не обнаружено");
            }
        }
    }

    public void dep(double d){
        if(d<320){
            System.out.println("Подлодка меняет глубину на " + d + " метров");
            depth = d;
        }else{
            System.out.println("Данная глубина недопустима");
        }
    }

    @Override
    public String toString() {
        return "Подлодка{" +
                "Название='" + name + '\'' +
                ", Страна='" + country + '\'' +
                ", Длина=" + length +
                ", Глубина=" + depth +
                '}';
    }
}
