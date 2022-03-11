package Laba;

public class MineralFertilizerPlant {
    private String name;
    private int count; // количество стран импортеров
    private String view; // вид предприятия(частное/гос)
    private String director; // директор
    private double emissions; // количество выбросов
    private int product;

    public MineralFertilizerPlant(String name, int count, String view, String director, double emissions, int product) {
        this.name = name;
        this.count = count;
        this.view = view;
        this.director = director;
        this.emissions = emissions;
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getEmissions() {
        return emissions;
    }

    public void setEmissions(double emissions) {
        this.emissions = emissions;
    }

    public int getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }

    public void eco(){
        if(emissions>440){
            System.out.println("Предприятие не экологичное и вредит природе");
        }else if(emissions<440){
            System.out.println("У предприятия нет проблем ");
        }
    }

    public void pr(){
        if(product>560000){
            System.out.println("Спрос продукции растёт");
        }else if(product<560000){
            System.out.println("Спрос продукции падает");
        }
    }

    public void nitr(){
        System.out.println("Процент азотных удобрений от общих: " + (product*20/100));
    }

    @Override
    public String toString() {
        return "Завод минеральных удобрений{" +
                "Название='" + name + '\'' +
                ", Количество стран импортеров=" + count +
                ", Вид предприятия='" + view + '\'' +
                ", Директор='" + director + '\'' +
                ", Количество выбросов(тонн)=" + emissions +
                ", Количество продукции=" + product +
                '}';
    }
}
