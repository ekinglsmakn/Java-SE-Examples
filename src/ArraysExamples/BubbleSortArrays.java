package ArraysExamples;

public class BubbleSortArrays {
    public static void main(String[] args) {
        int[] numberArray = {8, 6, 3, 15, 1};
        int[] numberArray2 = {10, 6, 18, 11, 12};


        show(sort(numberArray));
        show(sort(numberArray2));

    }

    private static void show(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +" ");
        }
        System.out.println();

    }

    private static int[] sort(int[] array) {

        int temp =0;
        for (int i = 0; i < array.length; i++) {

            for (int j = i+1; j < array.length; j++) {

                if (array [i] > array[j]) {  //Eğer eleman bir sonraki elemandan büyükse yer değiştirilir
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }


            }
        }


        return array;
    }
}
