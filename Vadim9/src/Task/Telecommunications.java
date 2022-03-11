package Task;

public class Telecommunications { // телекомуникации
    private int money; // прибыль
    private String country; // страна

    public Telecommunications() {
        money = 0;
        country = "";
    }

    public Telecommunications(int money, String country) {
        this.money = money;
        this.country = country;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void users(){
        System.out.println("Пользователи используют телекоммунникации для получения новостей из мира и проведения досуга");
    }

    @Override
    public String toString() {
        return "Телекоммуникации{" +
                "прибыль=" + money +
                ", страна='" + country + '\'' +
                '}';
    }
}
