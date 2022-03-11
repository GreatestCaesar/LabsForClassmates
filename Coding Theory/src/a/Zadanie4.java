package a;

public class Zadanie4 {
    public static void main(String[] args) {
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

        String str1, str2, str3, str4,str5,str6,str7,str8,str9,str10,str11,str12,str13,str14,str15,str16;

        str1 = "11111111";
        Label_3472: {
            if (ga11 + ga21 + ga31 != 0) {
                if (ga11 + ga21 + ga31 != 2) {
                    str2 = "1";
                    break Label_3472;
                }
            }
            str2 = "0";
        }
        Label_3586: {
            if (ga12 + ga22 + ga32 != 0) {
                if (ga12 + ga22 + ga32 != 2) {
                    str2 = String.valueOf(str2) + "1";
                    break Label_3586;
                }
            }
            str2 = String.valueOf(str2) + "0";
        }
        Label_3700: {
            if (ga13 + ga23 + ga33 != 0) {
                if (ga13 + ga23 + ga33 != 2) {
                    str2 = String.valueOf(str2) + "1";
                    break Label_3700;
                }
            }
            str2 = String.valueOf(str2) + "0";
        }
        Label_3814: {
            if (ga14 + ga24 + ga34 != 0) {
                if (ga14 + ga24 + ga34 != 2) {
                    str2 = String.valueOf(str2) + "1";
                    break Label_3814;
                }
            }
            str2 = String.valueOf(str2) + "0";
        }
        Label_3928: {
            if (gb11 + gb21 + gb31 != 0) {
                if (gb11 + gb21 + gb31 != 2) {
                    str2 = String.valueOf(str2) + "1";
                    break Label_3928;
                }
            }
            str2 = String.valueOf(str2) + "0";
        }
        Label_4042: {
            if (gb12 + gb22 + gb32 != 0) {
                if (gb12 + gb22 + gb32 != 2) {
                    str2 = String.valueOf(str2) + "1";
                    break Label_4042;
                }
            }
            str2 = String.valueOf(str2) + "0";
        }
        Label_4156: {
            if (gb13 + gb23 + gb33 != 0) {
                if (gb13 + gb23 + gb33 != 2) {
                    str2 = String.valueOf(str2) + "1";
                    break Label_4156;
                }
            }
            str2 = String.valueOf(str2) + "0";
        }
        Label_4270: {
            if (gb14 + gb24 + gb34 != 0) {
                if (gb14 + gb24 + gb34 != 2) {
                    str2 = String.valueOf(str2) + "1";
                    break Label_4270;
                }
            }
            str2 = String.valueOf(str2) + "0";
        }
        Label_4348: {
            if (ga11 + ga21 + ga41 != 0) {
                if (ga11 + ga21 + ga41 != 2) {
                    str3 = "1";
                    break Label_4348;
                }
            }
            str3 = "0";
        }
        Label_4462: {
            if (ga12 + ga22 + ga42 != 0) {
                if (ga12 + ga22 + ga42 != 2) {
                    str3 = String.valueOf(str3) + "1";
                    break Label_4462;
                }
            }
            str3 = String.valueOf(str3) + "0";
        }
        Label_4576: {
            if (ga13 + ga23 + ga43 != 0) {
                if (ga13 + ga23 + ga43 != 2) {
                    str3 = String.valueOf(str3) + "1";
                    break Label_4576;
                }
            }
            str3 = String.valueOf(str3) + "0";
        }
        Label_4690: {
            if (ga14 + ga24 + ga44 != 0) {
                if (ga14 + ga24 + ga44 != 2) {
                    str3 = String.valueOf(str3) + "1";
                    break Label_4690;
                }
            }
            str3 = String.valueOf(str3) + "0";
        }
        Label_4804: {
            if (gb11 + gb21 + gb41 != 0) {
                if (gb11 + gb21 + gb41 != 2) {
                    str3 = String.valueOf(str3) + "1";
                    break Label_4804;
                }
            }
            str3 = String.valueOf(str3) + "0";
        }
        Label_4918: {
            if (gb12 + gb22 + gb42 != 0) {
                if (gb12 + gb22 + gb42 != 2) {
                    str3 = String.valueOf(str3) + "1";
                    break Label_4918;
                }
            }
            str3 = String.valueOf(str3) + "0";
        }
        Label_5032: {
            if (gb13 + gb23 + gb43 != 0) {
                if (gb13 + gb23 + gb43 != 2) {
                    str3 = String.valueOf(str3) + "1";
                    break Label_5032;
                }
            }
            str3 = String.valueOf(str3) + "0";
        }
        Label_5146: {
            if (gb14 + gb24 + gb44 != 0) {
                if (gb14 + gb24 + gb44 != 2) {
                    str3 = String.valueOf(str3) + "1";
                    break Label_5146;
                }
            }
            str3 = String.valueOf(str3) + "0";
        }
        Label_5224: {
            if (ga11 + ga31 + ga41 != 0) {
                if (ga11 + ga31 + ga41 != 2) {
                    str4 = "1";
                    break Label_5224;
                }
            }
            str4 = "0";
        }
        Label_5338: {
            if (ga12 + ga32 + ga42 != 0) {
                if (ga12 + ga32 + ga42 != 2) {
                    str4 = String.valueOf(str4) + "1";
                    break Label_5338;
                }
            }
            str4 = String.valueOf(str4) + "0";
        }
        Label_5452: {
            if (ga13 + ga33 + ga43 != 0) {
                if (ga13 + ga33 + ga43 != 2) {
                    str4 = String.valueOf(str4) + "1";
                    break Label_5452;
                }
            }
            str4 = String.valueOf(str4) + "0";
        }
        Label_5566: {
            if (ga14 + ga34 + ga44 != 0) {
                if (ga14 + ga34 + ga44 != 2) {
                    str4 = String.valueOf(str4) + "1";
                    break Label_5566;
                }
            }
            str4 = String.valueOf(str4) + "0";
        }
        Label_5680: {
            if (gb11 + gb31 + gb41 != 0) {
                if (gb11 + gb31 + gb41 != 2) {
                    str4 = String.valueOf(str4) + "1";
                    break Label_5680;
                }
            }
            str4 = String.valueOf(str4) + "0";
        }
        Label_5794: {
            if (gb12 + gb32 + gb42 != 0) {
                if (gb12 + gb32 + gb42 != 2) {
                    str4 = String.valueOf(str4) + "1";
                    break Label_5794;
                }
            }
            str4 = String.valueOf(str4) + "0";
        }
        Label_5908: {
            if (gb13 + gb33 + gb43 != 0) {
                if (gb13 + gb33 + gb43 != 2) {
                    str4 = String.valueOf(str4) + "1";
                    break Label_5908;
                }
            }
            str4 = String.valueOf(str4) + "0";
        }
        Label_6022: {
            if (gb14 + gb34 + gb44 != 0) {
                if (gb14 + gb34 + gb44 != 2) {
                    str4 = String.valueOf(str4) + "1";
                    break Label_6022;
                }
            }
            str4 = String.valueOf(str4) + "0";
        }
        Label_6100: {
            if (ga21 + ga31 + ga41 != 0) {
                if (ga21 + ga31 + ga41 != 2) {
                    str5 = "1";
                    break Label_6100;
                }
            }
            str5 = "0";
        }
        Label_6214: {
            if (ga22 + ga32 + ga42 != 0) {
                if (ga22 + ga32 + ga42 != 2) {
                    str5 = String.valueOf(str5) + "1";
                    break Label_6214;
                }
            }
            str5 = String.valueOf(str5) + "0";
        }
        Label_6328: {
            if (ga23 + ga33 + ga43 != 0) {
                if (ga23 + ga33 + ga43 != 2) {
                    str5 = String.valueOf(str5) + "1";
                    break Label_6328;
                }
            }
            str5 = String.valueOf(str5) + "0";
        }
        Label_6442: {
            if (ga24 + ga34 + ga44 != 0) {
                if (ga24 + ga34 + ga44 != 2) {
                    str5 = String.valueOf(str5) + "1";
                    break Label_6442;
                }
            }
            str5 = String.valueOf(str5) + "0";
        }
        Label_6556: {
            if (gb21 + gb31 + gb41 != 0) {
                if (gb21 + gb31 + gb41 != 2) {
                    str5 = String.valueOf(str5) + "1";
                    break Label_6556;
                }
            }
            str5 = String.valueOf(str5) + "0";
        }
        Label_6670: {
            if (gb22 + gb32 + gb42 != 0) {
                if (gb22 + gb32 + gb42 != 2) {
                    str5 = String.valueOf(str5) + "1";
                    break Label_6670;
                }
            }
            str5 = String.valueOf(str5) + "0";
        }
        Label_6784: {
            if (gb23 + gb33 + gb43 != 0) {
                if (gb23 + gb33 + gb43 != 2) {
                    str5 = String.valueOf(str5) + "1";
                    break Label_6784;
                }
            }
            str5 = String.valueOf(str5) + "0";
        }
        Label_6898: {
            if (gb24 + gb34 + gb44 != 0) {
                if (gb24 + gb34 + gb44 != 2) {
                    str5 = String.valueOf(str5) + "1";
                    break Label_6898;
                }
            }
            str5 = String.valueOf(str5) + "0";
        }
        Label_6960: {
            if (ga11 + ga21 != 0) {
                if (ga11 + ga21 != 2) {
                    str6 = "1";
                    break Label_6960;
                }
            }
            str6 = "0";
        }
        Label_7058: {
            if (ga12 + ga22 != 0) {
                if (ga12 + ga22 != 2) {
                    str6 = String.valueOf(str6) + "1";
                    break Label_7058;
                }
            }
            str6 = String.valueOf(str6) + "0";
        }
        Label_7156: {
            if (ga13 + ga23 != 0) {
                if (ga13 + ga23 != 2) {
                    str6 = String.valueOf(str6) + "1";
                    break Label_7156;
                }
            }
            str6 = String.valueOf(str6) + "0";
        }
        Label_7254: {
            if (ga14 + ga24 != 0) {
                if (ga14 + ga24 != 2) {
                    str6 = String.valueOf(str6) + "1";
                    break Label_7254;
                }
            }
            str6 = String.valueOf(str6) + "0";
        }
        Label_7352: {
            if (gb11 + gb21 != 0) {
                if (gb11 + gb21 != 2) {
                    str6 = String.valueOf(str6) + "1";
                    break Label_7352;
                }
            }
            str6 = String.valueOf(str6) + "0";
        }
        Label_7450: {
            if (gb12 + gb22 != 0) {
                if (gb12 + gb22 != 2) {
                    str6 = String.valueOf(str6) + "1";
                    break Label_7450;
                }
            }
            str6 = String.valueOf(str6) + "0";
        }
        Label_7548: {
            if (gb13 + gb23 != 0) {
                if (gb13 + gb23 != 2) {
                    str6 = String.valueOf(str6) + "1";
                    break Label_7548;
                }
            }
            str6 = String.valueOf(str6) + "0";
        }
        Label_7646: {
            if (gb14 + gb24 != 0) {
                if (gb14 + gb24 != 2) {
                    str6 = String.valueOf(str6) + "1";
                    break Label_7646;
                }
            }
            str6 = String.valueOf(str6) + "0";
        }
        Label_7708: {
            if (ga11 + ga31 != 0) {
                if (ga11 + ga31 != 2) {
                    str7 = "1";
                    break Label_7708;
                }
            }
            str7 = "0";
        }
        Label_7806: {
            if (ga12 + ga32 != 0) {
                if (ga12 + ga32 != 2) {
                    str7 = String.valueOf(str7) + "1";
                    break Label_7806;
                }
            }
            str7 = String.valueOf(str7) + "0";
        }
        Label_7904: {
            if (ga13 + ga33 != 0) {
                if (ga13 + ga33 != 2) {
                    str7 = String.valueOf(str7) + "1";
                    break Label_7904;
                }
            }
            str7 = String.valueOf(str7) + "0";
        }
        Label_8002: {
            if (ga14 + ga34 != 0) {
                if (ga14 + ga34 != 2) {
                    str7 = String.valueOf(str7) + "1";
                    break Label_8002;
                }
            }
            str7 = String.valueOf(str7) + "0";
        }
        Label_8100: {
            if (gb11 + gb31 != 0) {
                if (gb11 + gb31 != 2) {
                    str7 = String.valueOf(str7) + "1";
                    break Label_8100;
                }
            }
            str7 = String.valueOf(str7) + "0";
        }
        Label_8198: {
            if (gb12 + gb32 != 0) {
                if (gb12 + gb32 != 2) {
                    str7 = String.valueOf(str7) + "1";
                    break Label_8198;
                }
            }
            str7 = String.valueOf(str7) + "0";
        }
        Label_8296: {
            if (gb13 + gb33 != 0) {
                if (gb13 + gb33 != 2) {
                    str7 = String.valueOf(str7) + "1";
                    break Label_8296;
                }
            }
            str7 = String.valueOf(str7) + "0";
        }
        Label_8394: {
            if (gb14 + gb34 != 0) {
                if (gb14 + gb34 != 2) {
                    str7 = String.valueOf(str7) + "1";
                    break Label_8394;
                }
            }
            str7 = String.valueOf(str7) + "0";
        }
        Label_8456: {
            if (ga21 + ga31 != 0) {
                if (ga21 + ga31 != 2) {
                    str8 = "1";
                    break Label_8456;
                }
            }
            str8 = "0";
        }
        Label_8554: {
            if (ga22 + ga32 != 0) {
                if (ga22 + ga32 != 2) {
                    str8 = String.valueOf(str8) + "1";
                    break Label_8554;
                }
            }
            str8 = String.valueOf(str8) + "0";
        }
        Label_8652: {
            if (ga23 + ga33 != 0) {
                if (ga23 + ga33 != 2) {
                    str8 = String.valueOf(str8) + "1";
                    break Label_8652;
                }
            }
            str8 = String.valueOf(str8) + "0";
        }
        Label_8750: {
            if (ga24 + ga34 != 0) {
                if (ga24 + ga34 != 2) {
                    str8 = String.valueOf(str8) + "1";
                    break Label_8750;
                }
            }
            str8 = String.valueOf(str8) + "0";
        }
        Label_8848: {
            if (gb21 + gb31 != 0) {
                if (gb21 + gb31 != 2) {
                    str8 = String.valueOf(str8) + "1";
                    break Label_8848;
                }
            }
            str8 = String.valueOf(str8) + "0";
        }
        Label_8946: {
            if (gb22 + gb32 != 0) {
                if (gb22 + gb32 != 2) {
                    str8 = String.valueOf(str8) + "1";
                    break Label_8946;
                }
            }
            str8 = String.valueOf(str8) + "0";
        }
        Label_9044: {
            if (gb23 + gb33 != 0) {
                if (gb23 + gb33 != 2) {
                    str8 = String.valueOf(str8) + "1";
                    break Label_9044;
                }
            }
            str8 = String.valueOf(str8) + "0";
        }
        Label_9142: {
            if (gb24 + gb34 != 0) {
                if (gb24 + gb34 != 2) {
                    str8 = String.valueOf(str8) + "1";
                    break Label_9142;
                }
            }
            str8 = String.valueOf(str8) + "0";
        }
        Label_9204: {
            if (ga11 + ga41 != 0) {
                if (ga11 + ga41 != 2) {
                    str9 = "1";
                    break Label_9204;
                }
            }
            str9 = "0";
        }
        Label_9302: {
            if (ga12 + ga42 != 0) {
                if (ga12 + ga42 != 2) {
                    str9 = String.valueOf(str9) + "1";
                    break Label_9302;
                }
            }
            str9 = String.valueOf(str9) + "0";
        }
        Label_9400: {
            if (ga13 + ga43 != 0) {
                if (ga13 + ga43 != 2) {
                    str9 = String.valueOf(str9) + "1";
                    break Label_9400;
                }
            }
            str9 = String.valueOf(str9) + "0";
        }
        Label_9498: {
            if (ga14 + ga44 != 0) {
                if (ga14 + ga44 != 2) {
                    str9 = String.valueOf(str9) + "1";
                    break Label_9498;
                }
            }
            str9 = String.valueOf(str9) + "0";
        }
        Label_9596: {
            if (gb11 + gb41 != 0) {
                if (gb11 + gb41 != 2) {
                    str9 = String.valueOf(str9) + "1";
                    break Label_9596;
                }
            }
            str9 = String.valueOf(str9) + "0";
        }
        Label_9694: {
            if (gb12 + gb42 != 0) {
                if (gb12 + gb42 != 2) {
                    str9 = String.valueOf(str9) + "1";
                    break Label_9694;
                }
            }
            str9 = String.valueOf(str9) + "0";
        }
        Label_9792: {
            if (gb13 + gb43 != 0) {
                if (gb13 + gb43 != 2) {
                    str9 = String.valueOf(str9) + "1";
                    break Label_9792;
                }
            }
            str9 = String.valueOf(str9) + "0";
        }
        Label_9890: {
            if (gb14 + gb44 != 0) {
                if (gb14 + gb44 != 2) {
                    str9 = String.valueOf(str9) + "1";
                    break Label_9890;
                }
            }
            str9 = String.valueOf(str9) + "0";
        }
        Label_9952: {
            if (ga21 + ga41 != 0) {
                if (ga21 + ga41 != 2) {
                    str10 = "1";
                    break Label_9952;
                }
            }
            str10 = "0";
        }
        Label_10050: {
            if (ga22 + ga42 != 0) {
                if (ga22 + ga42 != 2) {
                    str10 = String.valueOf(str10) + "1";
                    break Label_10050;
                }
            }
            str10 = String.valueOf(str10) + "0";
        }
        Label_10148: {
            if (ga23 + ga43 != 0) {
                if (ga23 + ga43 != 2) {
                    str10 = String.valueOf(str10) + "1";
                    break Label_10148;
                }
            }
            str10 = String.valueOf(str10) + "0";
        }
        Label_10246: {
            if (ga24 + ga44 != 0) {
                if (ga24 + ga44 != 2) {
                    str10 = String.valueOf(str10) + "1";
                    break Label_10246;
                }
            }
            str10 = String.valueOf(str10) + "0";
        }
        Label_10344: {
            if (gb21 + gb41 != 0) {
                if (gb21 + gb41 != 2) {
                    str10 = String.valueOf(str10) + "1";
                    break Label_10344;
                }
            }
            str10 = String.valueOf(str10) + "0";
        }
        Label_10442: {
            if (gb22 + gb42 != 0) {
                if (gb22 + gb42 != 2) {
                    str10 = String.valueOf(str10) + "1";
                    break Label_10442;
                }
            }
            str10 = String.valueOf(str10) + "0";
        }
        Label_10540: {
            if (gb23 + gb43 != 0) {
                if (gb23 + gb43 != 2) {
                    str10 = String.valueOf(str10) + "1";
                    break Label_10540;
                }
            }
            str10 = String.valueOf(str10) + "0";
        }
        Label_10638: {
            if (gb24 + gb44 != 0) {
                if (gb24 + gb44 != 2) {
                    str10 = String.valueOf(str10) + "1";
                    break Label_10638;
                }
            }
            str10 = String.valueOf(str10) + "0";
        }
        Label_10700: {
            if (ga31 + ga41 != 0) {
                if (ga31 + ga41 != 2) {
                    str11 = "1";
                    break Label_10700;
                }
            }
            str11 = "0";
        }
        Label_10798: {
            if (ga32 + ga42 != 0) {
                if (ga32 + ga42 != 2) {
                    str11 = String.valueOf(str11) + "1";
                    break Label_10798;
                }
            }
            str11 = String.valueOf(str11) + "0";
        }
        Label_10896: {
            if (ga33 + ga43 != 0) {
                if (ga33 + ga43 != 2) {
                    str11 = String.valueOf(str11) + "1";
                    break Label_10896;
                }
            }
            str11 = String.valueOf(str11) + "0";
        }
        Label_10994: {
            if (ga34 + ga44 != 0) {
                if (ga34 + ga44 != 2) {
                    str11 = String.valueOf(str11) + "1";
                    break Label_10994;
                }
            }
            str11 = String.valueOf(str11) + "0";
        }
        Label_11092: {
            if (gb31 + gb41 != 0) {
                if (gb31 + gb41 != 2) {
                    str11 = String.valueOf(str11) + "1";
                    break Label_11092;
                }
            }
            str11 = String.valueOf(str11) + "0";
        }
        Label_11190: {
            if (gb32 + gb42 != 0) {
                if (gb32 + gb42 != 2) {
                    str11 = String.valueOf(str11) + "1";
                    break Label_11190;
                }
            }
            str11 = String.valueOf(str11) + "0";
        }
        Label_11288: {
            if (gb33 + gb43 != 0) {
                if (gb33 + gb43 != 2) {
                    str11 = String.valueOf(str11) + "1";
                    break Label_11288;
                }
            }
            str11 = String.valueOf(str11) + "0";
        }
        Label_11386: {
            if (gb34 + gb44 != 0) {
                if (gb34 + gb44 != 2) {
                    str11 = String.valueOf(str11) + "1";
                    break Label_11386;
                }
            }
            str11 = String.valueOf(str11) + "0";
        }
        if (ga11 != 0) {
            str12 = "1";
        }
        else {
            str12 = "0";
        }
        if (ga12 != 0) {
            str12 = String.valueOf(str12) + "1";
        }
        else {
            str12 = String.valueOf(str12) + "0";
        }
        if (ga13 != 0) {
            str12 = String.valueOf(str12) + "1";
        }
        else {
            str12 = String.valueOf(str12) + "0";
        }
        if (ga14 != 0) {
            str12 = String.valueOf(str12) + "1";
        }
        else {
            str12 = String.valueOf(str12) + "0";
        }
        if (gb11 != 0) {
            str12 = String.valueOf(str12) + "1";
        }
        else {
            str12 = String.valueOf(str12) + "0";
        }
        if (gb12 != 0) {
            str12 = String.valueOf(str12) + "1";
        }
        else {
            str12 = String.valueOf(str12) + "0";
        }
        if (gb13 != 0) {
            str12 = String.valueOf(str12) + "1";
        }
        else {
            str12 = String.valueOf(str12) + "0";
        }
        if (gb14 != 0) {
            str12 = String.valueOf(str12) + "1";
        }
        else {
            str12 = String.valueOf(str12) + "0";
        }
        if (ga21 != 0) {
            str13 = "1";
        }
        else {
            str13 = "0";
        }
        if (ga22 != 0) {
            str13 = String.valueOf(str13) + "1";
        }
        else {
            str13 = String.valueOf(str13) + "0";
        }
        if (ga23 != 0) {
            str13 = String.valueOf(str13) + "1";
        }
        else {
            str13 = String.valueOf(str13) + "0";
        }
        if (ga24 != 0) {
            str13 = String.valueOf(str13) + "1";
        }
        else {
            str13 = String.valueOf(str13) + "0";
        }
        if (gb21 != 0) {
            str13 = String.valueOf(str13) + "1";
        }
        else {
            str13 = String.valueOf(str13) + "0";
        }
        if (gb22 != 0) {
            str13 = String.valueOf(str13) + "1";
        }
        else {
            str13 = String.valueOf(str13) + "0";
        }
        if (gb23 != 0) {
            str13 = String.valueOf(str13) + "1";
        }
        else {
            str13 = String.valueOf(str13) + "0";
        }
        if (gb24 != 0) {
            str13 = String.valueOf(str13) + "1";
        }
        else {
            str13 = String.valueOf(str13) + "0";
        }
        if (ga31 != 0) {
            str14 = "1";
        }
        else {
            str14 = "0";
        }
        if (ga32 != 0) {
            str14 = String.valueOf(str14) + "1";
        }
        else {
            str14 = String.valueOf(str14) + "0";
        }
        if (ga33 != 0) {
            str14 = String.valueOf(str14) + "1";
        }
        else {
            str14 = String.valueOf(str14) + "0";
        }
        if (ga34 != 0) {
            str14 = String.valueOf(str14) + "1";
        }
        else {
            str14 = String.valueOf(str14) + "0";
        }
        if (gb31 != 0) {
            str14 = String.valueOf(str14) + "1";
        }
        else {
            str14 = String.valueOf(str14) + "0";
        }
        if (gb32 != 0) {
            str14 = String.valueOf(str14) + "1";
        }
        else {
            str14 = String.valueOf(str14) + "0";
        }
        if (gb33 != 0) {
            str14 = String.valueOf(str14) + "1";
        }
        else {
            str14 = String.valueOf(str14) + "0";
        }
        if (gb34 != 0) {
            str14 = String.valueOf(str14) + "1";
        }
        else {
            str14 = String.valueOf(str14) + "0";
        }
        if (ga41 != 0) {
            str15 = "1";
        }
        else {
            str15 = "0";
        }
        if (ga42 != 0) {
            str15 = String.valueOf(str15) + "1";
        }
        else {
            str15 = String.valueOf(str15) + "0";
        }
        if (ga43 != 0) {
            str15 = String.valueOf(str15) + "1";
        }
        else {
            str15 = String.valueOf(str15) + "0";
        }
        if (ga44 != 0) {
            str15 = String.valueOf(str15) + "1";
        }
        else {
            str15 = String.valueOf(str15) + "0";
        }
        if (gb41 != 0) {
            str15 = String.valueOf(str15) + "1";
        }
        else {
            str15 = String.valueOf(str15) + "0";
        }
        if (gb42 != 0) {
            str15 = String.valueOf(str15) + "1";
        }
        else {
            str15 = String.valueOf(str15) + "0";
        }
        if (gb43 != 0) {
            str15 = String.valueOf(str15) + "1";
        }
        else {
            str15 = String.valueOf(str15) + "0";
        }
        if (gb44 != 0) {
            str15 = String.valueOf(str15) + "1";
        }
        else {
            str15 = String.valueOf(str15) + "0";
        }
        str16 = "00000000";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);
        System.out.println(str7);
        System.out.println(str8);
        System.out.println(str9);
        System.out.println(str10);
        System.out.println(str11);
        System.out.println(str12);
        System.out.println(str13);
        System.out.println(str14);
        System.out.println(str15);
        System.out.println(str16);
    }
}
