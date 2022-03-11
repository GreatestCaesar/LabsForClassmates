package Cipher;

public class Encryptyon {
    public void encrypt(String text) {
        while (Math.sqrt(text.length()) != (int)(Math.sqrt(text.length()))){
            text += " ";
        }
        int c = (int) (Math.sqrt(text.length()));
        int s = (int) (Math.sqrt(text.length()));
        int k = 0;
        char[][] t = new char[s][c];
        char[][] t1 = new char[s][c];
        char[][] t2 = new char[s][c];
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < c; j++) {
                t[i][j] = text.charAt(k);
                k++;
            }
        }

        for (int i = 0; i < s; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        int[] columns = new int[c];
        int[] str = new int[s];
        int n = 0;
        boolean b = false;

        for (int i = 0; i < str.length; i++) {
            b = false;
            n = (int) (Math.random() * (str.length));
            for (int j = i - 1; j >= 0; j--) {
                if (n == str[j]) {
                    b = true;
                    i--;
                    break;
                }
            }
            if (!b) {
                str[i] = n;
            }
        }

        System.out.print("\nШифр строк: ");
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }

        for (int i = 0; i < columns.length; i++) {
            b = false;
            n = (int) (Math.random() * (columns.length));
            for (int j = i - 1; j >= 0; j--) {
                if (n == columns[j]) {
                    b = true;
                    i--;
                    break;
                }
            }
            if (!b) {
                columns[i] = n;
            }
        }

        System.out.print("\nШифр столбцов: ");
        for (int i = 0; i < columns.length; i++) {
            System.out.print(columns[i] + " ");
        }

        // зашифровка
        char x = ' ';
        System.out.println("\n\nПерестановка строк: ");
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < c; j++) {
                t1[str[i]][j] = t[i][j];
            }
        }

        for (int i = 0; i < s; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(t1[i][j] + " ");
            }
            System.out.println();
        }

        x = ' ';
        System.out.println("\nПерестановка стоблцов: ");
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < c; j++) {
                t2[i][columns[j]] = t1[i][j];
            }
        }

        for (int i = 0; i < s; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(t2[i][j] + " ");
            }
            System.out.println();
        }

        text = "";
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < c; j++) {
                text += t2[i][j];
            }
        }


        x = ' ';
        System.out.println("\nРасшифровка стоблцов: ");
        for (
                int i = 0;
                i < s; i++) {
            for (int j = 0; j < c; j++) {
                t1[i][j] = t2[i][columns[j]];
            }
        }

        for (
                int i = 0;
                i < s; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(t1[i][j] + " ");
            }
            System.out.println();
        }

        x = ' ';
        System.out.println("\n\nРасшифровка строк: ");
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < c; j++) {
                t[i][j] = t1[str[i]][j];
            }
        }

        text = "";
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(t[i][j] + " ");
                text += t[i][j];
            }
            System.out.println();
        }

        System.out.println("Зашифрованная строка: " + text);
    }
}
