package Str;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String text = "Черные в белых костюмах, встали раньше меня, справят половую нужду в коридоре и подотрут, пока я их не накрыл.";
        String[] symb = text.split(" ");
        String l="";
        char s;
        int n;
        System.out.println("Строка: " + text);
        System.out.println("Введите номер символа, который хотите заменить(начиная от 1): ");
        n = scan.nextInt();
        System.out.println("Введите символ, на который хотите заменить: ");
        s = scan.next().charAt(0);
        for (int i=0;i<symb.length;i++){
            if(symb[i].length()<n){

            }else{
                for(int j=0;j<(n-1);j++){
                    l+=symb[i].charAt(j);
                }
                l+=s;
                for(int v=n;v<symb[i].length();v++){
                    l+=symb[i].charAt(v);
                }
                symb[i] = l;
                l="";
            }
        }
        for(int i=0;i< symb.length;i++){
            System.out.print(symb[i] + " ");
        }
    }
}
