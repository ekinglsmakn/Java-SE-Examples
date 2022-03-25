package StringExamples;

public class ConcatMethod {
    /*
    *Concat: Stringleri birleştirir.
    *        İçine çift tırnak içinde string de alabilir, String olarak tanımlanmış değişken de alabilir.
    *        Geriye String döndürür
    *
    * */
    public static void main(String[] args) {
        String name = "Ekin Gulsum";
        String nameSurname = name.concat(" " + "AKIN");
        System.out.println(nameSurname);

        String book = "Harry Potter";
        String writer = "J.K Rowling";
        System.out.println(book.concat(" " +writer));

    }
}
