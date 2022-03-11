package Task2;

public class DaityPlant extends Cattle{ // молочный завод
    private String name; // название
    private String dir; // директор
    private int num; // кол-во филиалов

    public DaityPlant(String name, String dir, int num) {
        this.name = name;
        this.dir = dir;
        this.num = num;
    }

    public DaityPlant(int num, double year, String name, String dir, int num1) {
        super(num, year);
        this.name = name;
        this.dir = dir;
        this.num = num1;
    }

    public DaityPlant() {
        name = "";
        dir = "";
        num = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    @Override
    public int getNum() {
        return num;
    }

    @Override
    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void update() {
        System.out.println("Открыто 2 новых филиала");
        num+=2;
    }

    public void close(){
        System.out.println("В связи с нарушением санэпидемиологических норм завод закрывается на неопределенный срок");
    }

    @Override
    public String check(boolean l) {
        String s;
        if(l==true){
            s = "На завод предвидится проверка";
        }else{
            s = "Завод не нуждается в проверке";
        }
        return s;
    }

    @Override
    public String toString() {
        return "Молочный завод{" +
                "название='" + name + '\'' +
                ", директор='" + dir + '\'' +
                ", кол-во филиалов=" + num +
                '}';
    }
}
