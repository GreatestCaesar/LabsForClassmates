package Task;

public class Refinery { // нефтеперерабатывающий завод
    private String name; // название
    private int year; // год создания
    private double cash; // прибыль

    public Refinery() {
        name = "";
        year = 0;
        cash = 0;
    }

    public Refinery(String name, int year, double cash) {
        this.name = name;
        this.year = year;
        this.cash = cash;
    }

    public Refinery(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public void accident(boolean k){ // авария
        if(k == true){
            System.out.println("Танкер перевозивший нефть и нефтепродукты утонул в чёрном море, произошла экологическая катастрофа");
        }else{
            System.out.println("Танкер доставил нефть без происшесвтий");
        }
    }

    public void bankrupt(double n){
        if(n<130){
            System.out.println("Цена за нефть упала. Завод закрывается из за убытков переработки нефти");
        }else {
            System.out.println("Стоимость нефти в норме. Завод продолжает функционировать");
        }
    }

    @Override
    public String toString() {
        return "НПЗ{" +
                "название='" + name + '\'' +
                ", год создания=" + year +
                ", прибыль=" + cash +
                '}';
    }
}
