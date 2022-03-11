package Task1;

public class Region extends District{ // область
    private String name; // название обл. центра
    private int density; // плотность населения
    private int counttown; // количество крупных городов
    private String governor; // губернатор
    private int population; // население

    public Region(String name, int population, int year, String surname, int school, double area, int count, String center, double area1, int population1, String name1, int density, int counttown, String governor, int population2) {
        super(name, population, year, surname, school, area, count, center, area1, population1);
        this.name = name1;
        this.density = density;
        this.counttown = counttown;
        this.governor = governor;
        this.population = population2;
    }

    public Region() {
        super();
        this.name = "";
        this.density = 0;
        this.counttown = 0;
        this.governor = "";
        this.population = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getDensity() {
        return density;
    }

    public void setDensity(int density) {
        this.density = density;
    }

    public int getCounttown() {
        return counttown;
    }

    public void setCounttown(int counttown) {
        this.counttown = counttown;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        this.governor = governor;
    }

    @Override
    public int getPopulation() {
        return population;
    }

    @Override
    public void setPopulation(int population) {
        this.population = population;
    }

    public String info(){
        System.out.println(super.info());
        return super.toString();
    }

    @Override
    public String toString() {
        return "Область{" +
                "название='" + name + '\'' +
                ", плотность=" + density +
                ", количество городов=" + counttown +
                ", губернатор='" + governor + '\'' +
                ", население=" + population +
                '}';
    }
}
