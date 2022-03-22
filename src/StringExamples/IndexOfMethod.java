package StringExamples;

public class IndexOfMethod {
    /**
     * INDEXOF: String karakterinin indexini verir.
     *          int değer döndürür. Ancak karakteri bulamazsa -1 döndürür.
     *          method içine parametre olarak çift tırnak içinde bir karakter yada kelime  alır.
     */
    public static void main(String[] args) {
        String str ="hello Universe";
        int indexValue = str.indexOf("U"); //6
        System.out.println(indexValue);

        int indexValue2 = str.indexOf("Universe"); //başlangıç harfinin indexini verir
        System.out.println(indexValue2);
    }
}
