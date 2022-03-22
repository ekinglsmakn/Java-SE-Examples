package StringExamples;

public class StringArray {
    public static void main(String[] args) {
        //type one
        String[] stringArray = new String[3];
        stringArray[0] = "one";
        stringArray[1] = "two";
        stringArray[2] = "three";

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }


        //type two
        String[] stringArray2 = new String[]{"red", "pink", "blue", "black"};

        for (int i = 0; i < stringArray2.length; i++) {
            System.out.println(stringArray2[i]);
        }


        //type three
        String[] stringArray3 = {"apple", "banana", "orange", "lemon"};
        for (int i = 0; i < stringArray3.length; i++) {
            System.out.println(stringArray3[i]);
        }
    }
}
