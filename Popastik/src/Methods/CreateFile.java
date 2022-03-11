package Methods;

import java.io.*;
import java.util.Scanner;

public class CreateFile {

    public static void main(String[] args){
        try {
            Scanner s = new Scanner(System.in);
            String name = null; // название файла
            String dir1 = "C:\\Users\\Julius\\IdeaProjects\\Popastik\\"; // каталог
            System.out.println("Введите название файла");
            name = s.nextLine();
            String dir = dir1 + name + ".txt";
            File file = new File(dir); // созадние файла
            FileOutputStream FW = new FileOutputStream(file);
            String text = "";
            System.out.println("Введите текст: ");
            text = s.nextLine();
            text += "\n";
            Write(FW,text);
            System.out.println(Read(file));
            text = "";
            System.out.println("Введите текст: ");
            text = s.nextLine();
            text += "\n";
            Write(FW,text);
            System.out.println(Read(file));
            FW.close();
            file = Rename(file, dir1);
            System.out.println(Read(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void Write(FileOutputStream f, String text) throws IOException { // запись в файл
        try{
            Scanner s = new Scanner(System.in);

            byte buf[] = text.getBytes();
            f.write(buf);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String Read(File dir) throws IOException { // чтение файла
        String t = null;
        try {
            FileInputStream f = new FileInputStream(dir);
            byte b[] = new byte[f.available()];
            f.read(b);
            t = new String(b);
            f.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return t;
    }

    public static File Rename(File file, String dir1) throws IOException { // переименование
        Scanner s = new Scanner(System.in);
        String name;
        System.out.println("Введите новое имя файла: "); // переименование
        name = s.nextLine();
        String dir2 = dir1 + name + ".txt";
        File newFile = new File(dir2);
        FileOutputStream NF = new FileOutputStream(newFile);
        Write(NF,Read(file));
        Delete(file);
        return newFile;
    }

    public static void Delete(File file){ // удаление
        file.delete();
    }
}
