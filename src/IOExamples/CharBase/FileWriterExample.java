package IOExamples.CharBase;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("E:\\JavaConsole\\IOFiles\\FileWriterExample.txt");
            fw.write("Gandalf AKIN");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fw.close(); //FileWriter'da close yapmazsak dosyaya hiçbir şey yazmaz
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
