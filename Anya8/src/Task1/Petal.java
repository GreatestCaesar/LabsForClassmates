package Task1;

public class Petal { // лепесток
    private String color; // цвет
    private double size; // размер
    private String form; // форма
    private String state; // состояние

    public Petal(String color, double size, String form, String state) {
        this.color = color;
        this.size = size;
        this.form = form;
        this.state = state;
    }

    public Petal() {
        color = "";
        size = 0;
        form = "";
        state = "";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void blossom(boolean b){
        if(b==true){
            System.out.println("Расцвел");
            setState("Расцвел");
        }
    }

    public void wither(boolean b){
        if(b==true){
            System.out.println("Завял");
            setState("Завял");
        }
    }

    @Override
    public String toString() {
        return "Лепесток{" +
                "цвет='" + color + '\'' +
                ", размер=" + size +
                ", форма='" + form + '\'' +
                ", состояние='" + state + '\'' +
                '}';
    }
}

