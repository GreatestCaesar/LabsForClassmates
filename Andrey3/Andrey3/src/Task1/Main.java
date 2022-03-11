package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double r, n;
        System.out.println("Введите радиус круг: ");
        r = s.nextDouble();
        System.out.println("Введите сторону квадрата: ");
        n = s.nextDouble();
        if(r >= (n*(Math.sqrt(2)/2))){
            System.out.println("Квадрат пройдёт в круг");
        }
        if(r <= n){
            System.out.println("Круг пройдет в квадрат");
        }
    }
}
