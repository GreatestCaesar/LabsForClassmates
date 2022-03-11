public class TireFactory { // завод шин
    private String name;
    private String director; // имя директора
    private String country; // страна
    private int count; // количество продукции
    private double cost; // цена за шт
    private String finance; // финансовое положение(хорошее среднее банкрот)
    private String organiz; // организационная форма
    private double aver; // средняя ЗП
    private double area; // площадь завода

    public TireFactory(String name, String director, String country, int count, double cost, String finance, String organiz, double aver, double area) {
        this.name = name;
        this.director = director;
        this.country = country;
        this.count = count;
        this.cost = cost;
        this.finance = finance;
        this.organiz = organiz;
        this.aver = aver;
        this.area = area;
    }

    public TireFactory() {
        name = "";
        director = "";
        country = "";
        count = 0;
        cost = 0;
        finance = "";
        organiz = "";
        aver = 0;
        area = 0 ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getFinance() {
        return finance;
    }

    public void setFinance(String finance) {
        this.finance = finance;
    }

    public String getOrganiz() {
        return organiz;
    }

    public void setOrganiz(String organiz) {
        this.organiz = organiz;
    }

    public double getAver() {
        return aver;
    }

    public void setAver(double aver) {
        this.aver = aver;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void shares(){ // акции
        if(profit()>1000000){
            System.out.println("Акции завода растут");
        }else{
            System.out.println("Акции завода падают");
        }
    }

    public double profit(){ // прибыль
        return count*cost;
    }

    public void immport(){ // импорт
        System.out.println("На импорт идёт 50% продукции: " + (count/2));
    }

    public String prod(){
        return "Завод производит 3% продукции, от общемирового производства данной продукции";
    }

    public void comp(){ // комнкурентоспособность
        switch (finance){
            case "Хорошее":{
                System.out.println("Высокая конкуренция");
                break;
            }
            case "Среднее":{
                System.out.println("Средняя конкуренция");
                break;
            }
            case "Банкрот":{
                System.out.println("У завода большие проблемы");
                break;
            }
        }
    }

    public void cond(){ // условия труда
        System.out.println("Увеличение ЗП на 15% " + (aver+(aver*15/100)));
        aver += (aver*15/100);
    }

    public String coop(){ // сотрудничество
        return "Завод сотрудничает с Шкодой,Опелем,Тайотой";
    }

    @Override
    public String toString() {
        return "Завод Шин{" +
                "Название='" + name + '\'' +
                ", Директор='" + director + '\'' +
                ", Страна='" + country + '\'' +
                ", Количество произдведенной продукции=" + count +
                ", Цена за шт=" + cost +
                ", Финансовое положение='" + finance + '\'' +
                ", Организационная форма='" + organiz + '\'' +
                ", Средняя ЗП=" + aver +
                ", Площадь завода=" + area +
                '}';
    }
}
