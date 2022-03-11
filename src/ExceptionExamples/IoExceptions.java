package ExceptionExamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IoExceptions {
    public static void main(String[] args) {

        try {
            findFile();
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("FILE NOT FOUND EXCEPTION!!");
        }
    }

    private static void findFile()
            throws IOException {
        File file = new File("test.txt");
        FileInputStream stream = new FileInputStream(file);
    }
}
