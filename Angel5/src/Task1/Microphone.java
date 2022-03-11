package Task1;

public class Microphone {                                                                               // микрофон
    private String color;                                                                               // цвет
    private double lenhgt;                                                                              // длина кабеля
    private double diameter;                                                                            // диаметр
    private double leng;                                                                                // длина микрофона

    public Microphone(String color, double lenhgt, double diameter, double leng) {
        this.color = color;
        this.lenhgt = lenhgt;
        this.diameter = diameter;
        this.leng = leng;
    }

    public Microphone() {
        color = "";
        lenhgt = 0;
        diameter = 0;
        leng = 0;
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

    @Override
    public String toString() {
        return "Микрофон{" +
                "цвет='" + color + '\'' +
                ", длина кабель=" + lenhgt +
                ", диаметр=" + diameter +
                ", длина микрофона=" + leng +
                '}';
    }
}
