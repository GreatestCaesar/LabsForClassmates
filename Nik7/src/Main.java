public class Main {
    public static void main(String[] args){
        SocialNetwork sc = new SocialNetwork("БГАС",2013,"Тойода",20000000,50000,1,420,5.5);
        System.out.println(sc);
        sc.use();
        sc.focus(3);
        sc.cover();
        System.out.println(sc.dev());
        System.out.println(sc.health());
        System.out.println(sc.lang());
        System.out.println(sc.at(5));
        sc.lang("Испанский");
        sc.comp("Твиттер","Фейсбук","Вконтакте","Инстаграмм");
        System.out.println("************************************************************************************************");
        SearchSystem ss = new SearchSystem("Ищу",3000000,150,500000,80,"PHP",4000000,1000);
        System.out.println(ss);
        ss.pop();
        ss.renew();
        ss.qu(256);
        System.out.println(ss.help());
        System.out.println(ss.comp());
        System.out.println(ss.find());
        ss.qu("Дзюба");
        ss.countr("США","Англя","Дания","Норвегия","Латвия","Турция");
        System.out.println("************************************************************************************************");
        Email e = new Email("АУЕ","АУФ",50000000,233,7,"aue.com",213125775,"SMTP");
        System.out.println(e);
        e.vis(20);
        e.serv();
        e.ant(1);
        System.out.println(e.us(1020));
        System.out.println(e.at());
        e.ant("18.11.2020");
        e.comp("Epam","Issoft","Itransition","JEN");
        System.out.println("************************************************************************************************");
    }
}
