package Task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        ArrayList<Salad> s = new ArrayList<>();
        Salad sa = new Salad();
        s = sa.creat(s);

        for(int i=0;i<s.size();i++){ // вывод содержимого салата
            System.out.println(s.get(i).toString());
        }
        System.out.println("======================================================================");
        s = sa.sort(s); // сортировка салата по витаминам
        for(int i=0;i<s.size();i++){
            System.out.println(s.get(i).toString());
        }
        System.out.println("\nОбщая калорийность = " + sa.calor(s));
        System.out.println("Введите начальное число диапазона: ");
        int r = c.nextInt();
        System.out.println("Введите конечно число диапазона: ");
        int b = c.nextInt();
        for(int i=0;i<s.size();i++){
            if(s.get(i).getCalorie() >= r && s.get(i).getCalorie() <= b){
                System.out.println(s.get(i).toString());
            }
        }
    }
}
