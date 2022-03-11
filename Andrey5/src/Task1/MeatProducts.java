package Task1;

public class MeatProducts {    // мясная продукция
    private String name;      // название фабрики
    private int num;          // кол-во свиней
    private int num1;         // кол-во коров
    private int num2;         // кол-во кур

    public MeatProducts(String name, int num, int num1, int num2) {
        this.name = name;
        this.num = num;
        this.num1 = num1;
        this.num2 = num2;
    }

    public MeatProducts() {
        name = "";
        num = 0;
        num1 = 0;
        num2 = 0;
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

    public void exp(){
        System.out.println("Экспорт происходит в страные Европы и Америки");
    }

    @Override
    public String toString() {
        return "Мясная продукция{" +
                "название фабрики='" + name + '\'' +
                ", кол-во свиней=" + num +
                ", кол-во коров=" + num1 +
                ", кол-во кур=" + num2 +
                '}';
    }
}
