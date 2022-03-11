package Task1;

public class СruiseShip{ // круизный лайнер
    private String captain; // капитан корабля
    private double length; // длина
    private double width; // ширина
    private double carrying; // вместительность
    private int way; // весь путь

    public СruiseShip(String captain, double length, double width, double carrying, int way) {
        this.captain = captain;
        this.length = length;
        this.width = width;
        this.carrying = carrying;
        this.way = way;
    }

    public СruiseShip() {
        captain = "";
        length = 0;
        width = 0;
        carrying = 0;
        way = 0;
    }

    public String getCaptain() {
        return captain;
    }

    public void setCaptain(String captain) {
        this.captain = captain;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getCarrying() {
        return carrying;
    }

    public void setCarrying(double carrying) {
        this.carrying = carrying;
    }

    public void w(int k){ // путь который прошел
        System.out.println("Путь который прошел: " + k
        + ". Процент до конца пути: " + (way-k)*100/way);
    }

    public void clean( double r,double z, double c){ // очистка
        System.out.println("Нарост ракушек: " + z + ", водорослей: " + z + ", соли: " + c);
        if((r+z+c)<7){
            System.out.println("Очистка не требуется");
        }else{
            System.out.println("Необходимо произвести очистку");
        }
    }

    public void sos(int n){ // вызов помощи
        if(n>4){
            System.out.println("К кораблю отправлена помощь");
        }else{
            System.out.println("Связь с кораблем в порядке");
        }
    }

    @Override
    public String toString() {
        return "Круизный лайнер{" +
                "Капитан='" + captain + '\'' +
                ", длина=" + length +
                ", ширина=" + width +
                ", вместительность=" + carrying +
                ", путь=" + way +
                '}';
    }
}
