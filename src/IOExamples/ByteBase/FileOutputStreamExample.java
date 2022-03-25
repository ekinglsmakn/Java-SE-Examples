package IOExamples.ByteBase;

import java.io.IOException;

public class FileOutputStreamExample {
    /*
     * FileOutputStream: Byte tabanlı output işlemlerindendir. Output dosyaya yazma işlemlerinde kullanılır.
     *
     * Output demek; programdan dosyaya çıktı vermektir. Yani dosyaya yazmaktır. Programdan çıkış olduğı için "Output"tur.
     *
     * */
    public static void main(String[] args) throws IOException {

        java.io.FileOutputStream fos = null;

        try {
            //içine yazmak üzere bir dosya oluşturuyoruz
            fos = new java.io.FileOutputStream("E:\\JavaConsole\\IOFiles\\file.txt",true); //true deyince dosyaya üst üste yazar

            fos.write(65);
            fos.write(70);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fos.close();
        }
    }
}