package Str;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String text = "Они там. " +
                "Черные в белых костюмах, встали раньше меня, справят половую нужду в коридоре и подотрут, пока я их не накрыл. " +
                "Подтирают, когда я выхожу из спальни: трое, угрюмы, злы на все — на утро, на этот дом, на тех, при ком работают. ";
        char[] alp = {'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ'};
        String[] newtext;
        String words = "";
        boolean k=false;
        int n=0;

        System.out.print("Введите длину слов, которые хотите удалить: ");
        n = s.nextInt();
        newtext = text.split(" ");

        for(int i=0;i<newtext.length;i++){
            k = false;
            if(newtext[i].length()==n) {
                for(int j=0;j<alp.length;j++){
                    if (String.valueOf(newtext[i].charAt(0)).equalsIgnoreCase(String.valueOf(alp[j]))) {
                        k = true;
                        break;
                    }
                }
            }
            if(!k){
                words+=newtext[i]+" ";
            }
        }
        System.out.println("Новый текст: "+ words);
    }
}
