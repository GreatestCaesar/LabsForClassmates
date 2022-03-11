package Task2;

public class Triangle {
    private double a;
    private double b;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Triangle() {
        a = 0;
        b = 0;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void line(char c,int n,double p){
        switch (c){
            case 'a':{ // название стороны
                switch (n){
                    case 1:{ // увеличение
                        a += a*p/100;
                        break;
                    }
                    case 2:{ // уменьшение
                        a -= a*p/100;
                        break;
                    }
                }
                break;
            }
            case  'b':{ // название стороны
                switch (n){
                    case 1:{ // увеличение
                        b += b*p/100;
                        break;
                    }
                    case 2:{ // уменьшение
                        b -= b*p/100;
                        break;
                    }
                }
                break;
            }
        }
    }

    public void radius(){
        System.out.println("Радиус описанно окружности = " + (0.5*Math.sqrt(Math.pow(a,2)+Math.pow(b,2))));
    }

    public void per(){
        System.out.println("Полупериметр = " + ((a+b+c())/2));
    }

    public double c(){                    // сторона с
        return Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    }

    public void line(){  // определение углов
        System.out.println("Угол альфа = 90°, угол бетта = " + (Math.atan(a/b)/Math.PI*180) + ", угол гамма = " + (180 - Math.atan(a/b)/Math.PI*180));
    }

    @Override
    public String toString() {
        return "Треугольник{" +
                "сторона а=" + a +
                ", сторона b=" + b +
                '}';
    }
}
