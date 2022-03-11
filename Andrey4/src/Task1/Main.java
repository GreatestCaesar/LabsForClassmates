package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n, t = 0;
        System.out.println("Введите длину массива: ");
        n = s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++){
            a[i] = (int)((Math.random()*n)+1);
            System.out.print(a[i] + " ");
            t += i*a[i];
        }
        System.out.print("\nСумма равна = " + t);
    }
}
