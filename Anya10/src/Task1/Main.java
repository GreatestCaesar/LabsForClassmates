package Task1;

public class Main {
    public static void main(String[] args){
        Lamp lamp = new Lamp("Светоч",55,120,210,2018);
        System.out.println("**********************************************************************************");
        System.out.println(lamp);
        lamp.on_off(1);
        lamp.time("11:15");
        lamp.warranty();
        System.out.println("**********************************************************************************");
        TableLamp tableLamp = new TableLamp("Луч",50,60,120,2019,400,true);
        System.out.println(tableLamp);
        tableLamp.on_off(2);
        tableLamp.bright(3);
        tableLamp.warranty();
        System.out.println("**********************************************************************************");
    }
}
