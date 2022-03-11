package Task;

public class Car { // авто
    private String mark; // марка
    private String body; // тип кузова
    private int year; // год выпуска
    private double volume; // объем

    public Car(String mark, String body, int year, double volume) {
        this.mark = mark;
        this.body = body;
        this.year = year;
        this.volume = volume;
    }

    public Car() {
        mark = "";
        body = "";
        year = 0;
        volume = 0;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void rebranding(){
        System.out.println("Увеличение мощности авто на 20 л.с.");
        volume += 20;
    }

    public String cooper(){
        return "Данная марка авто сотрудничает с производителем шин Michelin";
    }

    @Override
    public String toString() {
        return "Автомобиль{" +
                "марка='" + mark + '\'' +
                ", тип кузова='" + body + '\'' +
                ", год выпуска=" + year +
                ", мощность=" + volume +
                '}';
    }
}
