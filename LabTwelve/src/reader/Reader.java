package reader;

import interfaces.exc;
import interfaces.take;
import book.Book;

import java.util.Scanner;

public class Reader extends Book implements exc, take{
    private String name;
    private int year;
    private int taken; // на данный момент взято
    private int alltaken; // сколько вообще брал
    private int page;

    public Reader(String name, int page, String author, String publishing, int year, String name1, int year1, int taken, int alltaken, int page1) {
        super(name, page, author, publishing, year);
        this.name = name1;
        this.year = year1;
        this.taken = taken;
        this.alltaken = alltaken;
        this.page = page1;
    }

    public Reader() {
        super();
        name = "";
        year = 0;
        taken = 0;
        alltaken = 0;
        page  = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

    public int getTaken() {
        return taken;
    }

    public void setTaken(int taken) {
        this.taken = taken;
    }

    public int getAlltaken() {
        return alltaken;
    }

    public void setAlltaken(int alltaken) {
        this.alltaken = alltaken;
    }

    @Override
    public int getPage() {
        return page;
    }

    @Override
    public void setPage(int page) {
        this.page = page;
    }

    public void percent(){
        System.out.println("Процент прочитанной книги: " + page*100/super.getPage());
    }

    public void place(int i){
        if(i==1){
            System.out.println("Читает книгу в зале");
        }else if(i==2){
            System.out.println("Читает книгу дома");
        }
    }

    public void rait(){
        Scanner s = new Scanner(System.in);
        System.out.println("Оцените книгу (1-5): ");
        int n;
        n = s.nextInt();
        super.rait(n);
    }

    @Override
    public String toString() {
        return "Читатель{" +
                "Имя='" + name + "\'" +
                ", возраст=" + year +
                ", взято на данный момент книг=" + taken +
                ", взято за все время книг=" + alltaken +
                ", страниц прочитал=" + page +
                '}';
    }

    @Override
    public void exchange(int n) {
        if(n>5){
            System.out.println("Книга прочитана >5, необходимо провести замену");
        }
    }

    @Override
    public void to_take(){
        System.out.println("Читатель взял книгу");
        taken++;
    }
}
