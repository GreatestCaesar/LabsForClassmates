package Task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Sound> disk = new ArrayList<>();
        Sound sound = new Sound();
        boolean l=true;
        char c;
        while (l){
            System.out.println("1. Записать трек на диск\t2. Продолжительность треков на диске\t3. Перестановка по принаддежности к стилю\t4. Треки в диапазоне длины\t0. Выход");
            c = s.next().charAt(0);
            switch (c){
                case '1':{
                    disk = sound.creat(disk);
                    break;
                }
                case '2':{
                    double d = 0;
                    for(int i=0;i<disk.size();i++){
                        d += disk.get(i).getDuration();
                    }
                    System.out.println("Продолжительность треков составляет: " + d);
                    break;
                }
                case '3':{
                    disk = sound.sort(disk);
                    for(Sound sound1:disk){
                        System.out.println(sound1);
                    }
                    break;
                }
                case '4':{
                    int x,y;
                    System.out.print("Введите начальное значение длины трека: ");
                    x = s.nextInt();
                    System.out.println("Введите конечное значение длины трека: ");
                    y = s.nextInt();
                    for(int i=0;i<disk.size();i++){
                        if(disk.get(i).getDuration()>=x && disk.get(i).getDuration()<=y){
                            System.out.println(disk.get(i));
                        }
                    }
                    break;
                }
                case '0':{
                    l=false;
                    break;
                }
                default:{
                    System.out.println("Ошибка");
                    break;
                }
            }
        }
    }
}
