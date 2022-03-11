package Str;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String text = "Когда злы, на глаза им не попадайся. Пробираюсь по стеночке в парусиновых туфлях, тихо, как мышь, но их специальная аппаратура " +
                "засекает мой страх: поднимают головы, все трое разом, глаза горят на черных лицах, как лампы в старом приемнике. " +
                "— Вон он, вождь. Главный вождь, ребята. Вождь швабра. Поди‑ка, вождек. " +
                "Суют мне тряпку, показывают, где сегодня мыть, и я иду. Один огрел меня сзади по ногам щеткой: шевелись.";
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
