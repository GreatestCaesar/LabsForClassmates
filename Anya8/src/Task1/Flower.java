package Task1;

public class Flower extends Bud{ // цветок
    private String name; // название
    private double height; // высота
    private int num; // кол-во бутонов

    public Flower(String color, double size, String form, int num, boolean stamen, String name, double height, int num1, String state) {
        super(color, size, form, num, stamen, state);
        this.name = name;
        this.height = height;
        this.num = num1;
    }

    public Flower() {
        name = "";
        height = 0;
        num = 0;
    }

    public Flower(String name, double height, int num) {
        this.name = name;
        this.height = height;
        this.num = num;
    }

    public Flower(int num, boolean stamen, String name, double height, int num1) {
        super(num, stamen);
        this.name = name;
        this.height = height;
        this.num = num1;
    }

    @Override
    public void blossom(boolean b) {
        super.blossom(b);
    }

    @Override
    public void wither(boolean b) {
        super.wither(b);
    }

    @Override
    public String toString() {
        return "Цветок{" +
                "название='" + name + '\'' +
                ", высота=" + height +
                ", кол-во бутонов=" + num +
                '}';
    }
}
