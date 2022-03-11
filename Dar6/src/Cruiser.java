public class Cruiser { // крейсер
    private String name; // название
    private double speed; // макс скорость
    private int year; // год постройки
    private int count; // количество экипажа
    private int num; // кол-во уничтоженных объектов
    private double range; // дальность плавания
    private int autonomy; // автономность (сутки)
    private int cell; // кол-во отсеков

    public Cruiser(String name, double speed, int year, int count, int num, double range, int autonomy, int cell) {
        this.name = name;
        this.speed = speed;
        this.year = year;
        this.count = count;
        this.num = num;
        this.range = range;
        this.autonomy = autonomy;
        this.cell = cell;
    }

    public Cruiser() {
        name = "";
        speed = 0;
        year = 0;
        count = 0;
        num = 0;
        range = 0;
        autonomy = 0;
        cell = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public int getAutonomy() {
        return autonomy;
    }

    public void setAutonomy(int autonomy) {
        this.autonomy = autonomy;
    }

    public int getCell() {
        return cell;
    }

    public void setCell(int cell) {
        this.cell = cell;
    }

    public void army(int n){
        switch (n){
            case '1':{
                System.out.println("Крейсер приведен в боевую готовность!");
                break;
            }
            default:{
                System.out.println("Крейсер в обычном режиме");
                break;
            }
        }
    }

    public void helic(int c){
        switch (c){
            case '1':{
                System.out.println("Вертолётная площадка не свободна");
                break;
            }
            default:{
                System.out.println("Вертолётная площадка свободна");
                break;
            }
        }
    }

    public void incspeed(double i){
        if(i>60){
            System.out.println("Крейсер не может развивать такую скорость");
        }else{
            System.out.println("Скоость увеличена до " + i);
            speed = i;
        }
    }

    public String dep(){ // отплытие
        return "Крейсер вышел из порта";
    }

    public double aut(){ // увеличение автономности
        return autonomy += 3;
    }

    public void reward(){ // награда за уничтоежиенное кол-во объектов
        if(num>10){
            System.out.println("Представить экипаж к награде");
        }
    }

    public void hole(int c){ // обнаружена пробоина
        switch (c){
            case '1':{
                System.out.println("Обнаружена пробоина, крейсер способен оставатьсян а плаву с 3 затопленными отсеками");
                break;
            }
            default:{
                System.out.println("Крейсер в порядке");
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Крейсер{" +
                "название='" + name + '\'' +
                ", скорость=" + speed +
                ", год постройки=" + year +
                ", кол-во экипажа=" + count +
                ", кол-во уничтоженных объектов=" + num +
                ", дальность плавания=" + range +
                ", автономность=" + autonomy +
                ", кол-во отсеков=" + cell +
                '}';
    }
}
