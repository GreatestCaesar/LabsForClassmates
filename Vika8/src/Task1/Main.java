package Task1;

public class Main {
    public static void main(String[] args){
        Country c = new Country("Слоним",49739,1252,"Торгонский",9,40.8162,147,"Слоним",1471,63700,"Гродно",41360,5,"Кравцов", 1039278,"Беларусь","Тихановская",6,207595,"Слоним");
        System.out.println(c);
        c.Area();
        System.out.println(c.cap());
        c.num();
        c.reg("Минск","Брест","Витебск","Могилев","Гродно","Гомель");
        System.out.println(c.info());
    }
}
