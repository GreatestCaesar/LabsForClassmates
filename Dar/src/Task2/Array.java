package Task2;

import java.util.Scanner;

public class Array {
    static boolean isSymmetric(int mat[][], int size) {
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size - i; j++)
                if (mat[i][j] != mat[j][i])
                    return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Введите размер матрицы nxn: ");
        int n= s.nextInt();
        int[][] number = new int[n][n];

        System.out.println("Заполните матрицу: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                number[i][j] = s.nextInt();
            }
        }

        System.out.println("Ваша матрица: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(number[i][j] + "   ");
            }
            System.out.println();
        }

        if (isSymmetric(number, n)) {
            System.out.print("Симметрична");
        } else {
            System.out.print("Не симметрична");
        }
    }
}
