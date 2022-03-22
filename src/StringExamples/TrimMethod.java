package StringExamples;

public class TrimMethod {
    /*
    * Trim: stringin başındaki ve sonundaki boşlukları kaldırmaya yarar. Ara boşluklara dokunmaz
    * */
    public static void main(String[] args) {
        String str = "     Hello Wo ld i'm learning java!     ";
        str = str.trim();
        System.out.println(str);

    }
}
