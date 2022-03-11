package Task;

public class Main {
    public static void main(String[] args){
        Telecommunications telecommunications = new Telecommunications(20000000,"Россия");
        System.out.println(telecommunications);
        telecommunications.users();
        System.out.println("==========================================================================");
        Television television = new Television("Польша","Охота",250);
        System.out.println(television);
        television.users();
        television.sponsor(true);
        System.out.println("==========================================================================");
        TV tv = new TV("Китай","Samsung",10500);
        System.out.println(tv);
        tv.users();
        System.out.println("==========================================================================");

    }
}
