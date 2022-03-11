package Task;

public class Cattle { // скот
    private int num; // кол-во голов
    private double year; // средняя продолжительность жизни

    public Cattle() {
        num = 0;
        year = 0;
    }

    public Cattle(int num, double year) {
        this.num = num;
        this.year = year;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getYear() {
        return year;
    }

    public void setYear(double year) {
        this.year = year;
    }

    public void update(){
        System.out.println("Кол-во голов увеличено на 50");
        num+=50;
    }

    public void red(){
        System.out.println("В связи с гриппом, необходимо сократить число скота до 45");
        setNum(45);
    }

    @Override
    public String toString() {
        return "Скот{" +
                "кол-во голов=" + num +
                ", средняя прод-ть жизни=" + year +
                '}';
    }
}
