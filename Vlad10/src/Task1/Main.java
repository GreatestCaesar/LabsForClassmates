package Task1;

public class Main {
    public static void main(String[] args){
        Surgeon s = new Surgeon("Козлов",35,9,23);
        Neurosurgeon n = new Neurosurgeon("Панин",42,16,111);
        System.out.println(s);
        s.operation("Нога",3,true);
        s.place(1);
        System.out.println("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        System.out.println(n);
        n.operation("Мозг",2,false);
        n.age();
    }
}
