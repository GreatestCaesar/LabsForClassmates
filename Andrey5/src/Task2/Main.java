package Task2;

public class Main {
    public static void main(String[] args){
        Rhombus r = new Rhombus(5,3);
        System.out.println(r);
        r.percent(1,23);
        System.out.println(r);
        r.percent(2,6);
        System.out.println(r);
        System.out.println("Высота = " + r.height());
        r.perandarea();
    }
}
