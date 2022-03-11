package Task2;

public class Main {
    public static void main(String[] args){
        Triangle t = new Triangle(6,50,40);
        t.incdec();
        System.out.println("Угол beta -  " + t.beta());
        System.out.println("Сторона а - " + t.a());
        System.out.println("Сторона с - " + t.c());
        t.medians();
        Triangle x = new Triangle(6,50,40);
        Triangle y = new Triangle(10, 60,50);
        if(t.equals(x)){
            System.out.println("t и x подобны");
        }else if(t.equals(y)){
            System.out.println("t и y подобны");
        }else{
            System.out.println("t не подобен ни на один треугольник");
        }
    }
}
