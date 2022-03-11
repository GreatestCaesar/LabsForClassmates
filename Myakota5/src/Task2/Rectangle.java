package Task2;

public class Rectangle {
    private double line1;
    private double line2;

    public Rectangle(){
        line1 = 0;
        line2 = 0;
    }

    public Rectangle(double line1, double line2) {
        this.line1 = line1;
        this.line2 = line2;
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

    public void PercentIncrement(int n, double p){
        if(n == 1){
            line1 += Percent(line1,p);
        }else if(n == 2){
            line2 += Percent(line2,p);
        }
    }

    public void PercentDecrement(int n, double p){
        if(n == 1){
            line1 -= Percent(line1,p);
        }else if(n == 2){
            line2 -= Percent(line2,p);
        }
    }

    public void Perimeter(){
        System.out.println("Периметр = " + (Math.pow(line1,2)+Math.pow(line2,2)));
    }

    public void Area(){
        System.out.println("Площадь = " + line1*line2);
    }

    public void Diagonal(){
        System.out.println("Диагональ = " + Math.sqrt(Math.pow(line1,2)+Math.pow(line2,2)));
    }

    public double Percent(double x, double p){
        return x*p/100;
    }

    @Override
    public String toString() {
        return "Прямоугольник{" +
                "сторона1=" + line1 +
                ", сторона2=" + line2 +
                '}';
    }
}
