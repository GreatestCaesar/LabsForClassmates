import java.util.Scanner;

public class Dictaphone { // диктофон
    private String model; // модель
    private double memory; // память
    private double time; // время записи
    private boolean connector; // разъем для наушников
    private double timework; // время работы без подзарядки

    public Dictaphone(String model, double memory, double time, boolean connector, double timework) {
        this.model = model;
        this.memory = memory;
        this.time = time;
        this.connector = connector;
        this.timework = timework;
    }

    public Dictaphone() {
        model = "";
        memory = 0;
        time = 0;
        connector = false;
        timework = 0;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public boolean isConnector() {
        return connector;
    }

    public void setConnector(boolean connector) {
        this.connector = connector;
    }

    public double getTimework() {
        return timework;
    }

    public void setTimework(double timework) {
        this.timework = timework;
    }

    public void recording(){
        int n=0,k=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Нажмите 1 для начала записи: ");
        n = scanner.nextInt();
        if(n==1){
            System.out.println("Идёт запись...");
            while(k!=2){
                System.out.println("Нажмите 2, чтобы остановить запись");
                k = scanner.nextInt();
            }
            System.out.println("Запись остановлена");
        }
    }

    public void listening(){
        int k=0;
        Scanner scanner = new Scanner(System.in);
        String[] audio = {"22.10.2000","04.01.2001","20.09.2000","12.01.20001"};
        System.out.println("Выберите запись которую желаете прослушать: ");
        for(int i=0;i<audio.length;i++){
            System.out.println((i+1)+": "+audio[i]);
        }
        k = scanner.nextInt();
        System.out.println("Запись " + audio[k-1]);
    }

    public int allrecord(){ // возвращает кол-во записей на диктофоне
        String[] audio = {"22.10.2000","04.01.2001","20.09.2000","12.01.20001"};
        return audio.length;
    }

    @Override
    public String toString() {
        return "Диктафон{" +
                "модель='" + model + '\'' +
                ", память=" + memory +
                ", время=" + time +
                ", разъем=" + connector +
                ", время работы без подзарядки=" + timework +
                '}';
    }
}
