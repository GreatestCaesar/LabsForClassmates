package Main;

import Cipher.Cipher;
import Database.Database;
import MyException.MyException;
import Program.Program;
import Computer.Computer;
import Cipher.Decryptyon;
import Threads.SynchEnc;
import Write.Write;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException, IOException {
        Scanner s = new Scanner(System.in);
        int n = 0;
        Database database = new Database("Закупки",50,"Строгая");
        Database program = new Program("Обработка",150,"Oracle");
        Program computer = new Computer(16000,"Intel","Nvidia");
        System.out.println(database);
        database.glitch(false);
        database.attack(true);
        System.out.println(database.volume(100));
        new Write("database","C:\\Users\\Julius\\IdeaProjects\\Vlad17\\Database",database); // путь к проекту, смотря где он находится вставить свой до \\Database
        System.out.println("Данные записаны");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(program);
        program.glitch(false);
        new Write("program","C:\\Users\\Julius\\IdeaProjects\\Vlad17\\Program",program);
        System.out.println("Данные записаны");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(computer);
        new Write("computer","C:\\Users\\Julius\\IdeaProjects\\Vlad17\\Computer",computer);
        System.out.println("Данные записаны");
        computer.glitch(true);
        System.out.println(computer.volume(100));
        /*Cipher cip = new Cipher();
        Decryptyon d = new Decryptyon();
        new SynchEnc(cip);
        new SynchEnc(cip);*/
    }
}
