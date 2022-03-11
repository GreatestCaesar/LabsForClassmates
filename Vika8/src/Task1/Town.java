package Task1;

public class Town { // город
    private String name; // название
    private int population; // население
    private int year; // год основания
    private String surname; // фамилия мэра
    private int school; // количество школ
    private double area; // площадь

    public Town(String name, int population, int year, String surname, int school, double area) {
        this.name = name;
        this.population = population;
        this.year = year;
        this.surname = surname;
        this.school = school;
        this.area = area;
    }

    public Town() {
        this.name = "";
        this.population = 0;
        this.year = 0;
        this.surname = "";
        this.school = 0;
        this.area = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSchool() {
        return school;
    }

    public void setSchool(int school) {
        this.school = school;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void Area(){
        System.out.println("Площадь города: " + area);
    }

    @Override
    public String toString() {
        return "Город{" +
                "название='" + name + '\'' +
                ", население=" + population +
                ", год основания=" + year +
                ", фамилия мэра='" + surname + '\'' +
                ", количество школ=" + school +
                ", площадь='" + area + '\'' +
                '}';
    }
}
