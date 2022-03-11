package library;

import interfaces.take;
import reader.Reader;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Library extends Reader implements take {
    private int NumRead; // количество читателей
    private int NumBook; // количество книг

    public Library(String name, int page, String author, String publishing, int year, String name1, int year1, int taken, int alltaken, int page1, int numRead, int numBook) {
        super(name, page, author, publishing, year, name1, year1, taken, alltaken, page1);
        NumRead = numRead;
        NumBook = numBook;
    }

    public Library(){
        super();
        NumRead = 0;
        NumBook = 0;
    }

    public int getNumRead() {
        return NumRead;
    }

    public void setNumRead(int numRead) {
        NumRead = numRead;
    }

    public int getNumBook() {
        return NumBook;
    }

    public void setNumBook(int numBook) {
        NumBook = numBook;
    }

    public void book(){
        if(super.getTaken() > 5){
            System.out.println("Не давать больше книг");
        }else{
            System.out.println("Может взять еще книгу");
        }
    }

    public void reader(){
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Где будет читать читатель? \n1. В зале \t2. Дома");
            int n = s.nextInt();
            super.place(n);
        }catch (InputMismatchException e){
            System.out.println("Введено не число!\nПрекращение работы программы. " + e);
            System.exit(1);
        }
    }

    public String reader1(){
        return super.toString();
    }

    @Override
    public String toString() {
        return "Библиотека{" +
                "всего читателей зарегистрировано=" + NumRead +
                ", всего книг=" + NumBook +
                '}';
    }

    @Override
    public void to_take(){
        System.out.println("Читатель взял книгу");
        NumBook--;
    }
}
