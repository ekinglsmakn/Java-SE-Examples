package ExceptionExamples;

public class IndexOutOfBoundsExceptions {
    public static void main(String[] args) {

        //method(); // try catch olmadan çağırılırsa program kesilir, devam etmez



        try {

            method(); // Bu metotda hata alınırsa catch içinde tut demektir.
            System.out.println("Try Block"); //buraya girmiyor çünkü catch exception yakaladı. Hata olmasaydı buraya gelecekti

        } catch (java.lang.IndexOutOfBoundsException e) { //sadece exception da yazılabilirdi

            e.printStackTrace(); //exception'ı ekrana basar
            System.out.println("Array Index Out Of Bounds Exception !!!");
            //hata yoksa catch bloğu atlanır.

        }

        System.out.println("Try-Catch is Finish!!");

    }

    private static void method() {
        int[] array = new int[]{1, 2, 3};
        System.out.println(array[10]); //ArrayIndexOutOfBoundsException atar.
    }
}
