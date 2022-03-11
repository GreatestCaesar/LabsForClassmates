package main;

import Cipher.Decryptyon2_0;
import Cipher.Encryptyon2_0;
import Cipher.ForSync;
import MyException.MyException;
import book.Book;
import library.Library;
import reader.Reader;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Reader r = new Reader("Мастер и Маргарита",1200,"Булгаков","Минск",2020,"Гисич",20,1,4,0);
        Book b = new Book("Мастер и Маргарита",1200,"Булгаков","Минск",2020);
        Library l = new Library("Мастер и Маргарита",1200,"Булгаков","Минск",2020,"Гисич",20,1,4,0,678,2340);
        l.complexity();
        l.novelty();
        l.percent();
        l.place(1);
        l.rait();
        l.book();
        l.reader();
        System.out.println(l);
        System.out.println(r);
        System.out.println(b);
        System.out.println(l.reader1());
        Encryptyon2_0 e = new Encryptyon2_0();
        ForSync example1 = new ForSync(e);
        ForSync example2 = new ForSync(e);
        try{
            example1.join();
            example2.join();
        }catch (InterruptedException ex ){
            System.out.println("Прервано");
        }
    }
}
