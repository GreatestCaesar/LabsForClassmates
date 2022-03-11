package Laba;

public class Agriculture {
    String type; // тип: трактор, кормоубор, зерноубор
    int num; // количество выпуск в год
    double price; // цена за 1 техники $
    int num1; // число работников для сборки 1 техники

    public Agriculture(String type, int num, double price, int num1) {
        this.type = type;
        this.num = num;
        this.price = price;
        this.num1 = num1;
    }

    public Agriculture() {
        this.type = "Трактор";
        this.num = 120;
        this.price = 40000;
        this.num1 = 243;
    }

    public void Wage(){ // зп сотрудника
        double all = 0 , comp = 0;
        all = (num/12)*price;
        comp = all-(all*60/100);
        System.out.print("Зароботная плата сотрудника составляет: " + comp/num1 + "\n");
    }

    public void Year(){
        double all = 0 , comp = 0;
        all = (num/12)*price;
        comp = all-(all*40/100);
        comp *= 12;
        System.out.print("Чистый доход компании в год: " + comp + "\n");
    }

    public void Report(){
        System.out.print("Тип выпускаемой продукции: " + type + "\nКоличество: " + num + "\nЦена единицы техники: " + price + "\n");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }
}
