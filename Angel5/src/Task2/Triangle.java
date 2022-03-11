package Task2;

import java.util.Scanner;

public class Triangle { // треугольник
    private double b;    // сторона
    private double alpha; // угол1
    private double gamma; // угол2

    public Triangle(double b, double alpha, double gamma) {
        this.b = b;
        this.alpha = alpha;
        this.gamma = gamma;
    }

    public Triangle() {
        b = 0;
        alpha = 0;
        gamma = 0;
    }

    public double getLine() {
        return b;
    }

    public void setLine(double line) {
        this.b = line;
    }

    public double getCorner1() {
        return alpha;
    }

    public void setCorner1(double corner1) {
        this.alpha = corner1;
    }

    public double getCorner2() {
        return gamma;
    }

    public void setCorner2(double corner2) {
        this.gamma = corner2;
    }

    public void incdec(){                                                               // увеличение/уменьшение стороны
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("1. Увеличить сторону\t2. Уменьшить сторону");
        n = s.nextInt();
        if(n==1){
            System.out.println("В сколько раз?");
            n = s.nextInt();
            b *= n;
            System.out.println("Сторона равна = " + b);
        }else if(n==2){
            System.out.println("В сколько раз?");
            n = s.nextInt();
            b /= n;
            System.out.println("Сторона равна = " + b);
        }
    }

    public double beta(){ // нахождение угла betta
        return (180-(alpha+gamma));
    } // для углов угол*пи/180

    public double a(){                                                                       // нахождение 2-ой стороный
        return b*Math.sin(alpha*Math.PI/180)/Math.sin(beta()*Math.PI/180);
    }

    public double c(){                                                                        // нахождение 3-ей стороны
        return b*Math.sin(gamma*Math.PI/180)/Math.sin(beta()*Math.PI/180);
    }

    public void medians(){                                                                    // медианы каждой стороный
        System.out.println("Медиана стороны а = " + (Math.sqrt(2*Math.pow(b,2)+2*Math.pow(c(),2)-Math.pow(a(),2))/2));
        System.out.println("Медиана стороны b = " + (Math.sqrt(2*Math.pow(a(),2)+2*Math.pow(c(),2)-Math.pow(b,2))/2));
        System.out.println("Медиана стороны c = " + (Math.sqrt(2*Math.pow(b,2)+2*Math.pow(a(),2)-Math.pow(c(),2))/2));
    }

    public boolean equals(Triangle c){                                                      // подобны ли треугольники
        if(a() == c.a() && b == c.b && c() == c.c()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Треугольник{" +
                "сторона=" + b +
                ", прилежащий к ней угол1=" + alpha +
                ", прилежащий к ней угол2=" + gamma +
                '}';
    }
}
