package Mafon;

public class Main {
    public static void main(String[] args){
        int v = 0;
        for(int i=11111;i<50000;i++){
            v += prov(i);
        }
        System.out.println("Всего цифр = " + v);
    }

    public static int prov(int t){
        boolean m = false;
        int k = 0;
        int v = 0;
        String x = String.valueOf(t);
        String[] str = new String[x.length()];
        String[] num = {"1","2","4","6"};
        for(int i=0;i<x.length();i++){
            str[i] = String.valueOf(x.charAt(i));
        }

        for(int i=0;i<str.length;i++){
            for(int j=0;j<num.length;j++){
                if(Integer.parseInt(str[i])==Integer.parseInt(num[j])){
                    k++;
                    break;
                }
            }
        }

        int n=0;
        if(k==5){
            for(int i=0;i<str.length;i++){
                for(int j=i+1;j<str.length;j++){
                    if(Integer.parseInt(str[i])==Integer.parseInt(str[j])){
                        n++;
                    }
                }
            }

            if(n<3) {
                for (int i = 0; i < str.length; i++) {
                    System.out.print(str[i]);
                }
                System.out.println();
            }
            return 1;
        }
        return 0;
    }
}
