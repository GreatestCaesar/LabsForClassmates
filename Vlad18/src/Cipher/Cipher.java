package Cipher;

import MyException.MyException;

import java.util.Scanner;

public class Cipher {
    public void enc() throws MyException {
        Scanner s = new Scanner(System.in);
        int k=0, n=0;
        char[] alphabet = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        char[][] table = new char[alphabet.length][alphabet.length];
        String text, word;
        char[] newtext;
        boolean f=true;

        for(int i=0;i<table.length;i++){
            for(int j=0;j< table.length;j++){
                table[i][j] = ' ';
            }
        }

        for (int i=0;i<table.length;i++){
            for(int j=0;j< table.length;j++){
                if((j+k)<alphabet.length) {
                    table[i][j] = alphabet[j + k];
                }
            }
            k++;
        }

        for (int i=1;i<table.length;i++){
            for(int j=0;j<table.length;j++){
                if(table[i][j] == ' ') {
                    if (n < alphabet.length) {
                        table[i][j] = alphabet[n];
                        n++;
                    }
                }
            }
            n=0;
        }

        System.out.println("Таблица: ");
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("\nВведите слово, которое хотите зашифровать: ");
        text = s.nextLine();
        do {
            System.out.print("Введите ключ, которым хотите зашифровать: ");
            word = s.nextLine();
            if (word.length() > text.length()) {
                f=false;
                throw new MyException(word.length()-text.length());
            }
        }while (!f);
        newtext = new char[text.length()];
        k=0;
        while(k<newtext.length) {
            for (int i = 0; i < word.length(); i++) {
                if(k<newtext.length) {
                    newtext[k] = word.charAt(i);
                    k++;
                }
            }
        }

        System.out.print("Ваш ключ: ");
        for(int i=0;i< newtext.length;i++){
            System.out.print(newtext[i]);
        }

        String sh = "";
        for(int i=0;i< newtext.length;i++){
            for(int j=0;j<table.length;j++){
                if(table[0][j] == text.charAt(i)){
                    for(int x=0;x< table.length;x++){
                        if(table[x][0]==newtext[i]){
                            sh += table[j][x];
                        }
                    }
                }
            }
        }

        System.out.println("\nЗашифрованное слово: " + sh);

        //  -----------------------------------------------РАСШИФРОВКА---------------------------------------------------
    }
}
