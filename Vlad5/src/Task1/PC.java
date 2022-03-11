package Task1;

public class PC { // персональный компьютер
    private String name; // название
    private int year; // год производства
    private double vol; // мощность процессора
    private int RAM; // оперативная память

    public PC(String name, int year, double vol, int RAM) {
        this.name = name;
        this.year = year;
        this.vol = vol;
        this.RAM = RAM;
    }

    public PC() {
        name = "";
        year = 0;
        vol = 0;
        RAM = 0;
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

    public double getVol() {
        return vol;
    }

    public void setVol(double vol) {
        this.vol = vol;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }


    public void addvol(){ // увеличение мощности процессора
        System.out.println("Мощность процессора увеличена");
        vol += 0.03;
    }

    public void addram(int n){ // увеличение оперативной памяти
        System.out.println("Оперативная память увеличена на " + n);
        RAM += n;
    }

    public String type(){ // игровой
        return "Данный ПК является игровым";
    }

    @Override
    public String toString() {
        return "Персональный компьютер{" +
                "Название='" + name + '\'' +
                ", год производства=" + year +
                ", мощность процессора=" + vol +
                ", оперативная память =" + RAM +
                '}';
    }
}
