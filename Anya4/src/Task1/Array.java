package Task1;

import java.util.Scanner;

public class Array { // cреднее арифметическое
    public static void main(String[] args){
        int[] A = new int[10]; // создание массива размером 10
        int k=0,sum=0; // переменная для подсчета и для суммирования элементов
        System.out.println("Ваш массив: "); // текст
        for(int i=0;i<A.length;i++){ // цикл от 0 до конца массива
            A[i] = (int)(Math.random()*200-100); // заполнение массива [-100;100]
            System.out.print(A[i] + " | "); // вывод массива на экран
        }
        System.out.println();
        for(int i=0;i<A.length;i++){ // нахождение арифметического
            if(A[i]>0){ // проверка положительности элемента массива
                System.out.println(sum + "+" + A[i] + "=" + (sum+A[i]) + " и k=" + (k+1)); // отображения найденного
                sum+=A[i]; // суммирование
                k++; // подсчет
            }
        }
        System.out.println("\nСреднее арифметическое равно: sum=" + sum + ", k=" + k + ", " + sum + "/" + k + "=" + sum/k); // вывод на экран результата
    }
}
