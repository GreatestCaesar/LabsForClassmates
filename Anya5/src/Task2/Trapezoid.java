package Task2;

import java.util.Scanner;

public class Trapezoid {
    private int line1;
    private int line2;
    private int line3;
    private int line4;

    public Trapezoid(int line1, int line2, int line3, int line4) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
        this.line4 = line4;
    }

    public Trapezoid(){
        line1 = 1;
        line2 = 2;
        line3 = 3;
        line4 = 3;
    }

    public int getLine1() {
        return line1;
    }

    public void setLine1(int line1) {
        this.line1 = line1;
    }

    public int getLine2() {
        return line2;
    }

    public void setLine2(int line2) {
        this.line2 = line2;
    }

    public int getLine3() {
        return line3;
    }

    public void setLine3(int line3) {
        this.line3 = line3;
    }

    public int getLine4() {
        return line4;
    }

    public void setLine4(int line4) {
        this.line4 = line4;
    }

    public void incdec(){
        Scanner s = new Scanner(System.in);
        System.out.println("1. Увеличить\n2. Уменьшить");
        char c;
        c = s.nextLine().charAt(0);
        switch (c){
            case '1':{
                System.out.println("Введите в сколько раз увеличить: ");
                int n = s.nextInt();
                line1*=n;
                line2*=n;
                line3*=n;
                line4*=n;
                break;
            }
            case '2':{
                System.out.println("Введите в сколько раз уменьшить: ");
                int n = s.nextInt();
                line1/=n;
                line2/=n;
                line3/=n;
                line4/=n;
                break;
            }
            default:{
                System.out.println("Ошибка");
            }
        }
    }

    public void perarea(){
        System.out.println("Периметр="+(line1+line2+line3+line4));
        System.out.println("Площадь=" + (0.5*(line1+line2)*height()));
    }

    public boolean equ(Trapezoid a){  // подобны ли
        if(line1 == a.getLine1() && line2 == a.getLine2() && line3 == a.getLine3() && line4 == a.getLine4()){
            return true;
        }else{
            return false;
        }
    }

    public String middle(){
        return "Средняя линия равна: "+(0.5*(line3+line4));
    }

    public double height(){
        return (Math.sqrt(Math.pow(line4,2)-((Math.pow(Math.pow((line1-line3),2),2)+Math.pow(line4,2)-Math.pow(line2,2))/(2*(line3-line1)))));
    }

    @Override
    public String toString() {
        return "Трапеция{" +
                "Сторона1=" + line1 +
                ", Сторона2=" + line2 +
                ", Сторона3=" + line3 +
                ", Сторона4=" + line4 +
                '}';
    }
}
