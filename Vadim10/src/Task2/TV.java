package Task2;

public class TV extends Television{ // телевизор
    private String model; // модель
    private int num; // кол-во проданных в год

    public TV(String country, String model, int num) {
        super.setCountry(country);
        this.model = model;
        this.num = num;
    }

    public TV() {
        super.setCountry("");
        model = "";
        num = 0;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public int getNum() {
        return num;
    }

    @Override
    public void setNum(int num) {
        this.num = num;
    }

    public void users(){
        if(num<1000){
            System.out.println("Телевизор обладает небольшим спросом среди покупателей");
        }else if(num>1000 && num<10000){
            System.out.println("Модель одна из популярных");
        }else{
            System.out.println("Данная модель самая востребованная среди покупателей");
        }
    }

    @Override
    public void rebrand(String s) {
        System.out.println("Компанию купила фирма Besheda и теперь телевизоры будут выходить по маркой " + s);
        setName(s);
    }

    @Override
    public String toString() {
        return "Телевизор{" +
                "модель='" + model + '\'' +
                ", страна='" + super.getCountry() + '\'' +
                ", кол-во проданных в год=" + num +
                '}';
    }
}
