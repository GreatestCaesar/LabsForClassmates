package First_Tusk;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String P_x = "", Q_x = "";
        int x = 0;
        LinkList Q = new LinkList();
        LinkList P = new LinkList();
        LinkList r = new LinkList();

        System.out.print("Введите многочлен P(x) - ");
        P_x = scanner.nextLine();
        System.out.print("Введите многочлен Q(x) - ");
        Q_x = scanner.nextLine();

        P = elements(P_x, P);
        Q = elements(Q_x, Q);

        P.displayList();
        Q.displayList();

        if(P.equality(Q)){
            System.out.println("Многочлены равны");
        }else{
            System.out.println("Многочлены не равны");
        }

        System.out.println("Введите х, для которого хотите найти значения многочлена P и Q:");
        x = scanner.nextInt();
        System.out.print("P - ");
        P.meaning(x);
        System.out.print("Q - ");
        Q.meaning(x);

        r.add(P,Q,r);
        r.displayList();
    }

    public static LinkList elements(String s, LinkList Link){
        int i=0,k=0,t=0;
        String txt="";
        ArrayList<String> elem = new ArrayList<>();

        if(s.charAt(0)=='-'){
            for(i=1;i<s.length();i++){
                if(s.charAt(i) == '-' || s.charAt(i) == '+'){
                    elem.add(s.substring(0,i));
                    s = s.substring(i,s.length());
                    break;
                }
            }
        }else{
            for(i=0;i<s.length();i++){
                if(s.charAt(i) == '-' || s.charAt(i) == '+'){
                    elem.add(s.substring(0,i));
                    s = s.substring(i,s.length());
                    break;
                }
            }
        }

        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='-' || s.charAt(i)=='+'){
                for(int j=i+1;j<s.length();j++) {
                    if ( s.charAt(j) == '+' || s.charAt(j) == '-' ) {
                        elem.add(s.substring(i,j));
                        break;
                    }
                    if(j==s.length()-1){
                        elem.add(s.substring(i,s.length()));
                    }
                }
            }
        }

        for(i=0;i<elem.size();i++){
            if(elem.get(i).contains("x")){
                if(elem.get(i).contains("^")){
                    if(elem.get(i).charAt(elem.get(i).lastIndexOf('x')-1)=='-' || elem.get(i).charAt(elem.get(i).lastIndexOf('x')-1)=='+') {
                        t = Integer.parseInt(elem.get(i).substring(elem.get(i).lastIndexOf('^') + 1));
                        Link.insertFirst(Integer.parseInt(elem.get(i).charAt(elem.get(i).lastIndexOf('x') - 1) + "1"), t);
                    }else {
                        k = Integer.parseInt(elem.get(i).substring(0, elem.get(i).lastIndexOf('x')));
                        t = Integer.parseInt(elem.get(i).substring(elem.get(i).lastIndexOf('^') + 1, elem.get(i).length()));
                        Link.insertFirst(k,t);
                    }
                }else{
                    if(elem.get(i).charAt(elem.get(i).lastIndexOf('x')-1)=='-' || elem.get(i).charAt(elem.get(i).lastIndexOf('x')-1)=='+'){
                        Link.insertFirst(Integer.parseInt(elem.get(i).charAt(elem.get(i).lastIndexOf('x')-1)+"1"),1);
                    }else {
                        k = Integer.parseInt(elem.get(i).substring(0, elem.get(i).lastIndexOf('x')));
                        Link.insertFirst(k, 1);
                    }
                }
                //Link.insertFirst();
            }else{
                k=Integer.parseInt(elem.get(i));
                Link.insertFirst(k,0);
            }
        }

        return Link;
    }
} // Конец класса LinkListApp
////////////////////////////////////////////////////////////////

/*
* 2x^4-4x^3+5
Введите многочлен Q(x) - 3x^4+2x^2+5x
* */