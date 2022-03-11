package Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n, x,i=1,c=0;
        System.out.println("Введите х: ");
        x = s.nextInt();
        System.out.print("Введите n: ");
        n = s.nextInt();
        while(i<=n){
            c+=(i+(Math.pow(2*x,i)/fact(i)));
            i++;
        }
        System.out.println("Значение = " + c);
    }

    public static int fact(int n){
        int t = 1;
        for(int i = 1; i <= n; i++){
            t*=i;
        }
        return t;
    }
}
