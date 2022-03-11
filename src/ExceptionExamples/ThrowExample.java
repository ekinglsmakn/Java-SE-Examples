package ExceptionExamples;

public class ThrowExample {
    public static void main(String[] args) {

        try {
            System.out.println("Try Block");
            metot1();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Catch Block");
        }
        System.out.println("FINISH PROGRAM");
    }

    private static void metot1() {
        metot2();
        System.out.println("This is Metot1");
    }

    private static void metot2() {
        metot3();
        System.out.println("This is Metot2");
    }

    private static void metot3() {
        metot4();
        System.out.println("This is Metot3");
    }

    private static void metot4() {
        System.out.println("This is Metot4");
        throw new NullPointerException(); //throw return gibi davranıp çağrıldığı yere döner
    }


}
