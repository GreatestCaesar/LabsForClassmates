package b;

public class Zadanie1 {
    public static void main(String[] args){
        int ga11 = 1;
        int ga12 = 0;
        int ga13 = 0;
        int ga14 = 0;
        int gb11 = 1;
        int gb12 = 1;
        int gb13 = 1;
        int gb14 = 0;
        int ga21 = 0;
        int ga22 = 1;
        int ga23 = 0;
        int ga24 = 0;
        int gb21 = 1;
        int gb22 = 1;
        int gb23 = 0;
        int gb24 = 1;
        int ga31 = 0;
        int ga32 = 0;
        int ga33 = 1;
        int ga34 = 0;
        int gb31 = 1;
        int gb32 = 0;
        int gb33 = 1;
        int gb34 = 1;
        int ga41 = 0;
        int ga42 = 0;
        int ga43 = 0;
        int ga44 = 1;
        int gb41 = 0;
        int gb42 = 1;
        int gb43 = 1;
        int gb44 = 1;
        int a11 = 1;
        int a12 = 1;
        int a13 = 1;
        int a14 = 0;
        int b11 = 1;
        int b12 = 0;
        int b13 = 0;
        int b14 = 0;
        int a21 = 1;
        int a22 = 1;
        int a23 = 0;
        int a24 = 1;
        int b21 = 0;
        int b22 = 1;
        int b23 = 0;
        int b24 = 0;
        int a31 = 1;
        int a32 = 0;
        int a33 = 1;
        int a34 = 1;
        int b31 = 0;
        int b32 = 0;
        int b33 = 1;
        int b34 = 0;
        int a41 = 0;
        int a42 = 1;
        int a43 = 1;
        int a44 = 1;
        int b41 = 0;
        int b42 = 0;
        int b43 = 0;
        int b44 = 1;

        String str1,str2,str3,str4;
        int i1 = 0;
        if (gb11 != 1) {
            str1 = "";
        }
        else {
            str1 = "a1+";
            ++i1;
        }
        if (gb21 != 1) {
            str1 = str1;
        }
        else {
            str1 = String.valueOf(str1) + "a2" + "+";
            ++i1;
        }
        if (gb31 != 1) {
            if (i1 != 2) {
                str1 = str1;
            }
            else {
                str1 = "a1+a2";
            }
        }
        else {
            str1 = String.valueOf(str1) + "a3";
        }
        if (gb41 != 1) {
            str1 = str1;
        }
        else {
            str1 = String.valueOf(str1) + "+" + "a4";
        }
        i1 = 0;
        if (gb12 != 1) {
            str2 = "";
        }
        else {
            str2 = "a1+";
            ++i1;
        }
        if (gb22 != 1) {
            str2 = str2;
        }
        else {
            str2 = String.valueOf(str2) + "a2" + "+";
            ++i1;
        }
        if (gb32 != 1) {
            if (i1 != 2) {
                str2 = str2;
            }
            else {
                str2 = "a1+a2";
            }
        }
        else {
            str2 = String.valueOf(str2) + "a3";
        }
        if (gb42 != 1) {
            str2 = str2;
        }
        else {
            str2 = String.valueOf(str2) + "+" + "a4";
        }
        i1 = 0;
        if (gb13 != 1) {
            str3 = "";
        }
        else {
            str3 = "a1+";
            ++i1;
        }
        if (gb23 != 1) {
            str3 = str3;
        }
        else {
            str3 = String.valueOf(str3) + "a2" + "+";
            ++i1;
        }
        if (gb33 != 1) {
            if (i1 != 2) {
                str3 = str3;
            }
            else {
                str3 = "a1+a2";
            }
        }
        else {
            str3 = String.valueOf(str3) + "a3";
        }
        if (gb43 != 1) {
            str3 = str3;
        }
        else {
            str3 = String.valueOf(str3) + "+" + "a4";
        }
        i1 = 0;
        if (gb14 != 1) {
            str4 = "";
        }
        else {
            str4 = "a1+";
            ++i1;
        }
        if (gb24 != 1) {
            str4 = str4;
        }
        else {
            str4 = String.valueOf(str4) + "a2" + "+";
            ++i1;
        }
        if (gb34 != 1) {
            if (i1 != 2) {
                str4 = str4;
            }
            else {
                str4 = "a1+a2";
            }
        }
        else {
            str4 = String.valueOf(str4) + "a3";
        }
        if (gb44 != 1) {
            str4 = str4;
        }
        else {
            str4 = String.valueOf(str4) + "+" + "a4";
        }
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
