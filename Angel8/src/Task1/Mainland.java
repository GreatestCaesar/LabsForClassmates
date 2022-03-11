package Task1;

public class Mainland extends Planet{
    private int population; // население
    private int count; // кол-во стран
    // население
    // кол-во стран


    public Mainland(String name, double area, int population, int count) {
        super(name, area);
        this.population = population;
        this.count = count;
    }

    public Mainland() {
        super( "", 0);
        population = 0;
        count = 0;
    }

    public Mainland(int population, int count) {
        this.population = population;
        this.count = count;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Материк{" +
                "название='" + super.getName() + '\'' +
                ", площадь=" + super.getArea() +
                ", население=" + population +
                ", кол-во стран=" + count +
                '}';
    }
}
