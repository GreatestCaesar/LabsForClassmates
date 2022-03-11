package a;

public class Zadanie5 {
    public static void main(String[] args){
        int ga11 = 1;
        int ga12 = 0;
        int ga13 = 0;
        int ga14 = 0;
        int gb11 = 0;
        int gb12 = 1;
        int gb13 = 1;
        int gb14 = 1;
        int ga21 = 0;
        int ga22 = 1;
        int ga23 = 0;
        int ga24 = 0;
        int gb21 = 1;
        int gb22 = 0;
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
        int a11 = 0;
        int a12 = 1;
        int a13 = 1;
        int a14 = 1;
        int b11 = 1;
        int b12 = 0;
        int b13 = 0;
        int b14 = 0;
        int a21 = 1;
        int a22 = 0;
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

        String str1, str2, str3, str4,str5;

        Label_20861: {
            if (ga11 + ga41 != 0) {
                if (ga11 + ga41 != 2) {
                    str1 = "1";
                    break Label_20861;
                }
            }
            str1 = "0";
        }
        Label_20955: {
            if (ga12 + ga42 != 0) {
                if (ga12 + ga42 != 2) {
                    str1 = String.valueOf(str1) + "1";
                    break Label_20955;
                }
            }
            str1 = String.valueOf(str1) + "0";
        }
        Label_21049: {
            if (ga13 + ga43 != 0) {
                if (ga13 + ga43 != 2) {
                    str1 = String.valueOf(str1) + "1";
                    break Label_21049;
                }
            }
            str1 = String.valueOf(str1) + "0";
        }
        Label_21143: {
            if (ga14 + ga44 != 0) {
                if (ga14 + ga44 != 2) {
                    str1 = String.valueOf(str1) + "1";
                    break Label_21143;
                }
            }
            str1 = String.valueOf(str1) + "0";
        }
        Label_21237: {
            if (gb11 + gb41 != 0) {
                if (gb11 + gb41 != 2) {
                    str1 = String.valueOf(str1) + "1";
                    break Label_21237;
                }
            }
            str1 = String.valueOf(str1) + "0";
        }
        Label_21331: {
            if (gb12 + gb42 != 0) {
                if (gb12 + gb42 != 2) {
                    str1 = String.valueOf(str1) + "1";
                    break Label_21331;
                }
            }
            str1 = String.valueOf(str1) + "0";
        }
        Label_21425: {
            if (gb13 + gb43 != 0) {
                if (gb13 + gb43 != 2) {
                    str1 = String.valueOf(str1) + "1";
                    break Label_21425;
                }
            }
            str1 = String.valueOf(str1) + "0";
        }
        Label_21519: {
            if (gb14 + gb44 != 0) {
                if (gb14 + gb44 != 2) {
                    str1 = String.valueOf(str1) + "1";
                    break Label_21519;
                }
            }
            str1 = String.valueOf(str1) + "0";
        }
        Label_21597: {
            if (ga11 + ga21 + ga41 != 0) {
                if (ga11 + ga21 + ga41 != 2) {
                    str2 = "1";
                    break Label_21597;
                }
            }
            str2 = "0";
        }
        Label_21711: {
            if (ga12 + ga22 + ga42 != 0) {
                if (ga12 + ga22 + ga42 != 2) {
                    str2 = String.valueOf(str2) + "1";
                    break Label_21711;
                }
            }
            str2 = String.valueOf(str2) + "0";
        }
        Label_21825: {
            if (ga13 + ga23 + ga43 != 0) {
                if (ga13 + ga23 + ga43 != 2) {
                    str2 = String.valueOf(str2) + "1";
                    break Label_21825;
                }
            }
            str2 = String.valueOf(str2) + "0";
        }
        Label_21939: {
            if (ga14 + ga24 + ga44 != 0) {
                if (ga14 + ga24 + ga44 != 2) {
                    str2 = String.valueOf(str2) + "1";
                    break Label_21939;
                }
            }
            str2 = String.valueOf(str2) + "0";
        }
        Label_22053: {
            if (gb11 + gb21 + gb41 != 0) {
                if (gb11 + gb21 + gb41 != 2) {
                    str2 = String.valueOf(str2) + "1";
                    break Label_22053;
                }
            }
            str2 = String.valueOf(str2) + "0";
        }
        Label_22167: {
            if (gb12 + gb22 + gb42 != 0) {
                if (gb12 + gb22 + gb42 != 2) {
                    str2 = String.valueOf(str2) + "1";
                    break Label_22167;
                }
            }
            str2 = String.valueOf(str2) + "0";
        }
        Label_22281: {
            if (gb13 + gb23 + gb43 != 0) {
                if (gb13 + gb23 + gb43 != 2) {
                    str2 = String.valueOf(str2) + "1";
                    break Label_22281;
                }
            }
            str2 = String.valueOf(str2) + "0";
        }
        Label_22395: {
            if (gb14 + gb24 + gb44 != 0) {
                if (gb14 + gb24 + gb44 != 2) {
                    str2 = String.valueOf(str2) + "1";
                    break Label_22395;
                }
            }
            str2 = String.valueOf(str2) + "0";
        }
        Label_22473: {
            if (ga31 + ga21 + ga41 != 0) {
                if (ga31 + ga21 + ga41 != 2) {
                    str3 = "1";
                    break Label_22473;
                }
            }
            str3 = "0";
        }
        Label_22587: {
            if (ga32 + ga22 + ga42 != 0) {
                if (ga32 + ga22 + ga42 != 2) {
                    str3 = String.valueOf(str3) + "1";
                    break Label_22587;
                }
            }
            str3 = String.valueOf(str3) + "0";
        }
        Label_22701: {
            if (ga33 + ga23 + ga43 != 0) {
                if (ga33 + ga23 + ga43 != 2) {
                    str3 = String.valueOf(str3) + "1";
                    break Label_22701;
                }
            }
            str3 = String.valueOf(str3) + "0";
        }
        Label_22815: {
            if (ga34 + ga24 + ga44 != 0) {
                if (ga34 + ga24 + ga44 != 2) {
                    str3 = String.valueOf(str3) + "1";
                    break Label_22815;
                }
            }
            str3 = String.valueOf(str3) + "0";
        }
        Label_22929: {
            if (gb31 + gb21 + gb41 != 0) {
                if (gb31 + gb21 + gb41 != 2) {
                    str3 = String.valueOf(str3) + "1";
                    break Label_22929;
                }
            }
            str3 = String.valueOf(str3) + "0";
        }
        Label_23043: {
            if (gb32 + gb22 + gb42 != 0) {
                if (gb32 + gb22 + gb42 != 2) {
                    str3 = String.valueOf(str3) + "1";
                    break Label_23043;
                }
            }
            str3 = String.valueOf(str3) + "0";
        }
        Label_23157: {
            if (gb33 + gb23 + gb43 != 0) {
                if (gb33 + gb23 + gb43 != 2) {
                    str3 = String.valueOf(str3) + "1";
                    break Label_23157;
                }
            }
            str3 = String.valueOf(str3) + "0";
        }
        Label_23271: {
            if (gb34 + gb24 + gb44 != 0) {
                if (gb34 + gb24 + gb44 != 2) {
                    str3 = String.valueOf(str3) + "1";
                    break Label_23271;
                }
            }
            str3 = String.valueOf(str3) + "0";
        }
        Label_23349: {
            if (ga11 + ga21 + ga31 != 0) {
                if (ga11 + ga21 + ga31 != 2) {
                    str4 = "1";
                    break Label_23349;
                }
            }
            str4 = "0";
        }
        Label_23463: {
            if (ga12 + ga22 + ga32 != 0) {
                if (ga12 + ga22 + ga32 != 2) {
                    str4 = String.valueOf(str4) + "1";
                    break Label_23463;
                }
            }
            str4 = String.valueOf(str4) + "0";
        }
        Label_23577: {
            if (ga13 + ga23 + ga33 != 0) {
                if (ga13 + ga23 + ga33 != 2) {
                    str4 = String.valueOf(str4) + "1";
                    break Label_23577;
                }
            }
            str4 = String.valueOf(str4) + "0";
        }
        Label_23691: {
            if (ga14 + ga24 + ga34 != 0) {
                if (ga14 + ga24 + ga34 != 2) {
                    str4 = String.valueOf(str4) + "1";
                    break Label_23691;
                }
            }
            str4 = String.valueOf(str4) + "0";
        }
        Label_23805: {
            if (gb11 + gb21 + gb31 != 0) {
                if (gb11 + gb21 + gb31 != 2) {
                    str4 = String.valueOf(str4) + "1";
                    break Label_23805;
                }
            }
            str4 = String.valueOf(str4) + "0";
        }
        Label_23919: {
            if (gb12 + gb22 + gb32 != 0) {
                if (gb12 + gb22 + gb32 != 2) {
                    str4 = String.valueOf(str4) + "1";
                    break Label_23919;
                }
            }
            str4 = String.valueOf(str4) + "0";
        }
        Label_24033: {
            if (gb13 + gb23 + gb33 != 0) {
                if (gb13 + gb23 + gb33 != 2) {
                    str4 = String.valueOf(str4) + "1";
                    break Label_24033;
                }
            }
            str4 = String.valueOf(str4) + "0";
        }
        Label_24147: {
            if (gb14 + gb24 + gb34 != 0) {
                if (gb14 + gb24 + gb34 != 2) {
                    str4 = String.valueOf(str4) + "1";
                    break Label_24147;
                }
            }
            str4 = String.valueOf(str4) + "0";
        }
        Label_24209: {
            if (ga21 + ga41 != 0) {
                if (ga21 + ga41 != 2) {
                    str5 = "1";
                    break Label_24209;
                }
            }
            str5 = "0";
        }
        Label_24307: {
            if (ga22 + ga42 != 0) {
                if (ga22 + ga42 != 2) {
                    str5 = String.valueOf(str5) + "1";
                    break Label_24307;
                }
            }
            str5 = String.valueOf(str5) + "0";
        }
        Label_24405: {
            if (ga23 + ga43 != 0) {
                if (ga23 + ga43 != 2) {
                    str5 = String.valueOf(str5) + "1";
                    break Label_24405;
                }
            }
            str5 = String.valueOf(str5) + "0";
        }
        Label_24503: {
            if (ga24 + ga44 != 0) {
                if (ga24 + ga44 != 2) {
                    str5 = String.valueOf(str5) + "1";
                    break Label_24503;
                }
            }
            str5 = String.valueOf(str5) + "0";
        }
        Label_24601: {
            if (gb21 + gb41 != 0) {
                if (gb21 + gb41 != 2) {
                    str5 = String.valueOf(str5) + "1";
                    break Label_24601;
                }
            }
            str5 = String.valueOf(str5) + "0";
        }
        Label_24699: {
            if (gb22 + gb42 != 0) {
                if (gb22 + gb42 != 2) {
                    str5 = String.valueOf(str5) + "1";
                    break Label_24699;
                }
            }
            str5 = String.valueOf(str5) + "0";
        }
        Label_24797: {
            if (gb23 + gb43 != 0) {
                if (gb23 + gb43 != 2) {
                    str5 = String.valueOf(str5) + "1";
                    break Label_24797;
                }
            }
            str5 = String.valueOf(str5) + "0";
        }
        Label_24895: {
            if (gb24 + gb44 != 0) {
                if (gb24 + gb44 != 2) {
                    str5 = String.valueOf(str5) + "1";
                    break Label_24895;
                }
            }
            str5 = String.valueOf(str5) + "0";
        }

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
    }
}
