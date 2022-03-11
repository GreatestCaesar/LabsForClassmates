package Task1;

public class SearchSystem { // поисковая система
    private String name; // название
    private int query; // кол-во запросов
    private int mans; // кол-во людей тех поддеркжи
    private double cost; // стоимость системы

    public SearchSystem(String name, int query, int mans, double cost) {
        this.name = name;
        this.query = query;
        this.mans = mans;
        this.cost = cost;
    }

    public SearchSystem() {
        name = "";
        query = 0;
        mans = 0;
        cost = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuery() {
        return query;
    }

    public void setQuery(int query) {
        this.query = query;
    }

    public int getMans() {
        return mans;
    }

    public void setMans(int mans) {
        this.mans = mans;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void pop(){
        System.out.println("Поисковая система наибоее популярная в Америке, Англии, Канаде");
    }

    public void renew(){
        System.out.println("У системы было 53 обновление");
    }

    public void qu(int n){
        System.out.println("Количество запросов увеличилось на " + n);
        query += n;
    }

    @Override
    public String toString() {
        return "Поисковая система{" +
                "название='" + name + '\'' +
                ", кол-во запросов=" + query +
                ", сотрудников тех. поддержки=" + mans +
                ", стоимость=" + cost +
                '}';
    }
}
