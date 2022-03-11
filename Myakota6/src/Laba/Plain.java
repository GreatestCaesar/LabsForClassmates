package Laba;

public class Plain {
    private String name;
    private double length;
    private double sweep;
    private int place;
    private int QE;
    private String company;
    private String model;
    private int year;// название, длина, размах крыльев, число мест, кол-во двигателей, компания, модель, год производства

    public Plain(){
        name = "";
        length = 0;
        sweep = 0;
        place = 0;
        QE = 0;
        company = "";
        model = "";
        year = 0;
    }

    public Plain(String name, double length, double sweep, int place, int QE, String company, String model, int year) {
        this.name = name;
        this.length = length;
        this.sweep = sweep;
        this.place = place;
        this.QE = QE;
        this.company = company;
        this.model = model;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getSweep() {
        return sweep;
    }

    public void setSweep(double sweep) {
        this.sweep = sweep;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public void Country(String c){
        System.out.println("Самолёт: " + name + " направляется в " + c);
    }

    public String BlackBox(){
        return "В данном самолёте 1 черный ящик";
    }

    public String Time(){
        return "Самолёт пролете 2500 часов";
    }

    public void QuantityCrew(){
        System.out.println("Самолёт обслуживает 2 пилота и 4 стюардессы");
    }

    @Override
    public String toString() {
        return "Самолёт{" +
                "название='" + name + '\'' +
                ", длина=" + length +
                ", размах крыльев=" + sweep +
                ", число мест=" + place +
                ", количество двигателей=" + QE +
                ", компания='" + company + '\'' +
                ", модель='" + model + '\'' +
                ", год производства=" + year +
                '}';
    }

    public void Height(){
        System.out.println("Самолёт " + name + " может достигать высоты в 15000км");
    }

    public String Fuel(){
        return "Объем бака составляет: 171170 литров";
    }

    public String Auto(int x){
        String s;
        if(x == 1){
            s = "Самолёт переведен в режим автопилота";
        }else if(x == 0){
            s = "Самолёт перевведен в ручной режим";
        }else{
            s = "Ошибка системы";
        }
        return s;
    }
}
