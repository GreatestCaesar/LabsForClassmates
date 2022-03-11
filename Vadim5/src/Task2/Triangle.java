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

    public void incdec(){                                                               // увеличение/уменьшение угла
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("1. Увеличить\t2. Уменьшить");
        n = s.nextInt();
        switch(n){
            case 1:{
                System.out.println("1. Угол1\t2. Угол2");
                int t = s.nextInt();
                switch (t){
                    case 1:{
                        System.out.print("Введите количество процентов: ");
                        double per = s.nextDouble();
                        System.out.println("Угол1 увеличен на " + (alpha*per/100) + " градусов");
                        alpha += (alpha*per/100);
                        break;
                    }
                    case 2:{
                        System.out.print("Введите количество процентов: ");
                        double per = s.nextDouble();
                        System.out.println("Угол2 увеличен на " + (gamma*per/100) + " градусов");
                        gamma += (gamma*per/100);
                        break;
                    }
                }
                break;
            }
            case 2:{
                System.out.println("1. Угол1\t2. Угол2");
                int t = s.nextInt();
                switch (t){
                    case 1:{
                        System.out.print("Введите количество процентов: ");
                        double per = s.nextDouble();
                        System.out.println("Угол1 уменьшен на " + (alpha*per/100) + " градусов");
                        alpha -= (alpha*per/100);
                        break;
                    }
                    case 2:{
                        System.out.print("Введите количество процентов: ");
                        double per = s.nextDouble();
                        System.out.println("Угол2 уменьшен на " + (gamma*per/100) + " градусов");
                        gamma -= (gamma*per/100);
                        break;
                    }
                }
                break;
            }
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

    public double height(double angle){
        return (2*Math.sqrt(per()*(per()-a())*(per()-b)*(per()-c()))/angle);
    }

    public double per(){
        return 0.5*(alpha*beta()*gamma);
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
