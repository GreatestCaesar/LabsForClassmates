package Task2;

public class Main {
    public static void main(String[] args){
        Parallelogram p = new Parallelogram(5,4);
        System.out.println(p);
        p.increase(1,6);
        System.out.println(p);
        p.increase(2, 5);
        System.out.println(p);
        p.decrease(1,3);
        System.out.println(p);
        p.decrease(1,2);
        System.out.println(p);
        System.out.println("Корень квадратный из периметра = " + p.per());
        System.out.println("Корень квадратный из плоащади = " + p.ar());
        System.out.println("Диагональ = " + p.diagonal2());
        System.out.println("Высота = " + p.height());
    }
}
