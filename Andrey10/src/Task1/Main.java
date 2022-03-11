package Task1;

public class Main {
    public static void main(String[] args){
        Drawing d = new Drawing(25,true,"Сосна",true,true);
        d.sign("Андрюша");
        d.snatch(26);
        d.snatch(3);
        System.out.println(d);
    }
}
