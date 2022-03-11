package Task1;

public class Radio {                                     // радио
    private String range;                                // диапазон частота
    private double width;                                // ширина
    private double height;                               // высота
    public double weight;                                // вес

    public Radio(String range, double width, double height, double weight) {
        this.range = range;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public Radio() {
        range = "";
        width = 0;
        height = 0;
        weight = 0;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void screen(int n){                             // наличие экрана
        if(n == 1){
            System.out.println("Данное радио имеет экран");
        }else if(n == 2){
            System.out.println("Данное радио не оснащено экраном");
        }
    }

    public void deincwei(double n){                        // уменьшение веса
        if(n >= weight){
            System.out.println("Вес не может быть уменьшен на " + n + " так как настоящая масса " + weight);
        }else{
            System.out.println("Вес уменьшен до " + (weight-n));
            weight -= n;
        }
    }

    public String rad(){                                   // кол-во радиостанций
        return "Радио улавливает частоты 64 радиостанции";
    }

    @Override
    public String toString() {
        return "Радио{" +
                "диапазон частот=" + range +
                ", ширина=" + width +
                ", высота=" + height +
                ", вес=" + weight +
                '}';
    }
}
