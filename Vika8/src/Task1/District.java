package Task1;

public class District extends Town{ // район
    private int count; // количество нас. пунктов
    private String center; // название районного центра
    private double area; // площадь
    private int population; // население

    public District(String name, int population, int year, String surname, int school, double area, int count, String center, double area1, int population1) {
        super(name, population, year, surname, school, area);
        this.count = count;
        this.center = center;
        this.area = area1;
        this.population = population1;
    }

    public District(String name, int population, int year, String surname, int school, String newspaper, int count, String center, double area, int population1) {
        super();
        this.count = count;
        this.center = center;
        this.area = area;
        this.population = population1;
    }

    public District() {
        super();
        this.count = 0;
        this.center = "";
        this.area = 0;
        this.population = 0;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public int getPopulation() {
        return population;
    }

    @Override
    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public void Area(){
        System.out.println("Площадь района: " + area);
    }

    public String info(){
        return super.toString();
    }

    @Override
    public String toString() {
        return "Район{" +
                "Количество нас. пунктов=" + count +
                ", районный центр='" + center + '\'' +
                ", площадь=" + area +
                ", население=" + population +
                '}';
    }
}
