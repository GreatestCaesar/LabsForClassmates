public class Email { // эл. почта
    private String name; // название
    private String company; // компания разработчик
    private int visits; // кол-во посещений в сутки
    private int servers; // кол-во серверов
    private int att; // кол-во кибер атак
    private String domen; // домен
    private int users; // кол-во пользователей
    private String prot; // протокол

    public Email() {
        name = "";
        company = "";
        visits = 0;
        servers = 0;
        att = 0;
        domen = "";
        users = 0;
        prot = "";
    }

    public Email(String name, String company, int visits, int servers, int att, String domen, int users, String prot) {
        this.name = name;
        this.company = company;
        this.visits = visits;
        this.servers = servers;
        this.att = att;
        this.domen = domen;
        this.users = users;
        this.prot = prot;
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

    public int getAtt() {
        return att;
    }

    public void setAtt(int att) {
        this.att = att;
    }

    public String getDomen() {
        return domen;
    }

    public void setDomen(String domen) {
        this.domen = domen;
    }

    public int getUsers() {
        return users;
    }

    public void setUsers(int users) {
        this.users = users;
    }

    public String getProt() {
        return prot;
    }

    public void setProt(String prot) {
        this.prot = prot;
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

    public void ant(String s){                                                                  // перегруженный метод
        System.out.println("Базыд данных антивируса последний раз были обновлены " + s);
    }       

    public String us(int n){
        users += n;
        return "Количество пользователей выросло до " + users;
    }

    public String at(){
        String s = "";
        if(att>15){
            s = "Увеличить расходы на кибер безопасность";
        }
        return s;
    }

    public void comp(String ... s){                                                             // изменяемое число входных данных
        System.out.println("Компании, которые пользуются данной почтой: ");
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }

    @Override
    public String toString() {
        return "Электронная почта{" +
                "название='" + name + '\'' +
                ", компания='" + company + '\'' +
                ", кол-во посещений=" + visits +
                ", кол-во серверов=" + servers +
                ", кол-во кибер атак=" + att +
                ", домен='" + domen + '\'' +
                ", кол-во пользователей=" + users +
                ", протокол='" + prot + '\'' +
                '}';
    }
}
