package Task;

public class Main {
    public static void main(String[] args){
        Database database = new Database("Закупки",50,"Строгая");
        Database program = new Program("Обработка данных",150,"Oracle");
        Program computer = new Computer(16000,"Intel","Nvidia");
        System.out.println(database);
        database.glitch(false);
        database.attack(true);
        System.out.println(database.volume(100));
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(program);
        program.glitch(false);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(computer);
        computer.glitch(true);
        System.out.println(computer.volume(1500));
    }
}
