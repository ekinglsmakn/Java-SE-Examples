package StringExamples;

public class EqualsIgnoreCaseMethod {
    /**
     * EQUALSIGNORECASE: tüm stringleri önce küçük harfe çevirir sonra karşılaştırma yapar.Boolean döndürür
     *
     */

    public static void main(String[] args) {
        String str = "Lord Of The Rings";
        String str2 ="LORD OF THE RINGS";

        if (str.equalsIgnoreCase(str2)) {     //true: hepsini küçük harfe çevirdi.
            System.out.println("str = str2");
        } else
            System.out.println("False");


        boolean aBoolean = false;
        aBoolean = str.equalsIgnoreCase(str2);
        System.out.println(aBoolean); //true verir


    }

}
