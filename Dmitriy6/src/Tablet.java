import java.util.Scanner;

public class Tablet { // планшет
    private String version; // версия ОС
    private String model; // модель
    private int charge; // заряд
    private int bright; // яркость
    private int memory; // память

    public Tablet() {
        version = "";
        model = "";
        charge = 0;
        bright = 0;
        memory = 0;
    }

    public Tablet(String version, String model, int charge, int bright, int memory) {
        this.version = version;
        this.model = model;
        this.charge = charge;
        this.bright = bright;
        this.memory = memory;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public int getBright() {
        return bright;
    }

    public void setBright(int bright) {
        this.bright = bright;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void incbright(){
        bright++;
        System.out.println("Яркость " + bright);
    }

    public void eco(){
        if(charge<20){
            System.out.println("Включен режим экономии энергии");
        }
    }

    public void update(int n){
        Scanner s = new Scanner(System.in);
        if(n!=0){
            System.out.println("Обнаружено новое обновление, принять?");
            s.nextLine();
            System.out.println("Идёт обновление...");
        }
    }

    public String mode(int n){
        if(n == 1){
            return "Режим для людей с нарушением зрения включен";
        }
        return "Планшет работает в стандартном режиме";
    }

    @Override
    public String toString() {
        return "Планшет{" +
                "версия ОС='" + version + '\'' +
                ", модель='" + model + '\'' +
                ", заряд=" + charge +
                ", яркость=" + bright +
                ", память=" + memory +
                '}';
    }
}
