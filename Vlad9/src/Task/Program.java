package Task;

public class Program extends Database{
    private String name; // разработчик

    public Program(String name) {
        this.name = name;
    }

    public Program(String name, double volume, String name1) {
        super(name, volume);
        this.name = name1;
    }

    public Program(double volume){
        super.setVolume(volume);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public double getVolume(){
        return super.getVolume();
    }

    @Override
    public void glitch(boolean a) {
        if(a==true){
            System.out.println("Программа успешно установлена. Перезагрузите компьютер");
        }else{
            System.out.println("Программа установлена некорректно. Запуск невозможен");
        }
    }

    @Override
    public String toString() {
        return "Программа{" +
                "название='" + super.getName() + '\'' +
                ", объем памяти=" + super.getVolume() +
                ", разработчик='" + name + '\'' +
                '}';
    }
}
