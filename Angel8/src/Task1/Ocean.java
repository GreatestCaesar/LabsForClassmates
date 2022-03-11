package Task1;

public class Ocean extends Planet{
    private double volume; // объем океана
    private double maxdepth; // макс глубина
    private double avdepth; // средняя глубина

    public Ocean(String name, double area, double volume, double maxdepth, double avdepth) {
        super(name, area);
        this.volume = volume;
        this.maxdepth = maxdepth;
        this.avdepth = avdepth;
    }

    public Ocean() {
        super("", 0);
        volume = 0;
        maxdepth = 0;
        avdepth = 0;
    }

    public Ocean(double volume, double maxdepth, double avdepth) {
        this.volume = volume;
        this.maxdepth = maxdepth;
        this.avdepth = avdepth;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getMaxdepth() {
        return maxdepth;
    }

    public void setMaxdepth(double maxdepth) {
        this.maxdepth = maxdepth;
    }

    public double getAvdepth() {
        return avdepth;
    }

    public void setAvdepth(double avdepth) {
        this.avdepth = avdepth;
    }

    @Override
    public String toString() {
        return "Океан{" +
                "название='" + super.getName() + '\'' +
                ", площадь=" + super.getArea() +
                ", объем=" + volume +
                ", макс глубина=" + maxdepth +
                ", средняя глубина=" + avdepth +
                '}';
    }
}
