package Task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Directory {
    private String name; // название
    private int num; // кол-во файлов в директори
    private int size; // размер (байт)

    public Directory(String name, int num, int size) {
        this.name = name;
        this.num = num;
        this.size = size;
    }

    public Directory() {
        name = "Папка";
        num = 0;
        size = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Директория{" +
                "название='" + name + '\'' +
                ", кол-во файлов=" + num +
                ", размер(кб)=" + size +
                '}';
    }
}
