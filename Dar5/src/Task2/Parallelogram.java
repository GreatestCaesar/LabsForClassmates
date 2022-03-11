package Task2;

public class Parallelogram {
    private double line1; // сторона --
    private double line2; // сторна /
    private double diagonal; // диагональ

    public Parallelogram(double line1, double line2) {
        this.line1 = line1;
        this.line2 = line2;
        this.diagonal = diagonal1(); // из правила существования треугольников
    }

    public Parallelogram() {
        line1 = 0;
        line2 = 0;
        diagonal = diagonal1();
    }

    public double getLine1() {
        return line1;
    }

    public void setLine1(double line1) {
        this.line1 = line1;
    }

    public double getLine2() {
        return line2;
    }

    public void setLine2(double line2) {
        this.line2 = line2;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public void increase(int n, double d){ // увеличение
        switch (n){
            case 1:{
                line1 *= d;
                setDiagonal(diagonal1());
                break;
            }
            case 2:{
                line2 *= d;
                setDiagonal(diagonal1());
                break;
            }
        }
    }

    public void decrease(int n, double d){ // уменьшение
        switch (n){
            case 1:{
                line1 /= d;
                setDiagonal(diagonal1());
                break;
            }
            case 2:{
                line2/= d;
                setDiagonal(diagonal1());
                break;
            }
        }
    }

    public double diagonal1(){
        return (line1+line2-1);
    }

    public double per(){ // квадратный корень из периметра
        return Math.sqrt(line1*2+line2*2);
    } // корень квадратный из периметра

    public double ar(){ // квадратный корень из площади
        return Math.sqrt(line1*height());
    } // корень квадратный из площади

    public double diagonal2(){ // диагональ
        return Math.sqrt(2*Math.pow(line1,2)+2*Math.pow(line2,2)-Math.pow(diagonal,2));
    }

    public double height(){ // высота
        return (2*Math.sqrt(seper()*(seper()-line1)*(seper()-line2)*(seper()-diagonal)));
    }

    public double seper(){ // полупериметр
        return ((line1+line2+diagonal1())/2);
    }

    @Override
    public String toString() {
        return "Параллелограмм{" +
                "сторона1=" + line1 +
                ", сторона2=" + line2 +
                ", диагональ=" + diagonal +
                '}';
    }
}
