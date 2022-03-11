public class Tablet { // планшет
    private String version; // версия ОС
    private String model; // модель
    private double diagonal; // диагональ
    private int memory; // память

    public Tablet() {
        version = "";
        model = "";
        diagonal = 0;
        memory = 0;
    }

    public Tablet(String version, String model, double diagonal, int memory) {
        this.version = version;
        this.model = model;
        this.diagonal = diagonal;
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

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Планшет{" +
                "версия ОС='" + version + '\'' +
                ", модель='" + model + '\'' +
                ", диагональ=" + diagonal +
                ", память=" + memory +
                '}';
    }
}
