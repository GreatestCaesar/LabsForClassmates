package Task1;

import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n, c = 1;
        System.out.println("Введите размер массива: ");
        n = s.nextInt();                                        // считываем длину массива
        int[] a = new int[n];                                   // создаём массив
        for(int i = 0; i < a.length; i++){
            a[i] = (int)((Math.random()*n+0));                  // заполняем массив рандомными числами от 0 до введенного числа
            c*=a[i];                                            // находим произведение элементов массива
            System.out.print(a[i] + " ");                       // отображаем содержимое массива
        }
        System.out.println("\na[1]*a[2]*... = " + Math.abs(c)); // выводим произведение
    }
}
