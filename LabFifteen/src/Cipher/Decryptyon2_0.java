package Cipher;

import java.util.Scanner;

public class Decryptyon2_0 extends Thread{
    public Decryptyon2_0(){
        super("Расшифровка строки");
        start();
    }

    public void run(){
        try {
            Thread.sleep(10000);
            char[] alphabet = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
            Scanner sc = new Scanner(System.in);
            String text, symbstr, symbcol;
            System.out.print("\nВведите зашифрованную строку: ");
            text = sc.nextLine();
            System.out.print("Введите зашифрованное слово для перестановки строк: ");
            symbstr = sc.nextLine();
            char[] sstr = new char[symbstr.length()];
            for (int i = 0; i < symbstr.length(); i++) {
                sstr[i] = symbstr.charAt(i);
            }
            System.out.print("Введите зашифрованное слово для перестановки столбцов: ");
            symbcol = sc.nextLine();
            char[] scol = new char[symbcol.length()];
            for (int i = 0; i < symbcol.length(); i++) {
                scol[i] = symbcol.charAt(i);
            }
            System.out.println("Шифр для перестановки строк: ");
            int[] strind = new int[symbstr.length()];
            for (int i = 0; i < strind.length; i++) {
                System.out.print((i + 1) + " число: ");
                strind[i] = sc.nextInt();
            }
            System.out.println("Шифр для перестановки столбцов: ");
            int[] colind = new int[symbcol.length()];
            for (int i = 0; i < colind.length; i++) {
                System.out.print((i + 1) + " число: ");
                colind[i] = sc.nextInt();
            }

            int[] stralp = new int[symbstr.length()];
            int[] colalp = new int[symbcol.length()];

            for (int i = 0; i < stralp.length; i++) {
                for (int j = 0; j < alphabet.length; j++) {
                    if (symbstr.charAt(i) == alphabet[j]) {
                        stralp[i] = j;
                    }
                }
            }

            for (int i = 0; i < colalp.length; i++) {
                for (int j = 0; j < alphabet.length; j++) {
                    if (symbcol.charAt(i) == alphabet[j]) {
                        colalp[i] = j;
                    }
                }
            }

            System.out.println("Текст: " + text);
            System.out.println("Слово для строк: " + symbstr);
            System.out.println("Слово для столбцов: " + symbcol);
            System.out.println("Шифр строк: ");
            for (int i = 0; i < strind.length; i++) {
                System.out.print(strind[i] + " ");
            }
            System.out.println("\nШифр столбцов: ");
            for (int i = 0; i < colind.length; i++) {
                System.out.print(colind[i] + " ");
            }

            int k = 0;
            char[][] t = new char[strind.length][colind.length];
            for (int i = 0; i < strind.length; i++) {
                for (int j = 0; j < colind.length; j++) {
                    t[i][j] = text.charAt(k);
                    k++;
                }
            }

            char l = ' ', m = ' ';
            for (int i = 0; i < colind.length; i++) {
                for (int j = i + 1; j < colalp.length; j++) {
                    if (colind[i] == colalp[j]) {
                        l = scol[i];
                        scol[i] = scol[j];
                        scol[j] = l;
                        for (int x = 0; x < strind.length; x++) {
                            m = t[x][i];
                            t[x][i] = t[x][j];
                            t[x][j] = m;
                        }
                    }
                }
            }

            System.out.println("\nРасшифрованное слово для столбцов: ");
            for (int i = 0; i < scol.length; i++) {
                System.out.print(scol[i] + " ");
            }

            System.out.println("\nРасшифрованнные столбцы: ");
            for (int i = 0; i < strind.length; i++) {
                for (int j = 0; j < colind.length; j++) {
                    System.out.print(t[i][j] + " ");
                }
                System.out.println();
            }

            l = ' ';
            m = ' ';
            for (int i = 0; i < strind.length; i++) {
                for (int j = i + 1; j < stralp.length; j++) {
                    if (strind[i] == stralp[j]) {
                        l = sstr[i];
                        sstr[i] = sstr[j];
                        sstr[j] = l;
                        for (int x = 0; x < colind.length; x++) {
                            m = t[i][x];
                            t[i][x] = t[j][x];
                            t[j][x] = m;
                        }
                    }
                }
            }

            System.out.println("\nРасшифрованное слово для строк: ");
            for (int i = 0; i < sstr.length; i++) {
                System.out.print(sstr[i] + " ");
            }

            text = "";
            System.out.println("\n\nРасшифрованнные строки: ");
            for (int i = 0; i < strind.length; i++) {
                for (int j = 0; j < colind.length; j++) {
                    System.out.print(t[i][j] + " ");
                    text += t[i][j];
                }
                System.out.println();
            }
            System.out.println("Расшифрованное слов: " + text);
        }catch (InterruptedException e){
            System.out.println("Поток расшифровки прерван");
        }
        System.out.println("Поток расшифровки завершён");
    }
}
