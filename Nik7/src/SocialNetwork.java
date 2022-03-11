public class SocialNetwork { // социальная сеть
    private String name; // название
    private int year; // год основания
    private String nam; // имя разработчика
    private int users; // кол-во пользователей
    private double cost; // стоимость разработки
    private int position; // позиция в мировом рейтинге
    private double time; // время разработки (дни)
    private double time1; // время проводимое пользователем в сети

    public SocialNetwork(String name, int year, String nam, int users, double cost, int position, double time, double time1) {
        this.name = name;
        this.year = year;
        this.nam = nam;
        this.users = users;
        this.cost = cost;
        this.position = position;
        this.time = time;
        this.time1 = time1;
    }

    public SocialNetwork() {
        name = "";
        year = 0;
        nam = "";
        users = 0;
        cost = 0;
        position = 0;
        time = 0;
        time1 = 0;
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

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getTime1() {
        return time1;
    }

    public void setTime1(double time1) {
        this.time1 = time1;
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

    public String dev(){
        cost += 5000;
        return "В связи с повышением доллара, стоимость разработки увеличена до " + cost;
    }

    public String health(){
        String s = "";
        if(time1>4){
            s = "Проводить такое количество времени в соц. сети вредно для вашего здоровья";
        }
        return s;
    }

    public String lang(){
        return "Соц. сеть доступна на 34 языках";
    }

    public void lang(String s){                                                     // перегруженный метод
        System.out.println("Выбран " + s + " язык");
    }                   // перегруженный метод

    public String at(int n){
        return "За последний год на соц. сеть проводилось " + n + " атаки";
    }

    public void comp(String ... s){                                                             // изменяемое число входных данных
        System.out.println("Конкуренты соц. сети: ");
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }

    @Override
    public String toString() {
        return "Социальная сеть{" +
                "название='" + name + '\'' +
                ", год создания=" + year +
                ", разработчик='" + nam + '\'' +
                ", кол-во пользователей=" + users +
                ", стоимость разработки=" + cost +
                ", позиция в мировом рейтинге=" + position +
                ", время разработки=" + time +
                ", время проводимое пользователем в сети=" + time1 +
                '}';
    }
}
