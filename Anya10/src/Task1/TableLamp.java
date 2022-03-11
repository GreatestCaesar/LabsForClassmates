package Task1;

import java.util.Calendar;
import java.util.Date;

public class TableLamp extends Lamp{
    private int leng; // длина шнура
    private boolean rotation; // вращается ли

    public TableLamp(int leng, boolean rotation) {
        this.leng = leng;
        this.rotation = rotation;
    }

    public TableLamp(String name, int light, double dia, double height, int year, int leng, boolean rotation) {
        super(name, light, dia, height, year);
        this.leng = leng;
        this.rotation = rotation;
    }

    public int getLeng() {
        return leng;
    }

    public void setLeng(int leng) {
        this.leng = leng;
    }

    public boolean isRotation() {
        return rotation;
    }

    public void setRotation(boolean rotation) {
        this.rotation = rotation;
    }

    public void bright(int n){
        if(n<5){
            System.out.println("Уровень яркость установлен на " + n);
        }else{
            System.out.println("Невозможно установить такой уровень яркости");
        }
    }

    @Override
    public void on_off(int n) {
        if(n==1){
            System.out.println("Включить лампу");
        }else if(n==2){
            System.out.println("Выключить лампу");
        }
    }

    @Override
    public void warranty() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        if(calendar.get(Calendar.YEAR)-super.getYear()>1){
            System.out.println("Гарантия на лампу закончилась");
        }else{
            System.out.println("Гарантия еще актуальна");
        }
    }

    @Override
    public String toString() {
        return "TableLamp{" +
                "производитель='" + super.getName() + '\'' +
                ", размер лампочки=" + super.getLight() +
                ", диаметр плафона=" + super.getDia() +
                ", высота=" + super.getHeight() +
                ", год произдвоства=" + super.getYear() +
                ", длина шнура=" + leng +
                ", вращается=" + rotation +
                '}';
    }
}
