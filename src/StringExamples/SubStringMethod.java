package StringExamples;

public class SubStringMethod {
    /* SUBSTRING: Bu metot String döndürür.
                  Substring(x,y) için; x. karakterden y. karaktere kadar al demektir.
                  (x dahil, y değildir.)
                  Substring(x) için : başlangıç x değerinden son karaktere kadar alır.

                  */
    public static void main(String[] args) {
        String str = "hello World";
        String newStr = str.substring(6,str.length()); //World
        System.out.println(newStr);
        String newStr2 = str.substring(0,10); //hello Worl
        System.out.println(newStr2);

        String newStr3 = str.substring(3); //lo World
        System.out.println(newStr3);
    }
}
