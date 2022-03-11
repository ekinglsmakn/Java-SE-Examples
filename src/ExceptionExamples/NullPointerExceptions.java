package ExceptionExamples;

import jdk.swing.interop.SwingInterOpUtils;

public class NullPointerExceptions {
    public static void main(String[] args) {

        try {
            method();
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("NULL POINTER EXCEPTION");
        }
        System.out.println("FINISH!!!");

    }

    private static void method()
      throws NullPointerException {
        String stringVal = null;
        stringVal.charAt(0);
    }
}
