package IOExamples.Serializable;

import java.io.*;

public class WriteObjectStudent {
    public static void main(String[] args) throws FileNotFoundException {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\JavaConsole\\IOFiles\\studentObject.txt"))) {

            Student student = new Student("Ekin","Akin","BilMüh","Comp101");
            Student student2 = new Student("Gandalf","Akin","BilMüh","comp102");
            oos.writeObject(student);
            oos.writeObject(student2);

        }

         catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\JavaConsole\\IOFiles\\studentObject.txt")))
        {
            Student st = (Student) ois.readObject();
            Student st2 = (Student) ois.readObject();

            System.out.println(st.toString());
            System.out.println(st2.toString());

            //dosyayı kapatmamıza gerek yok
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}