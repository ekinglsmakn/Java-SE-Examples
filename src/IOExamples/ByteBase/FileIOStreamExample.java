package IOExamples.ByteBase;

import java.io.File;
import java.io.IOException;

public class FileIOStreamExample {
    public static void main(String[] args) throws IOException {
        String seperator =System.getProperty("file.seperator");
        File file = new File("ekinakin.txt");
        System.out.println("create Status: " +file.createNewFile()); //dosya oluştur mu? (ikinci çalıştırmada false verir)
        System.out.println("Path: " +file.getPath()); //dosya adı ve uzantısı
        System.out.println("Can read : " +file.canRead()); //okunma izni var mı?
        System.out.println("Can write : " +file.canWrite());
        System.out.println("Full Path: " +file.getAbsolutePath()); //dosyanın tam yolu
        System.out.println("Seperator: " +seperator);


    }
}
