package Task1;

public class Microphone {                                                                               // микрофон
    private String color;                                                                               // цвет
    private double lenhgt;                                                                              // длина кабеля
    private double diameter;                                                                            // диаметр
    private double leng;                                                                                // длина микрофона
    private String mat;                                                                                 // материал корпуса
    private double border;                                                                              // граница частотного диапазона
    private double weight;                                                                              // вес
    private double sens;                                                                                // чувствительность

    public Microphone(String color, double lenhgt, double diameter, double leng, String mat, double border, double weight, double sens) {
        this.color = color;
        this.lenhgt = lenhgt;
        this.diameter = diameter;
        this.leng = leng;
        this.mat = mat;
        this.border = border;
        this.weight = weight;
        this.sens = sens;
    }

    public Microphone() {
        color = "";
        lenhgt = 0;
        diameter = 0;
        leng = 0;
        mat = "";
        border = 0;
        weight = 0;
        sens = 0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLenhgt() {
        return lenhgt;
    }

    public void setLenhgt(double lenhgt) {
        this.lenhgt = lenhgt;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getLeng() {
        return leng;
    }

    public void setLeng(double leng) {
        this.leng = leng;
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public double getBorder() {
        return border;
    }

    public void setBorder(double border) {
        this.border = border;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSens() {
        return sens;
    }

    public void setSens(double sens) {
        this.sens = sens;
    }

    public void inclen(double k){                                                                           // увеличение кабеля
        System.out.println("Кабель увеличен до " + (lenhgt+k));
        lenhgt+=k;
    }

    public String inc(){                                                                                    // наличие регулировки громкость
        return "Микрофон оснащён регулировкой громкости";
    }

    public void decdiam(){                                                                                  // уменьшение диаметра
        System.out.println("Диаметр уменьшен на 0.01");
        diameter-=0.01;
    }

    public String mic(){
        return "Микрофон настольный";
    }

    public String game(){
        return "Микрофон для геймеров";
    }

    public void addsens(){
        System.out.println("Чувствительность увеличена на 11");
        sens += 11;
    }

    public void decborder(){
        System.out.println("Нижняя граница диапазона снижена до " + (border-101));
        border -= 101;
    }

    @Override
    public String toString() {
        return "Микрофон{" +
                "цвет='" + color + '\'' +
                ", длина кабель=" + lenhgt +
                ", диаметр=" + diameter +
                ", длина микрофона=" + leng +
                ", материал корпуса='" + mat + '\'' +
                ", нижняя граница диапазона=" + border +
                ", вес=" + weight +
                ", чувствительность=" + sens +
                '}';
    }
}
