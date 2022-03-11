package Task1;

public class MilkProducts { // молочная продукция
    private String name;     // название предприятия
    private String director; // фамилия директора
    private int num;         // кол-во акционеров
    private int count;       // кол-во выпускаемой продукции

    public MilkProducts() {
        name = "";
        director = "";
        num = 0;
        count = 0;
    }

    public MilkProducts(String name, String director, int num, int count) {
        this.name = name;
        this.director = director;
        this.num = num;
        this.count = count;
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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void prod(){
        System.out.println("Продукция предприятия представлена под марками: \nСлавянские традиции\nВенский завтрак\nАристей");
    }

    public void acc(){
        System.out.println("Количество акционеров уменьшилось на 2");
        num-=2;
    }

    public void addprod(){
        System.out.println("Предприятие стало выпускать на 10000(ед) продукции больше");
        count+=10000;
    }

    @Override
    public String toString() {
        return "Молочная продкукция{" +
                "название предприятия='" + name + '\'' +
                ", директор='" + director + '\'' +
                ", кол-во акционеров=" + num +
                ", кол-во выпускаемой продукции=" + count +
                '}';
    }
}
