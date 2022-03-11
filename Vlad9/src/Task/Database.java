package Task;

public class Database {
    private String name; // название
    private double volume; // объем памяти
    private String orderliness; // упорядоченность данных

    public Database() {
        name = "";
        volume = 0;
        orderliness = "";
    }

    public Database(String name, double volume, String orderliness) {
        this.name = name;
        this.volume = volume;
        this.orderliness = orderliness;
    }

    public Database(String name, double volume){
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getOrderliness() {
        return orderliness;
    }

    public void setOrderliness(String orderliness) {
        this.orderliness = orderliness;
    }

    public void attack(boolean a){
        if(a==true){
            System.out.println("На базу данных проведена хакерская атака, сервисы временно недоступны");;
        }else{
            System.out.println("База данных работает без сбоев");
        }
    }

    public void glitch(boolean a){
        if(a==true){
            System.out.println("Из-за перегрузки эл. сетей в базе данных произошел сбой, доступ восстанавливается");;
        }else{
            System.out.println("База данных работает без сбоев");
        }
    }

    @Override
    public String toString() {
        return "База данных{" +
                "название='" + name + '\'' +
                ", объем памяти=" + volume +
                ", упорядоченность='" + orderliness + '\'' +
                '}';
    }
}
