package laba_11;

import ferry.Ferry;
import shipp.Ship;
import Read.Read;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Read r = new Read();
        String[] fields;
        System.out.println("Объект класса Ship до прочтения данных из файла: ");
        Ship S = new Ship();
        System.out.println(S);
        System.out.println("Объект класса Ship после прочтения данных из файла: ");
        fields = r.read(S,"C:\\Users\\Julius\\IdeaProjects\\Popastik17\\Ship\\S.txt");
        Ship ship = new Ship(Integer.parseInt(fields[0]),Double.parseDouble(fields[1]),Integer.parseInt(fields[2]),Integer.parseInt(fields[3]),Double.parseDouble(fields[4]));
        System.out.println(ship);
        System.out.println("Объект класса Ferry до прочтения данных из файла: ");
        Ferry F = new Ferry();
        System.out.println(F);
        System.out.println("Объект класса Ferry после прочтения данных из файла: ");
        fields = r.read(F,"C:\\Users\\Julius\\IdeaProjects\\Popastik17\\Ferry\\P.txt");
        Ferry ferry = new Ferry(Integer.parseInt(fields[0]),Double.parseDouble(fields[1]),Integer.parseInt(fields[2]),Integer.parseInt(fields[3]),Double.parseDouble(fields[5]),Double.parseDouble(fields[4]));
        System.out.println(ferry);
    }
}
