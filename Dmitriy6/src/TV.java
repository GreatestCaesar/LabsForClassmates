import java.util.Scanner;

public class TV { // телевизор
    private boolean smart; // наличие смарт тв
    private int volume; // громкость
    private String color; // цвет корпуса
    private int HDMI; // портов hdmi
    private String support; // поддерживаемое качество изображения

    public TV() {
        smart = false;
        volume = 0;
        color = "";
        HDMI = 0;
        support = "";
    }

    public TV(boolean smart, int volume, String color, int HDMI, String support) {
        this.smart = smart;
        this.volume = volume;
        this.color = color;
        this.HDMI = HDMI;
        this.support = support;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHDMI() {
        return HDMI;
    }

    public void setHDMI(int HDMI) {
        this.HDMI = HDMI;
    }

    public String getSupport() {
        return support;
    }

    public void setSupport(String support) {
        this.support = support;
    }

    public void vol(){
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("1. Увеличить громкость 2. Снизить громкость - " + getVolume());
        n = s.nextInt();
        switch (n){
            case 1:{
                volume++;
                System.out.println("Громкость " + volume);
                break;
            }
            case 2:{
                volume--;
                System.out.println("Громкость " + volume);
                break;
            }
        }
    }

    public void mode(){
        Scanner s = new Scanner(System.in);
        System.out.println("Выберите режим для просмотра:\n1. HDMI 1\n2. SMART TV\n3. AV\n4. USB\n5. TV");
        int n;
        n = s.nextInt();
        System.out.print("Режим: ");
        switch (n){
            case 1:{
                System.out.println("HDMI 1");
                break;
            }
            case 2:{
                if(smart==false){
                    System.out.println("TV SMART отсутствует на данном телевизоре");
                }else {
                    System.out.println("SMART TV");
                }
                break;
            }
            case 3:{
                System.out.println("AV");
                break;
            }
            case 4:{
                System.out.println("USB");
                break;
            }
            case 5:{
                System.out.println("TV");
                break;
            }
        }
    }

    public String info(){ // выводит информацию о том, что на данным момент транслируется
        return "Передача о мире животных";
    }

    @Override
    public String toString() {
        return "Телевизор{" +
                "SMART TV=" + smart +
                ", громкость=" + volume +
                ", цвет='" + color + '\'' +
                ", HDMI=" + HDMI +
                ", качество='" + support + '\'' +
                '}';
    }
}
