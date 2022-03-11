package Task;

public class Main {
    public static void main(String[] args){
        Theatre theatre = new Theatre("Государственный",23,110,1854,2500);
        System.out.println(theatre);
        System.out.println("Площадь: " + theatre.area());
        theatre.year();
        theatre.corona();
    }
}
