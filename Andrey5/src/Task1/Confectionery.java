package Task1;

public class Confectionery {      // кондитерские изделия
    private String name;      // название фабрики
    private int year;          // год основания
    private int num;            // число сотрудников
    private String place;       // город

    public Confectionery(String name, int year, int num, String place) {
        this.name = name;
        this.year = year;
        this.num = num;
        this.place = place;
    }

    public Confectionery() {
        name = "";
        year = 0;
        num = 0;
        place = "";
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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void prod(){
        System.out.println("Продукция фабрики состоит из: шоколада, конфет, карамели, ириса и т.д.");
    }

    public void fil(){
        System.out.println("У фабрики есть филиалы в Украине, Польше, Германии");
    }

    public void addemp(int n){
        System.out.println("Число выпускаемой продукции увеличено до " + (n+num));
        num+=n;
    }

    @Override
    public String toString() {
        return "Кондитерские изделия{" +
                "название='" + name + '\'' +
                ", год=" + year +
                ", кол-во выпускаемой продукции=" + num +
                ", город='" + place + '\'' +
                '}';
    }
}
