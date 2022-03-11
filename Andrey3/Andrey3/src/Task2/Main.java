package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int i,n;
        double c=0;
        System.out.println("Введите предел цикла: ");
        n = s.nextInt();
        for(i=1;i<n;i++){
            c+=1/Math.pow(i,3);
        }
        System.out.println("Сумма = " + c);
    }
}
