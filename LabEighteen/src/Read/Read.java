package Read;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Read {
    private String dir;
    private File file;

    public Read(String dir) throws IOException {
        this.dir = dir;
        file = new File(dir);
        read();
    }

    public void read() throws IOException {
        FileInputStream fis = new FileInputStream(this.file);
        byte buf[] = new byte[fis.available()];
        fis.read(buf);
        String text = new String(buf);
        System.out.println("\nДанные из файла: \n" + text);
        fis.close();
    }
}
