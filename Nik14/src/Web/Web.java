package Web;

import java.util.Calendar;
import java.util.Date;

public class Web {
    private String name; // название
    private int year; // год создания
    private String comp; // компания разработчик

    public Web() {
        name = "";
        year = 0;
        comp = "";
    }

    public Web(String name, int year, String comp) {
        this.name = name;
        this.year = year;
        this.comp = comp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getComp() {
        return comp;
    }

    public void setComp(String comp) {
        this.comp = comp;
    }

    public void update(){
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        System.out.println();
        if(calendar.get(Calendar.YEAR)-year>1){
            System.out.println("Последнее обновление выходило год назад, необходимо обновление");
        }else{
            System.out.println("Обновление не требуется");
        }
    }

    @Override
    public String toString() {
        return "Веб технология{" +
                "название='" + name + '\'' +
                ", год создания=" + year +
                ", компания разработчик='" + comp + '\'' +
                '}';
    }
}
