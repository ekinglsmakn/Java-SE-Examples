package IOExamples.ByteBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {
    /*
     *
     * FileInputStream: İnput demek dosyadan okumak demektir. Yani programa bir dosyadan input girişi demektir.
     *                  Byte tabanlıdır
     *
     * */
    public static void main(String[] args) {

        FileInputStream fis;

        try {
            fis = new FileInputStream("E:\\JavaConsole\\IOFiles\\file2.txt"); //okumak için açtık
            int readValue = fis.read();
            System.out.println("1. deger: " +readValue); //byte tabanlı olduğu için dosyadaki ilk karakterin ascii değerini okur.
            System.out.println("1. degerin karakter karsiligi: " +(char)readValue); //char'a çevirirsek değerini buluruz 101=e

            int readValue2 = fis.read();
            System.out.println("2. deger: " +readValue2); //100 yazar cünkü ilk karakterden yukarda okundu. o yüzden ikinci karakterden devam eder.

            fis.skip(-1); //imleci geriye atar.Pozitif değer yazarsam ileri atar
            int readValue3 = fis.read(); //tekrar 101 vermesini bekleriz
            System.out.println("3. deger: "+readValue3);

            int value;
            while( ( value = fis.read() ) != -1) //dosyanın sonuna gelinmediyse while çalışır
            {
                System.out.print((char)value); //karakter karakter okuyabildiğimiz için char'a dönüştürdük
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
