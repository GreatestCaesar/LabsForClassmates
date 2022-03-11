package Read;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Read {
    public String[] read(Object o, String dir) throws IOException {
        File file = new File(dir);
        String strobj = o.toString(); // toString объекта
        String Strobj; // обрезанный toString
        String[] StrObj; // еще один обрезанный
        String date = ""; // строка для записи данных из файла
        String[] Date;
        String[] t;
        String str = "";
        FileInputStream fis = new FileInputStream(file);
        byte buf[] = new byte[fis.available()];
        fis.read(buf);
        fis.close();

        String text = new String(buf);
        str = text.substring(text.lastIndexOf('{')+1,text.lastIndexOf('}'));
        Strobj = strobj.substring(strobj.lastIndexOf('{')+1,strobj.lastIndexOf('}'));
        t = str.split(",");
        StrObj = Strobj.split(",");
        for(int i=0;i<StrObj.length;i++){
            t[i] = t[i].trim();
            StrObj[i] = StrObj[i].trim();
            if(t[i].substring(0,t[i].lastIndexOf('=')).equals(StrObj[i].substring(0,StrObj[i].lastIndexOf('=')))){
                date += t[i].substring(t[i].lastIndexOf('=')+1,t[i].length()) + " ";
            }
        }
        Date = date.split(" ");
        for(String s:Date){
            s = s.trim();
        }
        return Date;
    }
}
