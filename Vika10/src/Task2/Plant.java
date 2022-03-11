package Task2;

public class Plant extends Mechanic{ // завод
    private String dir; // директорв
    private int empl; // кол-во сотрудников
    private double prof; // прибыль
    private int product; // кол-во выпуск-ой продукции

    public Plant(String mark, String body, int year, double volume, String name, int year1, String educ, double salary, String dir, int empl, double prof, int product) {
        super(mark, body, year, volume, name, year1, educ, salary);
        this.dir = dir;
        this.empl = empl;
        this.prof = prof;
        this.product = product;
    }

    public Plant() {
        super();
        dir = "";
        empl = 0;
        prof = 0;
        product = 0;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public int getEmpl() {
        return empl;
    }

    public void setEmpl(int empl) {
        this.empl = empl;
    }

    public double getProf() {
        return prof;
    }

    public void setProf(double prof) {
        this.prof = prof;
    }

    public int getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }

    @Override
    public void rebranding() {
        System.out.println("Увеличение выпускаемой продукции с " + product + " на " + (product+=350));
    }

    public void prof(){
        System.out.println("Завод увеличил прибыль на 760.000$ по сравнению с предыдущим годом");
    }

    @Override
    public String toString() {
        return "Завод{" +
                "директор='" + dir + '\'' +
                ", кол-во работников=" + empl +
                ", прибыль=" + prof +
                ", кол-во выпускаемой продукции=" + product +
                '}';
    }
}
