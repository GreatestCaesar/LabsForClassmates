package Task;

public class Turntable { // винил
    private String name; // название
    private double width; // ширина
    private String color; // цвет
    private double time; // часы воспроизведения

    public Turntable() {
        name = "";
        width = 0;
        color = "";
        time = 0;
    }

    public Turntable(String name, double width, String color, double time) {
        this.name = name;
        this.width = width;
        this.color = color;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String speak(){ // колонки
        return "Винил имеет возможность подключения колонок";
    }

    public void speed(int n){
        switch (n){
            case 1:{
                System.out.println("Выбрано 33 об/мин");
                break;
            }
            case 2:{
                System.out.println("Выбрано 58 об/мин");
                break;
            }
            case 3:{
                System.out.println("Выбрано 77 об/мин");
                break;
            }
        }
    }

    public void spine(){
        if(time>100){
            System.out.println("Время использования винила превысило 100 часов, необходимо заменить иглу");
        }
    }

    public String mode(){
        String[] mode = {"Автомат","Автостоп","Ручное управление"};
        return "Выбран режим проигрывания: " + mode[((int)(Math.random() * (mode.length+1)) + 0)];
    }

    @Override
    public String toString() {
        return "Винил{" +
                "название='" + name + '\'' +
                ", ширина=" + width +
                ", цвет='" + color + '\'' +
                ", часы воспроизведения=" + time +
                '}';
    }
}
