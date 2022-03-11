package Write;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Write {
    private String obj;
    private String direct;
    private String name;
    boolean dir;
    File file;
    Object object;

    public Write(String obj, String direct, Object object) throws IOException {
        this.obj = obj;
        this.direct = direct;
        this.name = this.obj + ".txt";;
        this.object = object;
        this.dir = new File(this.direct).mkdir();
        this.file = new File(direct,name);
        write();
    }

    private void write() throws IOException {
        FileOutputStream fos = new FileOutputStream(file);
        String text = "Объект: " + obj + "\nКласс: " + object.getClass() + "\n" + this.object.toString();
        byte buf[] = text.getBytes();
        fos.write(buf);
        if(file.exists()){
            System.out.println("Файл создан!");
        }
        fos.close();
    }
}
