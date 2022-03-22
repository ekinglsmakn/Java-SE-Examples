package StringExamples;

public class ToUpperCaseMethod {
    /*
    * toUpperCase: Harfleri büyük harfe çevirir. geriye tekrar String döndürür.
    *
    * */
    public static void main(String[] args) {
        String str = "hello world, i'm learning java!";
        str = str.toUpperCase();
        System.out.println(str);
    }
}
