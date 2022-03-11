package Task1;

public abstract class Player implements Technics{ // плеер
    private String name; // название
    private int memory; // объём памяти (Гб)
    private String formats; // поддерживаемые форматы
    private double time; // время непрерывной работы (в часах!)
    private String country; // страна производитель

    public Player(String name, int memory, String formats, double time, String country) {
        this.name = name;
        this.memory = memory;
        this.formats = formats;
        this.time = time;
        this.country = country;
    }

    public Player() {
        name = "";
        memory = 0;
        formats = "";
        time = 0;
        country = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getFormats() {
        return formats;
    }

    public void setFormats(String formats) {
        this.formats = formats;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    @Override
    public void numsongs() {
        System.out.println("За " + time + " часов можно прослушать ±" + (time*60/3) + " песни(ен)");
    }

    @Override
    public void numtime() {
        System.out.println("В память плеера может вместиться " + (memory/1024/10) + " песен");
    }

    abstract void format(String s);
}
