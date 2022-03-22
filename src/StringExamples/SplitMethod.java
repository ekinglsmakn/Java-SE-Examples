package StringExamples;

public class SplitMethod {
    /*
    * SPLIT : Array türünde dönüş verir.
              Special karakterlere göre bölmek istersek regular expression kullanmamız gerekir.
              Birden fazla karaktere göre bölmek istersek [] parantezleri arasına, virgülsüz ve
              boşluksuz yazmamız gerekir
              Regular expression = \\ (2 tane ters slash)
    *
    *
    * */
    public static void main(String[] args) {

        String str = "I,want*to+learn-java";
        String[] strSplit = str.split("[,\\*\\+\\-]");
        for (int i = 0; i < strSplit.length; i++) {
            System.out.println(strSplit[i]);
        }
    }
}
