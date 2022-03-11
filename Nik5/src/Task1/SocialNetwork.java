package Task1;

public class SocialNetwork { // социальная сеть
    private String name; // название
    private int year; // год основания
    private String nam; // имя разработчика
    private int users; // кол-во пользователей

    public SocialNetwork(String name, int year, String nam, int users) {
        this.name = name;
        this.year = year;
        this.nam = nam;
        this.users = users;
    }

    public SocialNetwork() {
        name = "";
        year = 0;
        nam = "";
        users = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    public int getUsers() {
        return users;
    }

    public void setUsers(int users) {
        this.users = users;
    }

    public void use(){
        System.out.println("Соц. сетью пользуются в 80 странах");
    }

    public void cover(){
        System.out.println("Процент охваченного населения" + (users*100/8000000));
    }

    public void focus(int n){
        System.out.println("Напрвленность: ");
        switch (n){
            case 1:{
                System.out.println("Общего хар-ра");
                break;
            }
            case 2:{
                System.out.println("Музыкальный сервис");
                break;
            }
            case 3:{
                System.out.println("Деловая и проф.деятельность");
                break;
            }
            case 4:{
                System.out.println("Блог-платформа");
                break;
            }
            case 5:{
                System.out.println("Видеоплатформа");
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Социальная сеть{" +
                "название='" + name + '\'' +
                ", год создания=" + year +
                ", разработчик='" + nam + '\'' +
                ", кол-во пользователей=" + users +
                '}';
    }
}
