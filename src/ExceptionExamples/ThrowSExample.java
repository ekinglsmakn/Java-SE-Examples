package ExceptionExamples;

public class ThrowSExample {
    public static void main(String[] args) {

        try {
            method1();

        } catch (ArithmeticException e) {

            e.printStackTrace();
            System.out.println("Catch Block");
        }
        System.out.println("Finish");
        method2();
    }

    private static void method2() {
        String value = null;
        value.toString();
        //Value içi Null olduğu için Null Pointer Exception oluşur
    }

    private static void method1()
            throws ArithmeticException { //Arithmetic Exception oluşur

        throw new ArithmeticException();

    }
}
