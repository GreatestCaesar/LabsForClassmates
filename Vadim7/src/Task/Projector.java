package Task;

public class Projector{ // проектор
    private String model; // модель
    private double dist; // проекционное расстояние
    private int time; // срок службы
    private int brightness; // яркость

    public Projector() {
        model = "";
        dist = 0;
        time = 0;
        brightness = 0;
    }

    public Projector(String model, double dist, int time, int brightness) {
        this.model = model;
        this.dist = dist;
        this.time = time;
        this.brightness = brightness;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getDist() {
        return dist;
    }

    public void setDist(double dist) {
        this.dist = dist;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public void lang(String s){
        System.out.println("Выбран " + s + " язык");
    }

    public void lang(String ... s){ // перегруженный метод с изменяемы числом входных данных
        System.out.println("Загружена новая база языков(исправлены старые и добавлены новые)");
        for(String str:s){
            System.out.println(str);
        }
    }

    public void addbright(){
        System.out.println("Яркость увлечена на +1");
        brightness++;
    }

    public void mode(int n){
        switch (n){
            case 1:{
                System.out.println("Режим работы: экономичный");
                break;
            }
            case 2:{
                System.out.println("Режим работы: нормальный");
                break;
            }
        }
    }

    public void mode(String s){ // перегруженный метод
        switch (s){
            case "Экономный":{
                System.out.println("Время работы без перегрева составляет 7 часов");
                break;
            }
            case "Нормальный":{
                System.out.println("Время работы без перегрева составляет 3 часа");
                break;
            }
        }
    }

    public String port(){
        String[] ports = {"VGA","HDMI","RCA","SCART"};
        return "Подключен порт: " + ports[((int)(Math.random() * (ports.length+1)) + 0)];
    }

    @Override
    public String toString() {
        return "Проектор{" +
                "модель='" + model + '\'' +
                ", проекционное расстояние=" + dist +
                ", срок службы=" + time +
                ", яркость=" + brightness +
                '}';
    }
}
