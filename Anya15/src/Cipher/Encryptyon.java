package Cipher;

import MyException.MyException;

import java.util.Scanner;

public class Encryptyon {
    public void enc(String text) throws MyException {
        // String text = "Черные в белых костюмах, встали раньше меня, справят половую нужду в коридоре и подотрут, пока я их не накрыл.";
        char[] alphabet = {'а','б','в','г','д','е','ё','ж','з','и','й','к','л','м','н','о','п','р','с','т','у','ф','х','ц','ч','ш','щ','ъ','ы','ь','э','ю','я'};
        Scanner scan = new Scanner(System.in);
        int k = 0;
        String col = "", col2 = "";
        int s;

        do {
            k=0;
            System.out.print("Введите слово с неповторяющимися буквами для перестановки столбцов: ");
            col = scan.nextLine();
            for (int i = 0; i < col.length(); i++) {
                for (int j = i + 1; j < col.length(); j++) {
                    if (col.charAt(j) == col.charAt(i)) {
                        k++;
                        throw new MyException();
                    }
                }
            }
        }while(k!=0);
        char[] symbcol = new char[col.length()];
        for(int i=0;i<col.length();i++){
            symbcol[i] = col.charAt(i);
        }

        s=text.length()/col.length();

        int[] colind = new int[col.length()];
        int[] enccol = new int[col.length()];

        for(int i=0;i<col.length();i++){
            for(int j=0;j<alphabet.length;j++){
                if(col.charAt(i) == alphabet[j]){
                    colind[i] = j;
                    enccol[i] = j;
                }
            }
        }

        boolean z = true;
        while(z){
            if(text.length()%s!=0) {
                text += " ";
            }
            else{
                z = false;
            }
        }

        char[][] t = new char[s][colind.length];
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < colind.length; j++) {
                t[i][j] = text.charAt(k);
                k++;
            }
        }

        System.out.println();
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < colind.length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }

        char l = ' ', m = ' ';
        int n = 0;
        for(int i=0;i<colind.length;i++){
            for(int j=i+1;j<colind.length;j++){
                if(colind[i]>colind[j]){
                    n = colind[i];
                    colind[i] = colind[j];
                    colind[j] = n;
                    for(int x=0;x<s;x++){
                        m = t[x][i];
                        t[x][i] = t[x][j];
                        t[x][j] = m;
                    }
                    l = symbcol[i];
                    symbcol[i] = symbcol[j];
                    symbcol[j] = l;

                }
            }
        }

        System.out.println();
        for(int i=0;i<symbcol.length;i++){
            col2 += symbcol[i];
        }

        System.out.println();
        text = "";
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < colind.length; j++) {
                System.out.print(t[i][j] + " ");
                text += t[i][j];
            }
            System.out.println();
        }

        System.out.println("\nЗашифрованная строка: " + text);
        System.out.println("Зашифрованнное слово для перестановки столбцов: "+col2);
        System.out.print("Шифр столбцов: ");
        for(int i=0;i<enccol.length;i++){
            System.out.print(enccol[i]+" ");
        }
    }
}
