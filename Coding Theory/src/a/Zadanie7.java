package a;

public class Zadanie7 {
    public static void main(String[] args){
        int ga11 = 1;
        int ga12 = 0;
        int ga13 = 0;
        int ga14 = 0;
        int gb11 = 1;
        int gb12 = 0;
        int gb13 = 1;
        int gb14 = 1;
        int ga21 = 0;
        int ga22 = 1;
        int ga23 = 0;
        int ga24 = 0;
        int gb21 = 0;
        int gb22 = 1;
        int gb23 = 1;
        int gb24 = 1;
        int ga31 = 0;
        int ga32 = 0;
        int ga33 = 1;
        int ga34 = 0;
        int gb31 = 1;
        int gb32 = 1;
        int gb33 = 1;
        int gb34 = 0;
        int ga41 = 0;
        int ga42 = 0;
        int ga43 = 0;
        int ga44 = 1;
        int gb41 = 1;
        int gb42 = 1;
        int gb43 = 0;
        int gb44 = 1;
        int a11 = 1;
        int a12 = 0;
        int a13 = 1;
        int a14 = 1;
        int b11 = 1;
        int b12 = 0;
        int b13 = 0;
        int b14 = 0;
        int a21 = 0;
        int a22 = 1;
        int a23 = 1;
        int a24 = 1;
        int b21 = 0;
        int b22 = 1;
        int b23 = 0;
        int b24 = 0;
        int a31 = 1;
        int a32 = 1;
        int a33 = 1;
        int a34 = 0;
        int b31 = 0;
        int b32 = 0;
        int b33 = 1;
        int b34 = 0;
        int a41 = 1;
        int a42 = 1;
        int a43 = 0;
        int a44 = 1;
        int b41 = 0;
        int b42 = 0;
        int b43 = 0;
        int b44 = 1;

        String str1, str2, str3, str4, str5;
        String string1 = new String();
        string1 = "";
        String string2 = new String();
        string2 = "";
        String string3 = new String();
        string3 = "";
        String string4 = new String();
        string4 = "";
        String s1 = new String();
        s1 = "";
        String s2 = new String();
        s2 = "";
        String s3 = new String();
        s3 = "";
        String s4 = new String();
        s4 = "";
        String s5 = new String();
        s5 = "";
        Label_25830: {
            if (a11 + b12 + b13 != 0) {
                if (a11 + b12 + b13 != 2) {
                    string1 = "1";
                    break Label_25830;
                }
            }
            string1 = "0";
        }
        Label_25908: {
            if (a21 + b22 + b23 != 0) {
                if (a21 + b22 + b23 != 2) {
                    string2 = "1";
                    break Label_25908;
                }
            }
            string2 = "0";
        }
        Label_25986: {
            if (a31 + b32 + b33 != 0) {
                if (a31 + b32 + b33 != 2) {
                    string3 = "1";
                    break Label_25986;
                }
            }
            string3 = "0";
        }
        Label_26064: {
            if (a41 + b42 + b43 != 0) {
                if (a41 + b42 + b43 != 2) {
                    string4 = "1";
                    break Label_26064;
                }
            }
            string4 = "0";
        }
        str1 = String.valueOf(string1) + string2 + string3 + string4;
        if (!str1.equals(String.valueOf(String.valueOf(a11)) + String.valueOf(a21) + String.valueOf(a31) + String.valueOf(a41))) {
            if (!str1.equals(String.valueOf(String.valueOf(a12)) + String.valueOf(a22) + String.valueOf(a32) + String.valueOf(a42))) {
                if (!str1.equals(String.valueOf(String.valueOf(a13)) + String.valueOf(a23) + String.valueOf(a33) + String.valueOf(a43))) {
                    if (!str1.equals(String.valueOf(String.valueOf(a14)) + String.valueOf(a24) + String.valueOf(a34) + String.valueOf(a44))) {
                        s1 = "1000";
                    }
                    else {
                        s1 = "1001";
                    }
                }
                else {
                    s1 = "1010";
                }
            }
            else {
                s1 = "1100";
            }
        }
        else {
            s1 = "0000";
        }
        string1 = "";
        string2 = "";
        string3 = "";
        string4 = "";
        Label_26610: {
            if (a11 + a12 + a13 + a14 + b14 != 0) {
                if (a11 + a12 + a13 + a14 + b14 != 2) {
                    if (a11 + a12 + a13 + a14 + b14 != 4) {
                        string1 = "1";
                        break Label_26610;
                    }
                }
            }
            string1 = "0";
        }
        Label_26768: {
            if (a21 + a22 + a23 + a24 + b24 != 0) {
                if (a21 + a22 + a23 + a24 + b24 != 2) {
                    if (a21 + a22 + a23 + a24 + b24 != 4) {
                        string2 = "1";
                        break Label_26768;
                    }
                }
            }
            string2 = "0";
        }
        Label_26926: {
            if (a31 + a32 + a33 + a34 + b34 != 0) {
                if (a31 + a32 + a33 + a34 + b34 != 2) {
                    if (a31 + a32 + a33 + a34 + b34 != 4) {
                        string3 = "1";
                        break Label_26926;
                    }
                }
            }
            string3 = "0";
        }
        Label_27084: {
            if (a41 + a42 + a43 + a44 + b44 != 0) {
                if (a41 + a42 + a43 + a44 + b44 != 2) {
                    if (a41 + a42 + a43 + a44 + b44 != 4) {
                        string4 = "1";
                        break Label_27084;
                    }
                }
            }
            string4 = "0";
        }
        str2 = String.valueOf(string1) + string2 + string3 + string4;
        if (!str2.equals(String.valueOf(String.valueOf(a11)) + String.valueOf(a21) + String.valueOf(a31) + String.valueOf(a41))) {
            if (!str2.equals(String.valueOf(String.valueOf(a12)) + String.valueOf(a22) + String.valueOf(a32) + String.valueOf(a42))) {
                if (!str2.equals(String.valueOf(String.valueOf(a13)) + String.valueOf(a23) + String.valueOf(a33) + String.valueOf(a43))) {
                    if (!str2.equals(String.valueOf(String.valueOf(a14)) + String.valueOf(a24) + String.valueOf(a34) + String.valueOf(a44))) {
                        s2 = "1111";
                    }
                    else {
                        s2 = "1110";
                    }
                }
                else {
                    s2 = "1101";
                }
            }
            else {
                s2 = "1011";
            }
        }
        else {
            s2 = "0111";
        }
        string1 = "";
        string2 = "";
        string3 = "";
        string4 = "";
        Label_27635: {
            if (a11 + a12 + a14 + b11 + b14 != 0) {
                if (a11 + a12 + a14 + b11 + b14 != 2) {
                    if (a11 + a12 + a14 + b11 + b14 != 4) {
                        string1 = "1";
                        break Label_27635;
                    }
                }
            }
            string1 = "0";
        }
        Label_27793: {
            if (a21 + a22 + a24 + b21 + b24 != 0) {
                if (a21 + a22 + a24 + b21 + b24 != 2) {
                    if (a21 + a22 + a24 + b21 + b24 != 4) {
                        string2 = "1";
                        break Label_27793;
                    }
                }
            }
            string2 = "0";
        }
        Label_27951: {
            if (a31 + a32 + a34 + b31 + b34 != 0) {
                if (a31 + a32 + a34 + b31 + b34 != 2) {
                    if (a31 + a32 + a34 + b31 + b34 != 4) {
                        string3 = "1";
                        break Label_27951;
                    }
                }
            }
            string3 = "0";
        }
        Label_28109: {
            if (a41 + a42 + a44 + b41 + b44 != 0) {
                if (a41 + a42 + a44 + b41 + b44 != 2) {
                    if (a41 + a42 + a44 + b41 + b44 != 4) {
                        string4 = "1";
                        break Label_28109;
                    }
                }
            }
            string4 = "0";
        }
        str3 = String.valueOf(string1) + string2 + string3 + string4;
        if (!str3.equals(a11 + a21 + a31 + a41)) {
            if (!str3.equals(String.valueOf(String.valueOf(a12)) + String.valueOf(a22) + String.valueOf(a32) + String.valueOf(a42))) {
                if (!str3.equals(String.valueOf(String.valueOf(a13)) + String.valueOf(a23) + String.valueOf(a33) + String.valueOf(a43))) {
                    if (!str3.equals(String.valueOf(String.valueOf(a14)) + String.valueOf(a24) + String.valueOf(a34) + String.valueOf(a44))) {
                        s3 = "1101";
                    }
                    else {
                        s3 = "1100";
                    }
                }
                else {
                    s3 = "1111";
                }
            }
            else {
                s3 = "1001";
            }
        }
        else {
            s3 = "0101";
        }
        string1 = "";
        string2 = "";
        string3 = "";
        string4 = "";
        Label_28632: {
            if (a12 + a13 + a14 + b12 + b13 != 0) {
                if (a12 + a13 + a14 + b12 + b13 != 2) {
                    if (a12 + a13 + a14 + b12 + b13 != 4) {
                        string1 = "1";
                        break Label_28632;
                    }
                }
            }
            string1 = "0";
        }
        Label_28790: {
            if (a22 + a23 + a24 + b22 + b23 != 0) {
                if (a22 + a23 + a24 + b22 + b23 != 2) {
                    if (a22 + a23 + a24 + b22 + b23 != 4) {
                        string2 = "1";
                        break Label_28790;
                    }
                }
            }
            string2 = "0";
        }
        Label_28936: {
            if (a32 + 313 + a34 + b32 + b33 != 0) {
                if (a32 + 313 + a34 + b32 + b33 != 2) {
                    if (a32 + 313 + a34 + b32 + b33 != 4) {
                        string3 = "1";
                        break Label_28936;
                    }
                }
            }
            string3 = "0";
        }
        Label_29094: {
            if (a42 + a43 + a44 + b42 + b43 != 0) {
                if (a42 + a43 + a44 + b42 + b43 != 2) {
                    if (a42 + a43 + a44 + b42 + b43 != 4) {
                        string4 = "1";
                        break Label_29094;
                    }
                }
            }
            string4 = "0";
        }
        str4 = String.valueOf(string1) + string2 + string3 + string4;
        if (!str4.equals(String.valueOf(String.valueOf(a11)) + String.valueOf(a21) + String.valueOf(a31) + String.valueOf(a41))) {
            if (!str4.equals(String.valueOf(String.valueOf(a12)) + String.valueOf(a22) + String.valueOf(a32) + String.valueOf(a42))) {
                if (!str4.equals(String.valueOf(String.valueOf(a13)) + String.valueOf(a23) + String.valueOf(a33) + String.valueOf(a43))) {
                    if (!str4.equals(String.valueOf(String.valueOf(a14)) + String.valueOf(a24) + String.valueOf(a34) + String.valueOf(a44))) {
                        s4 = "0111";
                    }
                    else {
                        s4 = "0110";
                    }
                }
                else {
                    s4 = "0101";
                }
            }
            else {
                s4 = "0011";
            }
        }
        else {
            s4 = "1111";
        }
        string1 = "";
        string2 = "";
        string3 = "";
        string4 = "";
        Label_29758: {
            if (a11 + a13 + a14 + b11 + b12 + b13 + b14 != 0) {
                if (a11 + a13 + a14 + b11 + b12 + b13 + b14 != 2) {
                    if (a11 + a13 + a14 + b11 + b12 + b13 + b14 != 4) {
                        if (a11 + a13 + a14 + b11 + b12 + b13 + b14 != 6) {
                            string1 = "1";
                            break Label_29758;
                        }
                    }
                }
            }
            string1 = "0";
        }
        Label_30029: {
            if (a21 + a23 + a24 + b21 + b22 + b23 + b24 != 0) {
                if (a21 + a23 + a24 + b21 + b22 + b23 + b24 != 2) {
                    if (a21 + a23 + a24 + b21 + b22 + b23 + b24 != 4) {
                        if (a21 + a23 + a24 + b21 + b22 + b23 + b24 != 6) {
                            string2 = "1";
                            break Label_30029;
                        }
                    }
                }
            }
            string2 = "0";
        }
        Label_30300: {
            if (a31 + a33 + a34 + b31 + b32 + b33 + b34 != 0) {
                if (a31 + a33 + a34 + b31 + b32 + b33 + b34 != 2) {
                    if (a31 + a33 + a34 + b31 + b32 + b33 + b34 != 4) {
                        if (a31 + a33 + a34 + b31 + b32 + b33 + b34 != 6) {
                            string3 = "1";
                            break Label_30300;
                        }
                    }
                }
            }
            string3 = "0";
        }
        Label_30571: {
            if (a41 + a43 + a44 + b41 + b42 + b43 + b44 != 0) {
                if (a41 + a43 + a44 + b41 + b42 + b43 + b44 != 2) {
                    if (a41 + a43 + a44 + b41 + b42 + b43 + b44 != 4) {
                        if (a41 + a43 + a44 + b41 + b42 + b43 + b44 != 6) {
                            string4 = "1";
                            break Label_30571;
                        }
                    }
                }
            }
            string4 = "0";
        }
        str5 = String.valueOf(string1) + string2 + string3 + string4;
        if (!str5.equals(String.valueOf(String.valueOf(a11)) + String.valueOf(a21) + String.valueOf(a31) + String.valueOf(a41))) {
            if (!str5.equals(String.valueOf(String.valueOf(a12)) + String.valueOf(a22) + String.valueOf(a32) + String.valueOf(a42))) {
                if (!str5.equals(String.valueOf(String.valueOf(a13)) + String.valueOf(a23) + String.valueOf(a33) + String.valueOf(a43))) {
                    if (!str5.equals(String.valueOf(String.valueOf(a14)) + String.valueOf(a24) + String.valueOf(a34) + String.valueOf(a44))) {
                        s5 = "1011";
                    }
                    else {
                        s5 = "1010";
                    }
                }
                else {
                    s5 = "1001";
                }
            }
            else {
                s5 = "1111";
            }
        }
        else {
            s5 = "0011";
        }

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }
}
