package Plant;

import Mechanic.Mechanic;

public class Plant extends Mechanic { // завод
    private String dir; // директорв
    private int empl; // кол-во сотрудников
    private double prof; // прибыль
    private int product; // кол-во выпуск-ой продукции

    public Plant(String dir, int empl, double prof, int product) {
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

    public Plant(String[] f){
        this.dir = f[0];
        this.empl = Integer.parseInt(f[1]);
        this.prof = Double.parseDouble(f[2]);
        this.product = Integer.parseInt(f[3]);
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

    public void working(Plant p){
        p.rebranding();
        p.prof();
        System.out.println(p);
    }

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
