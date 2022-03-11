import java.util.ArrayList;
import java.util.Scanner;

public class Alg {
    public static void main(String[] args){
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        a.add("127140");
        a.add("066364");
        a.add("056271");
        a.add("126720");
        a.add("053460");
        a.add("133172");
        a.add("027427");
        a.add("153350");
        System.out.println("Результат: ");
        for(int i=0;i<a.size();i++){
            System.out.println("Строка " + (i+1) + ": "+ a.get(i));
        }
        System.out.println("\nШаг 2: ");
        for(int i=0;i<a.size();i++){
            System.out.print("Строка " + (i+1) + ": ");
            a.set(i,num(a.get(i)));
            System.out.println(a.get(i));
        }
        for(int i=0;i<8;i++){
            b.add(a.get(i).substring(0,8));
            b.add(a.get(i).substring(8,16));
        }

        System.out.println("\nШаг 3: ");
        for(int i=0;i<b.size();i++){
            System.out.println("Строка " + (i+1) + ": " + b.get(i));
        }
        System.out.println("\nШаг 4: ");
        for(int i=0;i<b.size();i++){
            c.add(ten(b.get(i)));
        }
        for(int i=0;i<c.size();i++){
            System.out.println("Строка " + (i+1) + ": " + c.get(i));
        }
        int o=c.get(0);
        System.out.println("\nШаг 5: ");
        for(int i=1;i<c.size();i++){
            System.out.print(i+". " + o + " + " + c.get(i) + " = ");
            o+=c.get(i);
            System.out.println(o);
            if(o>255){
                System.out.print("! " + o + " - 256 = ");
                o-=256;
                System.out.println(o);
            }
        }
        //o%=256;
        System.out.println("Число равно: " + o);
        String x = "";
        int m = 0;
        while(o!=0){
            m = o%2;
            x += m;
            o/=2;
        }
        String v = "";
        int j = x.length()-1;
        for(int i=0;i<x.length();i++){
            v += String.valueOf(x.charAt(j));
            j--;
        }
        System.out.println("Число в двоичной системе равно: " + v);
        System.out.println("\nШаг 6: ");
        System.out.println("  " + ten(v.substring(0,2)) + "    " + ten(v.substring(2,5)) + "    " + ten(v.substring(5,8)));
        System.out.println("(" + v.substring(0,2) + ") (" + v.substring(2,5) + ") (" + v.substring(5,8) + ")");
    }

    public static String num(String n){
        int[] r = new int[6];
        r[0] = Integer.parseInt(String.valueOf(n.charAt(0)));
        int z;
        String s = ""+r[0];
        for(int i=1;i<r.length;i++){
            int l = Integer.parseInt(String.valueOf(n.charAt(i)));
            s += binary(l);
        }
        return s;
    }

    public static String binary(int n){
        String s = "";
        switch (n){
            case 0:{
                s = "000";
                break;
            }
            case 1:{
                s = "001";
                break;
            }
            case 2:{
                s = "010";
                break;
            }
            case 3:{
                s = "011";
                break;
            }
            case 4:{
                s = "100";
                break;
            }
            case 5:{
                s = "101";
                break;
            }
            case 6:{
                s = "110";
                break;
            }
            case 7:{
                s = "111";
                break;
            }
        }
        return s;
    }

    public static Integer ten(String s){
        int k = 0, d = s.length()-1;
        int[] p = new int[s.length()];
        for(int i=0;i<p.length;i++){
            p[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
            k += (Math.pow(2,d))*p[i];
            d--;
        }
        return k;
    }
}
