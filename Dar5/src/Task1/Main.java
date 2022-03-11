package Task1;

public class Main {
    public static void main(String[] args){
        Submarine s = new Submarine("Ёрш",92,320,"РФ");
        СruiseShip cs = new СruiseShip("Семёнов",340,60.6,65000,5000);
        Cruiser c = new Cruiser("Пётр Великий",60,1989,1035);
        System.out.println(s);
        s.increase();
        s.detection(1);
        s.dep(40);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(cs);
        cs.w(2400);
        cs.clean(4,0.5,2.5);
        cs.sos(3);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(c);
        c.army(1);
        c.helic(0);
        c.incspeed(45);
    }
}
