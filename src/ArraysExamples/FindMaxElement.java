package ArraysExamples;

public class FindMaxElement {
    public static void main(String[] args) {
        int[] numberArray = {8, 6, 3, 15, 1};
        int[] numberArray2 = {10, 6, 18, 11, 12};

        System.out.println("1. Array Max Element Is : " + findMax(numberArray));
        System.out.println("2. Array Max Element Is : " +findMax(numberArray2));
    }

    private static int findMax(int[] numberArray)
            throws IndexOutOfBoundsException {
        int maxElement = numberArray[0];

        for (int i = 0; i < numberArray.length; i++) {
            if (maxElement < numberArray[i]) {
                maxElement = numberArray[i];
            }

        }
        return maxElement;
    }
}
