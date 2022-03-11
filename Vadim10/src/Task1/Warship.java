package Task1;

public abstract class Warship implements Ship{
    private String name; // название
    private int crew; // кол-во экипаж
    private int deck; // кол-во палуб
    private String engine; // двигатель
    private String guns;; // орудия

    public Warship(String name, int crew, int deck, String engine, String guns) {
        this.name = name;
        this.crew = crew;
        this.deck = deck;
        this.engine = engine;
        this.guns = guns;
    }

    public Warship() {
        name = "";
        crew = 0;
        deck = 0;
        engine = "";
        guns = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCrew() {
        return crew;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }

    public int getDeck() {
        return deck;
    }

    public void setDeck(int deck) {
        this.deck = deck;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getGuns() {
        return guns;
    }

    public void setGuns(String guns) {
        this.guns = guns;
    }

    public void gun(boolean l){
        if(l==true){
            System.out.println("Орудия приведены в боевую готовность");
        }else{
            System.out.println("Орудия в штатном режиме");
        }
    }

    @Override
    public void clean(int n) { // день месяца
        if(n==22){
            System.out.println("На корабле проводится общеплановая уборка");
        }
    }

    @Override
    public String toString() {
        return "Военный корабль{" +
                "название='" + name + '\'' +
                ", экипаж=" + crew +
                ", кол-во палуб=" + deck +
                ", двигатель='" + engine + '\'' +
                ", орудия='" + guns + '\'' +
                '}';
    }

    abstract void service();
}
