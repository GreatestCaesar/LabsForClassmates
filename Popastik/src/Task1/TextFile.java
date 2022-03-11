package Task1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TextFile extends File {
    private String name; // название
    private String expansion; // расширение
    private int size; // размер файла
    private String date; // дата создания
    private String text; // содержимое

    public TextFile(String name, int num, int size, String name1, String expansion, int size1, String date, String name2, String expansion1, int size2, String date1, String text) {
        super(name, num, size, name1, expansion, size1, date);
        this.name = name2;
        this.expansion = expansion1;
        this.size = size2;
        this.date = date1;
        this.text = text;
    }

    public TextFile() {
        super();
        this.name = "";
        this.expansion = "";
        this.size = 0;
        this.date = "";
        this.text = "";
    }

    public TextFile(String name2, String expansion1, int size2, String date1, String text) {
        this.name = name2;
        this.expansion = expansion1;
        this.size = size2;
        this.date = date1;
        this.text = text;
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
    public String getExpansion() {
        return expansion;
    }

    @Override
    public void setExpansion(String expansion) {
        this.expansion = expansion;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String getDate() {
        return date;
    }

    @Override
    public void setDate(String date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void createtextfile(ArrayList<Directory> d){ // создание текстового файла
        TextFile tf = new TextFile("Text",".doc",455,"18.08.2001","Привет");
        d.add(tf);
    }

    public void rename(ArrayList<Directory> d, int n){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите новое название файла: ");
        d.get(n).setName(s.nextLine());
    }

    @Override
    public String toString() {
        return "Текстовый файл{" +
                "название='" + name + '\'' +
                ", расширение='" + expansion + '\'' +
                ", размер=" + size +
                ", дата создания='" + date + '\'' +
                ", содержимое='" + text + '\'' +
                '}';
    }
}
