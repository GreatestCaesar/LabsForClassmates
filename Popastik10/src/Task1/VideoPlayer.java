package Task1;

public class VideoPlayer extends Player{
    private int ports; // кол-во портом
    private String disc; // поддерживаемые оптические носители

    public VideoPlayer(String name, int memory, String formats, double time, String country, int ports, String disc) {
        super(name, memory, formats, time, country);
        this.ports = ports;
        this.disc = disc;
    }

    public VideoPlayer() {
        super();
        ports = 0;
        disc = "";
    }

    public int getPorts() {
        return ports;
    }

    public void setPorts(int ports) {
        this.ports = ports;
    }

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }

    @Override
    void format(String s) {
        if(getFormats().contains(s)){
            System.out.println("Данный формат поддерживается в видеоплеере");
        }else{
            System.out.println("Данный формат не поддерживается в видеоплеере");
        }
    }

    @Override
    public String toString() {
        return "Видеоплеер{" +
                "название='" + getName() + '\'' +
                ", память=" + getMemory() +
                ", поддерживаемые форматы='" + getFormats() + '\'' +
                ", время работы=" + getTime() +
                ", countrстрана производитель='" + getCountry() + '\'' +
                ", кол-во портов=" + ports +
                ", поддерживаемые цифр. носители='" + disc + '\'' +
                '}';
    }
}
