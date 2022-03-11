package Laba;

import java.util.Date;

public class Robotics { //роботостроение
    String direction; // направление использования
    double carrying; // грузоподъемность в кг
    String tasks; // задачи робота
    String type; // тип "полный автомат" "управляемый" "переключаемый с Авт в Упр"
    int num; // количество
    double year; // срок службы

    Robotics(){
        this.direction = "Пищевая промышленность";
        this.carrying = 30;
        this.tasks = "Нарезка, сортировка, упаковка";
        this.type = "Автоматизированный";
        this.num = 15;
    }

    Robotics(String d, double c, String ta, String ty, double p, int n){
        this.direction = d;
        this.carrying = c;
        this.tasks = ta;
        this.type = ty;
        this.num = n;
    }

    public String getDirection() {
        return direction;
    }

    public double getCarrying() {
        return carrying;
    }

    public String getTasks() {
        return tasks;
    }

    public String getType() {
        return type;
    }

    public int getNum() {
        return num;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setCarrying(double carrying) {
        this.carrying = carrying;
    }

    public void setTasks(String tasks) {
        this.tasks = tasks;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getYear() {
        return year;
    }

    public void setYear(double year) {
        this.year = year;
    }

    public void Reporting(){ // вывод данных о производстве
        Date d = new Date();
        int m = d.getMonth();
        System.out.print("За " + m + " месяц завод выпустил " + num + " роботов(а) " + "\"" + direction + "\"" + " направления с " + "\"" + tasks + "\"" + " задачами. Количество брака составило: " + (0 + (int)(Math.random()*((num/2)/2))) + "\n");
    }

    public void Turnover(double n){ // оборот, n - количество компаний в которые поставляется робот
        System.out.print("Для бесперебойной и беспроблемной поставки продутка необходимо: " + (((num+10)/n)+num) + " роботов прозапас\n");
    }

    public void Availability(int n){ // число на складе
        if(n<=num){
            System.out.println("Столько роботов на складе есть");
        }else{
            System.out.print("Такого количества роботов на складе нет");
        }
    }

    public void risk_of_breakage(){ // риск поломки робота в зависимости от выбора грузоподъемности
        System.out.print("Риск поломки робота грузоподъемностью при перегрузке допустимого значнеия " + carrying + "кг = " + (carrying/((carrying*15)/100)) + "%\n");
    }

    public String ii(int n){ // искусственный интеллект
        String s = "";
        if(n==1){
            s = "Робот может быть оснащен искусственным интеллектом";
        }else if(n==0){
            s = "Искусственный интеллект не предусмотрен";
        }
        return s;
    }

    public String term(){ // замена робота
        String l = "";
        if(year>3){
            l = "Пришло время заменить робота!";
        }
        return l;
    }

    @Override
    public String toString() {
        return "Роботы{" +
                "направление='" + direction + '\'' +
                ", грузоподъемность=" + carrying +
                ", задачи='" + tasks + '\'' +
                ", тип='" + type + '\'' +
                ", количество=" + num +
                ", срок службы=" + year +
                '}';
    }
}
