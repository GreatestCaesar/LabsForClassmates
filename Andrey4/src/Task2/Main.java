package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Введите размер матрицы: ");
        n = s.nextInt();
        int[][] a = new int[n][n];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                a[i][j] = (int)((Math.random()*(n*n))+1);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        int max1 = a[0][0];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                if(max1 < a[i][j]){
                    max1 = a[i][j];
                }
            }
        }

        int max2 = a[0][0];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                if(max2 < a[i][j] && a[i][j] < max1){
                    max2 = a[i][j];
                }
            }
        }

        System.out.println("1-ый максимальный элемент: " + max1 + "\n2-ой максимальный элемент: " + max2);
    }
}
