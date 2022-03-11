package Task1;

public class SearchSystem { // поисковая система
    private String name; // название
    private int query; // кол-во запросов
    private int mans; // кол-во людей тех поддеркжи
    private double cost; // стоимость системы
    private double accu; // точно поиска
    private String lang; // язык разработки
    private int users; // кол-во пользователей
    private int speed; // скорость поиска

    public SearchSystem(String name, int query, int mans, double cost, double accu, String lang, int users, int speed) {
        this.name = name;
        this.query = query;
        this.mans = mans;
        this.cost = cost;
        this.accu = accu;
        this.lang = lang;
        this.users = users;
        this.speed = speed;
    }

    public SearchSystem() {
        name = "";
        query = 0;
        mans = 0;
        cost = 0;
        accu = 0;
        lang = "";
        users = 0;
        speed = 0;
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

    public double getAccu() {
        return accu;
    }

    public void setAccu(double accu) {
        this.accu = accu;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public int getUsers() {
        return users;
    }

    public void setUsers(int users) {
        this.users = users;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
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

    public String help(){
        return "У данной системы имеется поисковой помощник \"Джессика\"";
    }

    public String comp(){
        return "В состав поисковой системы входят базы данных, модуль индексирования, поисковый сервер";
    }

    public String find(){
        query += 1234004;
        return "Кол-во поисков увеличено до " + query;
    }

    @Override
    public String toString() {
        return "Поисковая система{" +
                "название='" + name + '\'' +
                ", кол-во запросов=" + query +
                ", сотрудников тех. поддержки=" + mans +
                ", стоимость=" + cost +
                ", accu=" + accu +
                ", lang='" + lang + '\'' +
                ", users=" + users +
                ", speed=" + speed +
                '}';
    }
}
