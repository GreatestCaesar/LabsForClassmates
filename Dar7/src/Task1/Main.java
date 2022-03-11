package Task1;

public class Main {
    public static void main(String[] args){
        Submarine s = new Submarine("Ёрш",92,320,"РФ",38,4,76,700);
        СruiseShip cs = new СruiseShip("Семёнов",340,60.6,65000,5000,15,362,2700,5492);
        Cruiser c = new Cruiser("Пётр Великий",60,1989,1035,12,1000,60,3);
        System.out.println(s);
        s.increase();
        s.detection(1);
        s.dep(40);
        System.out.println(s.life());
        s.climb();
        s.pressure(1);
        System.out.println(s.inc());
        s.com("Иванов","Петров","Соболев","Лукъянов","Черванов","Ладжин");
        s.inc(7,"Рапсодия");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(cs);
        cs.w(2400);
        cs.clean(4,0.5,2.5);
        cs.sos(3);
        System.out.println(cs.data());
        cs.cab();
        cs.place();
        cs.place(450);
        System.out.println(cs.location());
        cs.location("Швеция","Монако","Севастопль","Турция");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(c);
        c.army(1);
        c.helic(0);
        c.incspeed(45);
        System.out.println(c.dep());
        System.out.println("Автономность увеличена с " + c.getAutonomy() + " на " + c.aut());
        c.reward();
        c.hole(1);
        System.out.println(c.army());
        System.out.println("Число раз, когда крейсер переходил в боевую готовность " + c.army());
        c.supplies("Вода","Еда","Теплая одежда","Топливо");
    }
}
