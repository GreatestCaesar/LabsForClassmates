package Computer;

import Program.Program;

public class Computer extends Program{
    private String CPU; // процессор
    private String card; // видеокарта

    public Computer(double volume, String CPU, String card) {
        super(volume);
        this.CPU = CPU;
        this.card = card;
    }

    public Computer(String name, double volume, String name1, String CPU, String card) {
        super(name, volume, name1);
        this.CPU = CPU;
        this.card = card;
    }

    public Computer() {
        super(0);
        CPU = "";
        card = "";
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    @Override
    public String volume(int n) {
        String s;
        if(n>super.getVolume()){
            s = "Память компьютера переполнена необходимо перезагрузить";
        }else{
            s = "Память в порядке";
        }
        return s;
    }

    @Override
    public void glitch(boolean a) {
        if(a == true){
            System.out.println("Процессор перегружен. Экстренное выключение. Данные не сохранены");
        }else{
            System.out.println("Компьютер работает без сбоев");
        }
    }

    @Override
    public String toString() {
        return "Компьютер{" +
                "объем памяти=" + super.getVolume() +
                ", процессор='" + CPU + '\'' +
                ", видеокарта='" + card + '\'' +
                '}';
    }
}
