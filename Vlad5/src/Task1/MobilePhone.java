package Task1;

public class MobilePhone { // мобильный телефон
    private String type; // тип экрана
    private double gage; // толщина
    private double diagonal; // диагональ
    private int acum; // аккумулятор

    public MobilePhone(String type, double gage, double diagonal, int acum) {
        this.type = type;
        this.gage = gage;
        this.diagonal = diagonal;
        this.acum = acum;
    }

    public MobilePhone() {
        type = "";
        gage = 0;
        diagonal = 0;
        acum = 0;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getGage() {
        return gage;
    }

    public void setGage(double gage) {
        this.gage = gage;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public int getAcum() {
        return acum;
    }

    public void setAcum(int acum) {
        this.acum = acum;
    }

    public void addacum(){ // увеличить мощность аккум
        System.out.println("Мощность увеличена на 100мАч");
        acum += 100;
    }

    public void newp(String s){ // новый/старый
        if(s.equals("Сенсорный")){
            System.out.println("Данная модель нового поколения");
        }else{
            System.out.println("Данная модель старая");
        }
    }

    public void remgage(){ // уменьшение тощины
        System.out.println("Толщина уменьшена на 0.01мм");
        gage -= 0.01;
    }

    @Override
    public String toString() {
        return "Мобильный телефон{" +
                "тип экрана='" + type + '\'' +
                ", толщина=" + gage +
                ", диагональ=" + diagonal +
                ", аккумулятор=" + acum +
                '}';
    }
}
