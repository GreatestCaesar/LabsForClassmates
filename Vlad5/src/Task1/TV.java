package Task1;

public class TV { // телевизор
    private String mark; // бренд телевизора
    private String model; // модель телевизора
    private int year; // год выпуска
    private double diagonal; // диагональ экрана

    public TV(String mark, String model, int year, double diagonal) {
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.diagonal = diagonal;
    }

    public TV() {
        mark = "";
        model = "";
        year = 0;
        diagonal = 0;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public void newtv(){ // старый/новый
        if (year<2010){
            System.out.println("Телевизор старый");
        }else{
            System.out.println("Телевизор новый");
        }
    }

    public void adddiiagonal(){ // увеличение диагонали
        System.out.println("Диагональл увеличена на 0.5");
        diagonal += 0.5;
    }

    public void prod(int n){ // производится ли данный телевизор
        switch (n){
            case 1:{
                System.out.println("Данный телевизор больше не выпускается!");
                break;
            }
            case 2:{
                System.out.println("Данный телевизор ещё стоит на производстве");
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Телевизор{" +
                "название='" + mark + '\'' +
                ", модель='" + model + '\'' +
                ", год=" + year +
                ", диагональ=" + diagonal +
                '}';
    }
}
