package Task1;

public class Main {
    public static void main(String[] args){
        Petal petal = new Petal("Синий",22,"Остроугольная","Расцвел");
        System.out.println(petal);
        System.out.println();
        Bud bud = new Bud("Синий",60,"Пышный",12,false,"Расцвел");
        System.out.println(bud);
        System.out.println();
        Flower flower = new Flower("Синий",120,"Одиночный",12,false,"Роза",220,3,"Расцвел");
        System.out.println(flower);
        System.out.println();
        System.out.println("Лепесток: ");
        petal.blossom(true);
        petal.wither(!true);
        System.out.println("Цветок: ");
        flower.wither(true);
        flower.blossom(false);
        System.out.println("Цвет бутона: " + bud.getColor());
    }
}
