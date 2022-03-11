package Cipher;

import java.util.Scanner;

public class Decryprtyon {
    public void dec(){
        char[] alphabet = {'а','б','в','г','д','е','ё','ж','з','и','й','к','л','м','н','о','п','р','с','т','у','ф','х','ц','ч','ш','щ','ъ','ы','ь','э','ю','я'};
        Scanner sc = new Scanner(System.in);
        String text = "", symbcol = "";
        int s;
        System.out.print("\nВведите зашифрованную строку: ");
        text = sc.nextLine();
        System.out.print("Введите зашифрованное слово для перестановки столбцов: ");
        symbcol = sc.nextLine();
        char[] scol = new char[symbcol.length()];
        for(int i=0;i<symbcol.length();i++){
            scol[i] = symbcol.charAt(i);
        }
        System.out.println("Шифр для перестановки столбцов: ");
        int[] colind = new int[symbcol.length()];
        for(int i=0;i< colind.length;i++){
            System.out.print((i+1) + " число: ");
            colind[i] = sc.nextInt();
        }

        int[] colalp = new int[symbcol.length()];
        for(int i=0;i<colalp.length;i++){
            for(int j=0;j<alphabet.length;j++){
                if(symbcol.charAt(i) == alphabet[j]){
                    colalp[i] = j;
                }
            }
        }
        System.out.println("Текст: " + text);
        System.out.println("Слово для столбцов: " + symbcol);
        System.out.println("\nШифр столбцов: ");
        for(int i=0;i< colind.length;i++){
            System.out.print(colind[i] + " ");
        }

        s=text.length()/symbcol.length();

        int k=0;
        char[][] t = new char[s][colind.length];
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < colind.length; j++) {
                t[i][j] = text.charAt(k);
                k++;
            }
        }

        char l = ' ', m = ' ';
        for(int i=0;i<colind.length;i++){
            for(int j=i+1;j<colalp.length;j++){
                if(colind[i]==colalp[j]){
                    l = scol[i];
                    scol[i] = scol[j];
                    scol[j] = l;
                    for(int x=0;x<s;x++){
                        m = t[x][i];
                        t[x][i] = t[x][j];
                        t[x][j] = m;
                    }
                }
            }
        }

        System.out.println("\nРасшифрованное слово для столбцов: ");
        for(int i=0;i< scol.length;i++){
            System.out.print(scol[i] + " ");
        }

        text = "";
        System.out.println("\nРасшифрованнные столбцы: ");
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < colind.length; j++) {
                System.out.print(t[i][j] + " ");
                text += t[i][j];
            }
            System.out.println();
        }

        System.out.println("Расшифрованное слово: " + text);
    }
}
