package StringExamples;

public class EqualsMethod {
    /**
     * EQUALS: String eşitliğini kontrol eder. Stringlerde == kullanılmaz.. Geriye boolean değer döndürür.
     *
     */

    public static void main(String[] args) {

        String str = "Lord Of The Rings";
        String str2 ="Lord Of The Rings";
        String str3 ="Harry Potter";

        if (str.equals(str2)) {                 //true
            System.out.println("str equals str2");
        }else
            System.out.println("str is not equal to str2");


        if (str.equals(str3) ) {               //false
            System.out.println("str equals str3");
        }
        else
            System.out.println("str is not equal to str3");

        boolean bool = false;
        bool = str.equals(str2);
        System.out.println("equals: " +bool);
    }
}
