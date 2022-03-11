package Cipher;

import MyException.MyException;

import java.util.Scanner;

public class Decryptyon {
    public void dec() {
        Scanner s = new Scanner(System.in);
        char[] alphabet = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        char[][] table = new char[alphabet.length][alphabet.length];
        int k=0,n=0;
        String sh,word,text;
        char[] newtext;

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

        System.out.print("\nВведите зашифрованное слово: ");
        sh = s.nextLine();
        System.out.print("Введите ключ шифрования: ");
        word = s.nextLine();
        newtext = new char[sh.length()];
        k=0;
        while(k<newtext.length) {
            for (int i = 0; i < word.length(); i++) {
                if(k<newtext.length) {
                    newtext[k] = word.charAt(i);
                    k++;
                }
            }
        }

        text = "";
        for(int i=0;i<newtext.length;i++){
            for(int j=0;j< table.length;j++){
                if(newtext[i] == table[j][0]){
                    for(int x=0;x< table.length;x++){
                        if(table[j][x] == sh.charAt(i)){
                            text += table[0][x];
                        }
                    }
                }
            }
        }

        System.out.println("Расшифрованное слово: " + text);
    }
}
