public class Submarine { //подлодка
    private double length; // длина
    private double depth; // глубина на данный момент
    private String name; // название
    private String country; // страна
    private double time; // время на глубине
    private int torpedo; // количество торпед
    private int count; // кол-во экипажа
    private double power; // мощность

    public Submarine(String name, double length, double depth, String country, double time, int torpedo, int count, double power) {
        this.length = length;
        this.depth = depth;
        this.name = name;
        this.country = country;
        this.time = time;
        this.torpedo = torpedo;
        this.count = count;
        this.power = power;
    }

    public Submarine(){
        length = 0;
        depth = 0;
        name = "";
        country = "";
        time = 0;
        torpedo = 0;
        count = 0;
        power = 0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public int getTorpedo() {
        return torpedo;
    }

    public void setTorpedo(int torpedo) {
        this.torpedo = torpedo;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void increase(){ // увлеичение подлодки
        System.out.println("Перестроить подлодку и увеличить длину на 2 метра");
        length += 2;
    }

    public void detection(int n){ // обнаружение
        switch (n){
            case '1':{
                System.out.println("Обнаружен неопознанный объект");
                break;
            }
            default:{
                System.out.println("Угроз не обнаружено");
            }
        }
    }

    public void dep(double d){
        if(d<320){
            System.out.println("Подлодка меняет глубину на " + d + " метров");
            depth = d;
        }else{
            System.out.println("Данная глубина недопустима");
        }
    }

    public String life(){ // метод с возвращаемым значением
        return "Подлодка обладает запасами еды и воды на 2 недели";
    }

    public void climb(){
        if(time>36){
            System.out.println("Необходимо всплыть на поверхнсть!");
        }else {
            System.out.println("Нет необходимости в всплытии");
        }
    }

    public String inc(){ // увеличение боезапаса
        torpedo += 5;
        return "Количество торпед увеличено на 5";
    }

    public void pressure(int n) { // давление
        switch (n) {
            case '1': {
                System.out.println("Давление в норме");
                break;
            }
            default: {
                System.out.println("Проблемы с давлением, необходимо срочно всплыть");
            }
        }
    }

    @Override
    public String toString() {
        return "Подлодка{" +
                "Название='" + name + '\'' +
                ", Страна='" + country + '\'' +
                ", Длина=" + length +
                ", Глубина=" + depth +
                ", Время на глубине=" + time +
                ", Количество торпед=" + torpedo +
                ", Количество экипажа=" + count +
                ", Мощность=" + power +
                '}';
    }
}
