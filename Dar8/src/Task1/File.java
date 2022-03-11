package Task1;

import java.util.ArrayList;
import java.util.Scanner;

public class File extends Directory{
    private String name; // название
    private String expansion; // расширение
    private int size; // размер файла
    private String date; // дата создания

    public File(String name, int num, int size, String name1, String expansion, int size1, String date) {
        super(name, num, size);
        this.name = name1;
        this.expansion = expansion;
        this.size = size1;
        this.date = date;
    }

    public File() {
        super();
        this.name = "";
        this.expansion = "";
        this.size = 0;
        this.date = "";
    }

    public File(String name, String expansion, int size, String date) {
        this.name = name;
        this.expansion = expansion;
        this.size = size;
        this.date = date;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getExpansion() {
        return expansion;
    }

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void createfile(ArrayList<Directory> d) { // создание файла
        File f = new File("Test", ".exe", 5675, "18.08.2001");
        d.add(f);
    }

    public void rename(ArrayList<Directory> d, int n){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите новое название файла: ");
        d.get(n).setName(s.nextLine());
    }

    @Override
    public String toString() {
        return "Файл{" +
                "название='" + name + '\'' +
                ", расширение='" + expansion + '\'' +
                ", размер=" + size +
                ", дата создания='" + date + '\'' +
                '}';
    }
}
