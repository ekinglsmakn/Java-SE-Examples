package ArraysExamples;

public class FindMinElement {
    public static void main(String[] args) {
        int[] numberArray = {8, 6, 3, 15, 1};
        int[] numberArray2 = {10, 6, 0, 11, 12};

        System.out.println("1. Array Min Element Is : " + findMin(numberArray));
        System.out.println("2. Array Min Element Is : " +findMin(numberArray2));
    }

    private static int findMin(int[] numberArray)
         throws IndexOutOfBoundsException {

            int minElement = numberArray[0];

            for (int i = 0; i < numberArray.length; i++) {
                if (minElement > numberArray[i]) {
                    minElement = numberArray[i];
                }

            }
            return minElement;
        }
}
