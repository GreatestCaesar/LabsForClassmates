package Cipher;

import java.util.Scanner;

public class Encryptyon  extends Thread {
    public Encryptyon() {
        super("Зашифровка строки");
        start();
    }

    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        int[][] sq = {{16,3,2,13},{9,6,7,12},{5,10,11,8},{4,15,14,1}};
        String text = "";
        char[] word;
        char[][] newword = new char[sq.length][sq.length];
        int n=0;
        boolean m=true;

        for(int i=0;i<newword.length;i++){
            for(int j=0;j<newword.length;j++){
                newword[i][j] = '0';
            }
        }

        do {
            System.out.print("Введите слово для зашифровки: ");
            text = scanner.nextLine();
            if(text.length()>16){
                m=false;                                                                 // СОБСВТЕННОЕ ИСКЛЮЧЕНИЕ
            }
        }while(m!=true);



        word = new char[text.length()];
        word = text.toCharArray();

        System.out.println("\nМагический квадрат: ");
        for(int i=0;i<sq.length;i++){
            for(int j=0;j<sq.length;j++){
                if(sq[i][j]<10){
                    System.out.print(" " + sq[i][j] + " | ");
                }else {
                    System.out.print(sq[i][j] + " | ");
                }
            }
            System.out.println();
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nВаше слово: ");
        for(int i=0;i< word.length;i++){
            System.out.print(word[i] + " ");
        }

        for(int i=0;i<word.length;i++){
            for(int k=0;k<sq.length;k++){
                for(int j=0;j< sq.length;j++){
                    if(sq[k][j] == (i+1)){
                        newword[k][j] = word[i];
                    }
                }
            }
        }

        text = "";

        System.out.println();
        for(int i=0;i<newword.length;i++){
            for(int j=0;j< newword.length;j++){
                if(newword[i][j]!='0'){
                    text+=newword[i][j];
                }
            }
        }

        System.out.println("\nЗашифрованное слово: " + text);
    }
}
