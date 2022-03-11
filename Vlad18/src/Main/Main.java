package Main;

import Cipher.Cipher;
import Database.Database;
import MyException.MyException;
import Program.Program;
import Computer.Computer;
import Cipher.Decryptyon;
import Read.Read;
import Threads.SynchEnc;
import Write.Write;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException, IOException {
        String[] fields;
        Read read = new Read();
        Scanner s = new Scanner(System.in);
        int n = 0;
        Database ex = new Database();
        fields = read.read(ex,"C:\\Users\\Julius\\IdeaProjects\\Vlad17\\Database\\database.txt");
        Database database = new Database(fields[0], Double.parseDouble(fields[1]),fields[2]);
        Program ex1 = new Program();
        fields = read.read(ex1,"C:\\Users\\Julius\\IdeaProjects\\Vlad17\\Program\\program.txt");
        Program program = new Program(fields[0], Double.parseDouble(fields[1]),fields[2]);
        Computer ex2 = new Computer();
        fields = read.read(ex2,"C:\\Users\\Julius\\IdeaProjects\\Vlad17\\Computer\\computer.txt");
        Computer computer = new Computer(Double.parseDouble(fields[0]),fields[1], fields[2]);
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
