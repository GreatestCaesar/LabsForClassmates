package Task1;

public class Confectionery {      // кондитерские изделия
    private String name;      // название фабрики
    private int year;          // год основания
    private int num;            // число сотрудников
    private String place;       // город
    private double area;        // плозадь фабрики
    private int cookie;         // кол-во производимого печенья в день
    private int candy;          // кол-во производимых конфет в день
    private int wafers;         // кол-во производимых вафель в день

    public Confectionery(String name, int year, int num, String place, double area, int cookie, int candy, int wafers) {
        this.name = name;
        this.year = year;
        this.num = num;
        this.place = place;
        this.area = area;
        this.cookie = cookie;
        this.candy = candy;
        this.wafers = wafers;
    }

    public Confectionery() {
        name = "";
        year = 0;
        num = 0;
        place = "";
        area = 0;
        cookie = 0;
        candy = 0;
        wafers = 0;
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

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getCookie() {
        return cookie;
    }

    public void setCookie(int cookie) {
        this.cookie = cookie;
    }

    public int getCandy() {
        return candy;
    }

    public void setCandy(int candy) {
        this.candy = candy;
    }

    public int getWafers() {
        return wafers;
    }

    public void setWafers(int wafers) {
        this.wafers = wafers;
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

    public String ar(double t){
        area += t;
        return "Фабрика расширилась до " + area;
    }

    public String shop(){
        return "У фабрики имеется 3 фирменных магазина";
    }

    public String demand(){
        return "Наибольший спрос из всей продукции у вафель";
    }

    public void mark(){
        System.out.println("Печенье производится под маркой:\n" +
                "        День и ночь\n" +
                "       Звёзды\n" +
                "       Эстель");
    }

    @Override
    public String toString() {
        return "Кондитерские изделия{" +
                "название='" + name + '\'' +
                ", год=" + year +
                ", кол-во выпускаемой продукции=" + num +
                ", город='" + place + '\'' +
                ", площадь фабрики=" + area +
                ", кол-во производимого печенья=" + cookie +
                ", кол-во производимых конфет=" + candy +
                ", кол-во производимых вафель=" + wafers +
                '}';
    }
}
