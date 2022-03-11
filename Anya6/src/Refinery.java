public class Refinery { // завод нефтепродуктов
    private String name;
    private String city;
    private int count; // количество сотрудников
    private int countF; // количество филиалов
    private double countO; // количество перерабатываемой нефти
    private double cost; // цена за л
    private double profit; // прибыль
    private int equip; // кол-во оборудования
    private int year; // Год основания
    private int num; // кол-во акционеров

    public Refinery(String name, String city, int count, int countF, double countO, double cost, double profit, int equip, int year, int num) {
        this.name = name;
        this.city = city;
        this.count = count;
        this.countF = countF;
        this.countO = countO;
        this.cost = cost;
        this.profit = profit;
        this.equip = equip;
        this.year = year;
        this.num = num;
    }

    public Refinery() {
        name = "";
        city = "";
        count = 0;
        countF = 0;
        countO = 0;
        cost = 0;
        profit = 0;
        equip = 0;
        year = 0;
        num = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCountF() {
        return countF;
    }

    public void setCountF(int countF) {
        this.countF = countF;
    }

    public double getCountO() {
        return countO;
    }

    public void setCountO(double countO) {
        this.countO = countO;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public int getEquip() {
        return equip;
    }

    public void setEquip(int equip) {
        this.equip = equip;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void percentoil(){
        System.out.println("Количетсов продукции, которая идёт на произвоство масла: " + (countO*2/100));
    }

    public void credit(){
        if(profit()>200000){
            System.out.println("Получен кредит на сумму: 1000000");
        }else if(profit()<200000){
            System.out.println("В кредите отказано");
        }
    }

    public void county(String s){
        switch (s){
            case "Россия":{
                System.out.println("Экспорт в Россию составляет: " + (countO/2));
                break;
            }
            case "Германия":{
                System.out.println("Экспорт в Германию составляет: " + (countO*40/100));
                break;
            }
            case "США":{
                System.out.println("Экспорт в Германию составляет: " + (countO*30/100));
                break;
            }
            case "Франция":{
                System.out.println("Экспорт в Германию составляет: " + (countO*20/100));
                break;
            }
            default:{
                break;
            }
        }
    }

    public double profit(){
        return countO*cost;
    }

    public String transp(){ // транспортировка
        return "Транспортировка осуществляется наземным транспортом";
    }

    public void share() { // акционеры
        System.out.println("Количество акционеров уменьшилось: " + (num - 33));
        num -= 33;
    }

    public String branch(){ // филиалы
        return "У завода есть филиалы в Китае,Индии,Дании";
    }

    public String oil(){
        countO += 1000000;
        return "Кол-во перерабатываемой нефти увеличилось на 1000000";
    }

    @Override
    public String toString() {
        return "Завод нефтепрдуктов{" +
                "Название='" + name + '\'' +
                ", Город='" + city + '\'' +
                ", Количество сотрудников=" + count +
                ", Количество филилалов=" + countF +
                ", Количество переработанной нефти(л)=" + countO +
                ", Цена за л=" + cost +
                ", Прибыль=" + profit +
                ", Кол-во оборудования=" + equip +
                ", Год основания=" + year +
                ", Кол-во акционеров=" + num +
                '}';
    }
}
