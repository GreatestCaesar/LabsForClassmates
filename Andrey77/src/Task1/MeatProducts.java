package Task1;

public class MeatProducts {    // мясная продукция
    private String name;      // название фабрики
    private int num;          // кол-во свиней
    private int num1;         // кол-во коров
    private int num2;         // кол-во кур
    private double area;      // площадь производства
    private double vol;       // мощность производства
    private int branch;       // кол-во отделений
    private String place;     // расположение

    public MeatProducts(String name, int num, int num1, int num2, double area, double vol, int branch, String place) {
        this.name = name;
        this.num = num;
        this.num1 = num1;
        this.num2 = num2;
        this.area = area;
        this.vol = vol;
        this.branch = branch;
        this.place = place;
    }

    public MeatProducts() {
        name = "";
        num = 0;
        num1 = 0;
        num2 = 0;
        area = 0;
        vol = 0;
        branch = 0;
        place = "";
    }

    public String getName()  {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getVol() {
        return vol;
    }

    public void setVol(double vol) {
        this.vol = vol;
    }

    public int getBranch() {
        return branch;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void ani(){
        if(num > num1 && num > num2){
            System.out.println("Больше всего на фабрике свиней");
        }else{
            if(num1>num && num1>num2){
                System.out.println("Больше всего на фабрике коров");
            }else{
                System.out.println("Больше всего на фабрике кур");
            }
        }
    }

    public void pig(){
        System.out.println("На предприятии следющие породы свиней: Дюрок, Темворс, Кун-Кун");
    }

    public void pig(String ... s){
        System.out.println("Фабрика начала выращивать новые породы свиней: ");                    // перегруженный методе с изменяемым числом входных данных
        for (int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }

    public void pig(int n){                                                                     // перегруженный метод
        System.out.println("В связи с гриппом необходимо убить " + n + " свиней из " + num);
        num -= n;
    }

    public void exp(){
        System.out.println("Экспорт происходит в страные Европы и Америки");
    }

    public String lab(){
        return "На фабрике имеется ветеринарная лабаротория";
    }

    public void vol(){
        if(vol<=50){
            System.out.println("Мелкая фабрика");
        }else if(vol>50 && vol>500){
            System.out.println("Средняя фабрика");
        }else{
            System.out.println("Крупная фабрика");
        }
    }

    public String br(){
        branch -= 3;
        return "Количество отделений сократилось до " + branch;
    }

    public String cash(){
        return "Прибыль фабрики в год составила 5.700.000";
    }

    @Override
    public String toString() {
        return "Мясная продукция{" +
                "название фабрики='" + name + '\'' +
                ", кол-во свиней=" + num +
                ", кол-во коров=" + num1 +
                ", кол-во кур=" + num2 +
                ", площадь=" + area +
                ", мощность производства=" + vol +
                ", кол-во отделний=" + branch +
                ", город='" + place + '\'' +
                '}';
    }
}
