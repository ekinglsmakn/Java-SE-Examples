package StringExamples;

public class ToCharArrayMethod {
    public static void main(String[] args) {
        String str = "Harry Potter";
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            System.out.println(i+1 +". elemnet is : " +charArray[i]);
        }


    }
}
