package ExceptionExamples;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class NumberFormatExceptions {
    public static void main(String[] args) {

       try {
           method();
       }catch (NumberFormatException e){

           e.printStackTrace();
           System.out.println("NUMBER FORMAT EXCEPTION !!");

       }

        System.out.println("FINISH!!!");
    }

    private static void method()
     throws NumberFormatException //başka yazılımcıları bu metotdaki exception için uyarırız.
    {
        String s = "abc";
        int st = Integer.parseInt(s);


    }
}
