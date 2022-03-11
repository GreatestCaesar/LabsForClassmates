package Task1;

public class Aerocarrier extends Warship{
    private int aircraft; // кол-во самолётов
    private String type; // тип самолётов(истребитель, бомбандир)

    public Aerocarrier(String name, int crew, int deck, String engine, String guns, int aircraft, String type) {
        super(name, crew, deck, engine, guns);
        this.aircraft = aircraft;
        this.type = type;
    }

    public Aerocarrier() {
        super("",0,0,"","");
        aircraft = 0;
        type = "";
    }

    public Aerocarrier(int aircraft, String type) {
        this.aircraft = aircraft;
        this.type = type;
    }

    public int getAircraft() {
        return aircraft;
    }

    public void setAircraft(int aircraft) {
        this.aircraft = aircraft;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void clean(int n) {
        super.clean(n);
    }

    @Override
    public void gun(boolean l) {
        super.gun(l);
    }

    @Override
    void service() {
        System.out.println("За последний месяц обслужено 23 самолёта из которых 12 истребителей, 2 бомбардировщка, 6 грузовых, 3 пассажирских");
    }

    @Override
    public String toString() {
        return "Авианосек{" +
                "название='" + getName() + '\'' +
                ", экипаж=" + getCrew() +
                ", кол-во палуб=" + getDeck() +
                ", двигатель='" + getEngine() + '\'' +
                ", орудия='" + getGuns() + '\'' +
                ", кол-во самолётов=" + aircraft +
                ", типы самолётов='" + type + '\'' +
                '}';
    }
}
