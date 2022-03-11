package Task2;

public class GasStation extends Petrol{ // АЗС
    // год
    private String town; // город
    private int num; // кол-во колонок

    public GasStation() {
        super(0);
        town = "";
        num = 0;
    }

    public GasStation(int year, String town, int num) {
        super(year);
        this.town = town;
        this.num = num;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void accident(boolean k) {
        if(k == true){
            System.out.println("На одной из колонок утечка топлива, возможна авария. Тревога!!!");
        }else{
            System.out.println("Неисправности в работе АЗС не обнаружены");
        }
    }

    public void breakk(int n, boolean l){
        if(l==true){
            System.out.println("АЗС закрыта на " + n + " часа для пополнения запасов топлива");
        }else{
            System.out.println("АЗС открыта");
        }
    }

    @Override
    public void prize(int n) {
        super.prize(n);
    }

    @Override
    public String toString() {
        return "АЗС{" +
                "город='" + town + '\'' +
                ", год постройки=" + super.getYear() +
                ", кол-во колонок=" + num +
                '}';
    }
}
