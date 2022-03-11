package Main;

import Cipher.Cipher;
import Database.Database;
import MyException.MyException;
import Program.Program;
import Computer.Computer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException {
        Scanner s = new Scanner(System.in);
        int n = 0;
        Database database = new Database("Закупки",50,"Строгая");
        Database program = new Program("Обработка данных",150,"Oracle");
        Program computer = new Computer(16000,"Intel","Nvidia");
        System.out.println(database);
        database.glitch(false);
        database.attack(true);
        try {
            System.out.println("Введите размер данных, которые вы хотите добавить в БД: ");
            n = s.nextInt();
        }catch (Exception e){
            System.out.println("Ошибка - " + e + "\nВыход");
            System.exit(0);
        }
        System.out.println(database.volume(n));
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(program);
        program.glitch(false);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(computer);
        computer.glitch(true);
        try {
            System.out.println("Введите размер данных, которые обрабатывает комьютер: ");
            n = s.nextInt();
        }catch (Exception e){
            System.out.println("Ошибка - " + e);
        }
        System.out.println(computer.volume(n));
        Cipher cip = new Cipher();
        cip.enc();
    }
}
