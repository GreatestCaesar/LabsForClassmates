package Task1;

public class MineralFertilizerPlant { // минеральные удобрения
    private String name;
    private int count; // количество стран импортеров
    private String view; // вид предприятия(частное/гос)
    private String director; // директор
    private double emissions; // количество выбросов
    private int product; // кол-во продукции
    private int shift; // кол-во рабочих смен
    private String organiz; // организационная структура
    private double numK; // кол-во производства калия
    private double salt; // кол-во переработанной соли

    public MineralFertilizerPlant(String name, int count, String view, String director, double emissions, int product, int shift, String organiz, double numK, double salt) {
        this.name = name;
        this.count = count;
        this.view = view;
        this.director = director;
        this.emissions = emissions;
        this.product = product;
        this.shift = shift;
        this.organiz = organiz;
        this.numK = numK;
        this.salt = salt;
    }

    public MineralFertilizerPlant() {
        name = "";
        count = 0;
        view = "";
        director = "";
        emissions = 0;
        product = 0;
        shift = 0;
        organiz = "";
        numK = 0;
        salt = 0;
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

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public String getOrganiz() {
        return organiz;
    }

    public void setOrganiz(String organiz) {
        this.organiz = organiz;
    }

    public double getNumK() {
        return numK;
    }

    public void setNumK(double numK) {
        this.numK = numK;
    }

    public double getSalt() {
        return salt;
    }

    public void setSalt(double salt) {
        this.salt = salt;
    }

    public void eco(){
        if(emissions>440){
            System.out.println("Предприятие не экологичное и вредит природе");
        }else if(emissions<440){
            System.out.println("У предприятия нет проблем ");
        }
    }

    public void eco(int n){                                                     // перегруженный метод
        System.out.println("Необходимо сократить отходы на " + n);;
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

    public void eff(){ // эффективность
        if(numK>salt){
            System.out.println("Нарастить переработку соли");
        }else if(salt<numK){
            System.out.println("Увеличить добычу калия");
        }
    }

    public String tech(){ // обновление
        return "Завод закупил 3000 единиц новой техники";
    }

    public String cred(){
        return "Завод оплатил все кредиты";
    }

    public void imp(int n){
        switch (n){
            case 1:{
                System.out.println("Кол-во стран импортеров увеличилось");
                break;
            }
            case 2:{
                System.out.println("Кол-во стран импортеров уменьшилось");
                break;
            }
        }
    }

    public void imp(String ... s){                                                      // изменяемое число входных данных
        System.out.println("Страный импортёры: ");
        for(int i =0;i<s.length;i++){
            System.out.println(s[i]);;
        }
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
                ", Кол-во рабочих смен=" + shift +
                ", Организационная структура=" + organiz +
                ", Кол-во производства Калия=" + numK +
                ", Кол-во переработнной соли=" + salt +
                '}';
    }
}
