package Task2;

import java.util.Scanner;

public class Array {
    public static void main(String[] args){   //  Найдите среднее арифметическое положительных элементов каждого столбца матрицы
        System.out.println("Введите размер матрицы: ");
        Scanner scan=new Scanner (System.in);
        int n=scan.nextInt();                                        // задаем размер матрицы
        int[] [] array = new int[n] [n];                             // объявляем переменные
        int i, j, counter;
        double sum;
        double average;
        for (i=0; i<n; i++) {                                       // заполняем матрицу рандомными числами в диапазоне от 1 до n(размер матрицы)
            for( j=0; j<n; j++) {
                array[i][j] = (int)((Math.random()*n)+1);
            }
        }
        System.out.println("Матрица: ");                             // выводим матрицу на экран

        for ( i=0; i<n; i++) {
            for( j=0; j<array[i].length; j++) {
                System.out.print(array [i] [j]+ "\t");
            }
            System.out.println("\n");
        }

        for ( j=0; j<n; j++) {                                        // считаем среднее арифметическое
            sum=0;
            average=0;
            counter=0;
            for( i=0; i<array[j].length; i++) {
                if (array[i][j]>0) {
                    sum=sum+array[i][j];
                    counter++;
                }
                else {

                }
            }
            average=sum/counter;
            System.out.println( j+1 +"-й столбец: cреднее арифметическое =" + average );
        }
    }
}
