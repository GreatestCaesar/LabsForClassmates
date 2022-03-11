package Task;

public class Television extends  Telecommunications{ // телевидение
    private String name; // название
    private int num; // кол-во сотрудников

    public Television(String country, String name, int num) {
        super.setCountry(country);
        this.name = name;
        this.num = num;
    }

    public Television() {
        super.setCountry("");
        name = "";
        num = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void sponsor(boolean l){
        if(l==true){
            System.out.println("Телеканал получает спонсорство от государства");
        }else{
            System.out.println("Телеканал продвигается за счёт привлечения рекламы и инвесторов");
        }
    }

    @Override
    public void users(){
        System.out.println("70% зрителей смотрят данный канал в онлайн формате");
    }

    @Override
    public String toString() {
        return "Телевидение{" +
                "название='" + name + '\'' +
                ", страна='" + super.getCountry() + '\'' +
                ", кол-во сотрудников=" + num +
                '}';
    }
}
