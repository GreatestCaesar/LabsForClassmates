package Cattle;

public class Cattle implements Check.Check{ // скот
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

    public void update(int x){
        System.out.println("Кол-во голов увеличено на " + x);
        setNum(getNum()+x);
    }

    public void red(int n){
        System.out.println("В связи с гриппом, необходимо сократить число скота на" + n);
        setNum(getNum()-n);
    }

    @Override
    public String check(boolean l) {
        String s;
        if(l==true){
            s = "На скотный двор предвидится проверка";
        }else{
            s = "Скотный двор не нуждается в проверка";
        }
        return s;
    }

    @Override
    public String toString() {
        return "Скот{" +
                "кол-во голов=" + num +
                ", средняя прод-ть жизни=" + year +
                '}';
    }
}
