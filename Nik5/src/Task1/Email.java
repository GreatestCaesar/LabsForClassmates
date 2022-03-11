package Task1;

public class Email { // эл. почта
    private String name; // название
    private String company; // компания разработчик
    private int visits; // кол-во посещений в сутки
    private int servers; // кол-во серверов

    public Email() {
        name = "";
        company = "";
        visits = 0;
        servers = 0;
    }

    public Email(String name, String company, int visits, int servers) {
        this.name = name;
        this.company = company;
        this.visits = visits;
        this.servers = servers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getVisits() {
        return visits;
    }

    public void setVisits(int visits) {
        this.visits = visits;
    }

    public int getServers() {
        return servers;
    }

    public void setServers(int servers) {
        this.servers = servers;
    }

    public void vis(int n){
        System.out.println("Посещения снизились до " + (visits-n));
        visits -= n;
    }

    public void serv(){
        if(servers>23){
            System.out.println("Сервера размещены в нескольких странах");
        }else {
            System.out.println("Сервера находятся в одной стране");
        }
    }

    public void ant(int n){
        switch (n){
            case 1:{
                System.out.println("Электронная почта сотрудничает с анитивирусом NOD32");
                break;
            }
            case 2:{
                System.out.println("Электронная почта ни с кем не сотрудничает");
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Электронная почта{" +
                "название='" + name + '\'' +
                ", компания='" + company + '\'' +
                ", кол-во посещений=" + visits +
                ", кол-во серверов=" + servers +
                '}';
    }
}
