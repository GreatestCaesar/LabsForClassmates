package Task1;

public class AcousticSystem { // акустическая система
    private String name; // название
    private int num; // кол-во динамиков
    private double power; // мощность
    private int volume; // звук

    public AcousticSystem() {
        name = "";
        num = 0;
        power = 0;
        volume = 0;
    }

    public AcousticSystem(String name, int num, double power, int volume) {
        this.name = name;
        this.num = num;
        this.power = power;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void vol(){ // увеличение громкости
        System.out.println("Громкость " + volume + " увеличена на 1");
        volume++;
    }

    public void equalaizer(int n){ // эквалайзер
        switch (n){
            case 1:{
                System.out.println("Выбран режим \"Рок\"");
            }
            case 2:{
                System.out.println("Выбран режим \"Поп\"");
            }
            case 3:{
                System.out.println("Выбран режим \"Джаз\"");
            }
        }
    }

    public String tools(){ // гарнитура
        return "Акустическая система может использовать микрофон";
    }

    @Override
    public String toString() {
        return "Акустическая система{" +
                "название='" + name + '\'' +
                ", звук=" + volume +
                ", кол-во динамиков=" + num +
                ", мощность =" + power +
                '}';
    }
}
