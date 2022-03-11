package Task2;

public class Main {
    public static void main(String[] args){
        Trapezoid t = new Trapezoid(5,6,7,6);
        Trapezoid t1 = new Trapezoid(5,6,7,6);
        Trapezoid t2 = new Trapezoid(8,7,9,7);
        t.perarea();
        System.out.println(t.middle());
        System.out.println("Высота: " + t.height());
        if(t.equ(t1)){ // пример, можно использовать и с массивами
            System.out.println("Трапеции подобны");
        }else {
            System.out.println("Трапеции не подобны");
        }
        if(t.equ(t2)){ // пример, можно использовать и с массивами
            System.out.println("Трапеции подобны");
        }else {
            System.out.println("Трапеции не подобны");
        }
    }
}
