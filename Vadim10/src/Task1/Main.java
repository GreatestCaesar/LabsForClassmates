package Task1;

public class Main {
    public static void main(String[] args){
        Aerocarrier a = new Aerocarrier("Пётр 1",143,4,"Дизельный","Пулемёт, Пушка",20,"Истребители, Бомардировщики, Грузовые");
        System.out.println(a);
        a.clean(22);
        a.gun(true);
        a.service();
    }
}
