package Cipher;

import java.util.Scanner;

public class Decryptyon extends Thread {
    public Decryptyon() {
        super("Расшифровка строки");
        start();
    }
    public void run(){
        Scanner scanner = new Scanner(System.in);
        String text = "";
        int n=0;
        char[] word;
        int[][] sq = {{16,3,2,13},{9,6,7,12},{5,10,11,8},{4,15,14,1}};
        char[][] newword = new char[sq.length][sq.length];

        System.out.print("Введите слово для расшифровки: ");
        text = scanner.nextLine();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        word = new char[text.length()];
        word = text.toCharArray();
        for(int i=0;i<newword.length;i++){
            for(int j=0;j<newword.length;j++){
                newword[i][j] = '0';
            }
        }

        for(int i=0;i<newword.length;i++){
            for(int j=0;j< newword.length;j++){
                if(sq[i][j]<= word.length){
                    newword[i][j] = word[n];
                    n++;
                }
            }
        }

        word = new char[text.length()];
        for (int i=0;i< text.length();i++){
            for(int j=0;j<sq.length;j++){
                for(int l=0;l<sq.length;l++){
                    if(sq[j][l] == (i+1)){
                        word[i] = newword[j][l];
                    }
                }
            }
        }

        System.out.print("\nРасшифрованное слово: ");
        for(int i=0;i<word.length;i++){
            System.out.print(word[i]);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
