package Task2;

public class Browser extends Site {
    private int users; // кол-во пользователей

    public Browser(String name, int year, String lang, int users) {
        super.setName(name);
        super.setYear(year);
        super.setLang(lang);
        this.users = users;
    }

    public Browser() {
        users = 0;
    }

    public int getUsers() {
        return users;
    }

    public void setUsers(int users) {
        this.users = users;
    }

    @Override
    public void update() {
        System.out.println("В Браузер добавлен VPN");
    }

    @Override
    public boolean data(int n) { // кол-во запросов сколько может обрабатывать
        boolean k;
        if(n>6000){
            k = false;
        }else{
            k = true;
        }
        return k;
    }

    @Override
    public String toString() {
        return "Браузер{" +
                "название='" + super.getName() + '\'' +
                ", кол-во пользователей=" + users +
                ", год создания=" + super.getYear() +
                ", язык разработки='" + super.getLang() + '\'' +
                '}';
    }
}
