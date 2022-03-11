package Task2;

public class Rhombus {
    private double line;
    private double diagonal;

    public Rhombus(double line, double diagonal) {
        this.line = line;
        this.diagonal = diagonal;
    }

    public Rhombus() {
        line = 0;
        diagonal = 0;
    }

    public double getLine() {
        return line;
    }

    public void setLine(double line) {
        this.line = line;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public void percent(int n, int p){
        switch (n){
            case 1:{ // увеличение
                line += line*p/100;
                break;
            }
            case 2:{ // уменьшение
                line -= line*p/100;
                break;
            }
        }
    }

    public void perandarea(){
        System.out.println("Периметр = " + (4*line));
        System.out.println("Площадь = " + (line*height()));
    }

    public double height(){ // высота
        return (2*Math.sqrt(seper()*(seper()-line)*(seper()-line)*(seper()-diagonal)));
    }

    public double seper(){ // полупериметр
        return ((line+line+diagonal)/2);
    }

    @Override
    public String toString() {
        return "Ромб{" +
                "сторона=" + line +
                ", диагональ=" + diagonal +
                '}';
    }
}
