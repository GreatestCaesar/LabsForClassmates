package Plant;

import Mechanic.Mechanic;

public class Plant extends Thread { // завод
    private String dir; // директорв
    private int empl; // кол-во сотрудников
    private double prof; // прибыль
    private int product; // кол-во выпуск-ой продукции
    Plant p;

    public Plant(String dir, int empl, double prof, int product) {
        this.dir = dir;
        this.empl = empl;
        this.prof = prof;
        this.product = product;
    }

    public Plant() {
        dir = "";
        empl = 0;
        prof = 0;
        product = 0;
    }

    public Plant(Plant p){
        super("Поток3");
        this.p = p;
        start();
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

    public void run(){
        System.out.println(p);
        p.rebranding();
        p.prof();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
