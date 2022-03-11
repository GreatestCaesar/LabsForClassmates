package Task2;

public class Petrol extends Refinery{ // бензин
    // год
    private String country; // страна
    private int type; // тип (95,92,ДТ)

    public Petrol(int year, String country, int type) {
        super(year);
        this.country = country;
        this.type = type;
    }

    public Petrol() {
        super(0);
        country = "";
        type = 0;
    }

    public Petrol(int year) {
        super(year);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public void accident(boolean k) {
        if(k==true){
            System.out.println("В бензин попали примеси, что может привести к проблемам, партию необходимо отправить обратно");
        }else{
            System.out.println("Бензин соответствует нормам");
        }
    }

    public void info(){
        switch (type){
            case 92:{
                System.out.println("Стандартный бензин подходящий под любые нужды(бензопила, газонокосилка и т.д.");
                break;
            }
            case 95:{
                System.out.println("Также как и 92 подходит под любые нужды, но стоимость чуть выше и рекомендуется запраляться только авто и не старше 1970");
                break;
            }
            case 100:{
                System.out.println("Отличный бензин, но подходит не ко всем авто, в основном для спортивных");
                break;
            }
            case 80:{
                System.out.println("На данный момент почти не используется, только в Америке");
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Бензин{" +
                "страна='" + country + '\'' +
                ", год переработки=" + super.getYear() +
                ", тип='" + type + '\'' +
                '}';
    }
}
