package IOExamples.ByteBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos =null;
        FileInputStream fis = null;
        try {
            //dosya oluşturma ve dosyaya yazma

            fos = new FileOutputStream("E:\\JavaConsole\\IOFiles\\InputOutputExample.doc");
            String name ="Ekin Gulsum Akin 20.05.1994";
            fos.write(name.getBytes()); //dosyaya yazarken byte'a ceviriyoruz

            //dosyadan input alıp consola basma

            fis = new FileInputStream("E:\\JavaConsole\\IOFiles\\InputOutputExample.doc");
            int readValue;

            while ((readValue = fis.read()) != -1){

                System.out.print((char)readValue);

            }

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e){

            e.printStackTrace();

        } finally {
            fos.close();
            fis.close();
        }
    }
}
