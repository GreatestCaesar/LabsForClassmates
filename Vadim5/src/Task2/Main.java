package Task2;

public class Main {
    public static void main(String[] args){
        Triangle t = new Triangle(6,50,40);
        t.incdec();
        System.out.println("Сторона а: " + t.a());
        System.out.println("Сторона b: " + t.getLine());
        System.out.println("Сторона c: " + t.c());
        System.out.println("Высота стороны а: " + t.height(t.a()));
        System.out.println("Высота стороны b: " + t.height(t.getLine()));
        System.out.println("Высота стороны b: " + t.height(t.c()));
    }
}
