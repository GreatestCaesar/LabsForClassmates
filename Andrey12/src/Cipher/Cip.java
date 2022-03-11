package Cipher;

import java.util.Scanner;

public class Cip {
    public void enc(){
        Scanner scanner = new Scanner(System.in);
        int[][] sq = {{16,3,2,13},{9,6,7,12},{5,10,11,8},{4,15,14,1}};
        String text = "";
        char[] word;
        char[][] newword = new char[sq.length][sq.length];
        int n=0;

        for(int i=0;i<newword.length;i++){
            for(int j=0;j<newword.length;j++){
                newword[i][j] = '0';
            }
        }

        System.out.print("Введите слово для зашифровки: ");
        text = scanner.nextLine();

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

    public void dec(){
        Scanner scanner = new Scanner(System.in);
        String text = "";
        int n=0;
        char[] word;
        int[][] sq = {{1,15,14,4},{12,6,7,9},{8,10,11,5},{13,3,2,16}};
        char[][] newword = new char[sq.length][sq.length];

        System.out.print("Введите слово для расшифровки: ");
        text = scanner.nextLine();

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
    }
}
