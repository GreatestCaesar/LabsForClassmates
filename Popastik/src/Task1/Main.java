package Task1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String name = "";
        ArrayList<Directory> d = new ArrayList<>();
        Directory di = new Directory();
        File f = new File();
        TextFile tf = new TextFile();
        f.createfile(d); // создание
        tf.createtextfile(d); // создание
        for(int i = 0;i<d.size();i++){
            System.out.println(d.get(i));
        }
        tf .rename(d,0); // переименование
        for(int i = 0;i<d.size();i++){
            System.out.println(d.get(i));
        }
        for (int i=0;i<d.size();i++) { // содержимое
            if (tf.getClass() == d.get(i).getClass()){
                tf = (TextFile) d.get(i);
                System.out.println("Содержимое текст. файла: " + tf.getText());
            }
        }
        String text = "";
        for (int i=0;i<d.size();i++) { // дополнить файл
            if (tf.getClass() == d.get(i).getClass()){
                tf = (TextFile) d.get(i);
                System.out.println("Введие текст, чтобы дополнить: ");
                text = s.nextLine();
                tf.setText(tf.getText()+" " +text);
            }
        }
        for (int i=0;i<d.size();i++) { // содержимое
            if (tf.getClass() == d.get(i).getClass()){
                tf = (TextFile) d.get(i);
                System.out.println("Содержимое текст. файла: " + tf.getText());
            }
        }
        d.remove(0); // удаление файла из директории
        for(int i = 0;i<d.size();i++){
            System.out.println(d.get(i));
        }
    }
}
