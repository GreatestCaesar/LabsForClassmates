package Task1;

public class Bud extends Petal{ // бутон
    private int num; // кол-во лепестков
    private boolean stamen; // наличие тычинок

    public Bud(String color, double size, String form, int num, boolean stamen, String state) {
        super(color, size, form, state);
        this.num = num;
        this.stamen = stamen;
    }

    public Bud() {
        num = 0;
        stamen = true;
    }

    public Bud(int num, boolean stamen) {
        this.num = num;
        this.stamen = stamen;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isStamen() {
        return stamen;
    }

    public void setStamen(boolean stamen) {
        this.stamen = stamen;
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
        return "Бутон{" +
                "цвет='" + getColor() + '\'' +
                ", размер=" + getSize() +
                ", форма='" + getForm() + '\'' +
                ", состояние='" + getState() + '\'' +
                ", кол-во лепестков=" + num +
                ", наличие тычинок=" + stamen +
                '}';
    }
}
