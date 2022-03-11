package Task1;

public class Main {
    public static void main(String[] args){
        SocialNetwork sc = new SocialNetwork("БГАС",2013,"Тойода",20000000);
        System.out.println(sc);
        sc.use();
        sc.focus(3);
        sc.cover();
        System.out.println("************************************************************************************************");
        SearchSystem ss = new SearchSystem("Ищу",3000000,150,500000);
        System.out.println(ss);
        ss.pop();
        ss.renew();
        ss.qu(256);
        System.out.println("************************************************************************************************");
        Email e = new Email("АУЕ","АУФ",50000000,233);
        System.out.println(e);
        e.vis(20);
        e.serv();
        e.ant(1);
        System.out.println("************************************************************************************************");
    }
}
