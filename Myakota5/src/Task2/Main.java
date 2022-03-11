package Task2;

public class Main {
    public static void main(String[] args){
        Rectangle r = new Rectangle(5,7);
        System.out.println(r);
        r.PercentIncrement(1,40);
        r.PercentIncrement(2,35);
        System.out.println(r);
        r.PercentDecrement(1,20);
        r.PercentDecrement(2,5);
        System.out.println(r);
        r.Area();
        r.Diagonal();
        r.Perimeter();
    }
}
