import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {9,6,3,2,7,8,4,1,5};

        bubbleSort(array);
        System.out.println(Arrays.toString(array));

    }

    static void bubbleSort(int[] arr ){
        for (int x = 0; x < arr.length  - 1; x++){
            for (int y = 0; y < arr.length - 1; y++) {
                if (arr[y]  > arr[y+1]) {
                    int temp = arr[y];
                    arr[y] = arr[y+1];
                    arr[y+1] = temp;
                }
            }
        }
    }

    static void selectionSort(int[] arr) {

    }

    static void insertionSort() {

    }
}