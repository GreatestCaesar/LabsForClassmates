package Task;

public class Mechanic extends Car{ // механик
    private String name; // имя
    private int year; // возраст
    private String educ; // образование
    private double salary; // ЗП

    public Mechanic(String mark, String body, int year, double volume, String name, int year1, String educ, double salary) {
        super(mark, body, year, volume);
        this.name = name;
        this.year = year1;
        this.educ = educ;
        this.salary = salary;
    }

    public Mechanic() {
        super();
        name = "";
        year = 0;
        educ = "";
        salary = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

    public String getEduc() {
        return educ;
    }

    public void setEduc(String educ) {
        this.educ = educ;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void rebranding(){
        System.out.println("Механик отправляетсян на повышение квалификации");
    }

    public void sal(double n){
        System.out.println("Увеличили ЗП на " + n);
        salary += n;
    }

    @Override
    public String toString() {
        return "Механик{" +
                "имя='" + name + '\'' +
                ", возраст=" + year +
                ", образование='" + educ + '\'' +
                ", ЗП=" + salary +
                '}';
    }
}
