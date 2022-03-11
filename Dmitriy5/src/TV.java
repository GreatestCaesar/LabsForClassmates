public class TV { // телевизор
    private boolean smart; // наличие смарт тв
    private int volume; // громкость
    private String color; // цвет корпуса
    private int HDMI; // портов hdmi

    public TV() {
        smart = false;
        volume = 0;
        color = "";
        HDMI = 0;
    }

    public TV(boolean smart, int volume, String color, int HDMI) {
        this.smart = smart;
        this.volume = volume;
        this.color = color;
        this.HDMI = HDMI;
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

    @Override
    public String toString() {
        return "Телевизор{" +
                "SMART TV=" + smart +
                ", громкость=" + volume +
                ", цвет='" + color + '\'' +
                ", HDMI=" + HDMI +
                '}';
    }
}
