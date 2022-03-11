package Task1;

public class Island extends Planet{
    private boolean population; // населен или нет
    private int popula; // население

    public Island(String name, double area, boolean population, int popula) {
        super(name, area);
        this.population = population;
        this.popula = popula;
    }

    public Island(String name, double area, boolean population) {
        super(name, area);
        this.population = population;
        this.popula = 0;
    }

    public Island() {
        super("", 0);
        this.population = false;
        this.popula = 0;
    }

    public Island(boolean population, int popula) {
        this.population = population;
        this.popula = popula;
    }

    public boolean isPopulation() {
        return population;
    }

    public void setPopulation(boolean population) {
        this.population = population;
    }

    public int getPopula() {
        return popula;
    }

    public void setPopula(int popula) {
        this.popula = popula;
    }

    @Override
    public String toString() {
        return "Остров{" +
                "название='" + super.getName() + '\'' +
                ", площадь=" + super.getArea() +
                ", населен=" + population +
                ", население=" + popula +
                '}';
    }
}
