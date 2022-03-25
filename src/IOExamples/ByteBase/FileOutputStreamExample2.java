package IOExamples.ByteBase;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamExample2 {
    /*
     * getBytes: Dosyaya String yazmak istersek FileStreamOutput kullanırken  byte'a çevirmek zorundayız.
     *           "getBytes" içine "StandardCharsets.UTF_8" yazarsak ingilizce OLMAYAN karakterleri de yazar.
     *
     * */
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null; //fos'a dosya atayacağız demek için FileOutputStream türünde bir nesne oluşturduk

        try {
            fos = new FileOutputStream("E:\\JavaConsole\\IOFiles\\file2.txt");
            byte[] array = {101, 100, 90, 95};//sayıların ascii karşılığı dosyaya yazılacak
            fos.write(array);
            /* ********************************************************************************************************* */
            String str = "ekin gülsüm akin"; //türkçe karakterler kullanıldı!
            fos.write(str.getBytes(StandardCharsets.UTF_8)); //türkçe karakterlerle birlikte byte'a çevirip dosyaya yazar.
            //Write() metodu byte tabanlı çalıştığı için dosyaya yazarken byte'a çevirmemiz gerekir. Yada int olarak ascii değer yazabiliriz

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fos.close();
            System.out.println("dosya kapandi");
        }
        System.out.println("finish!!");
    }
}
