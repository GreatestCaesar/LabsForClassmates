package Task2;

public class Main {
    public static void main(String[] args) {
        Triangle t = new Triangle(6, 4);
        t.radius();
        System.out.println(t);
        t.line('a',1,12);
        t.line('b',2,1);
        System.out.println(t);
        t.radius();
        t.line();
    }
}
