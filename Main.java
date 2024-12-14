import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {9,6,3,2,7,8,4,1,5};
        int target = (int) (Math.random() * 11);
        int left = 0;
        int right =  array.length-1;
        boolean ketemu = false;

        // bubbleSort(array);
        // System.out.println(Arrays.toString(array));

        // selectionSort(array);
        // System.out.println(Arrays.toString(array));

        // insertionSort(array);
        // System.out.println(Arrays.toString(array));

        // linear(array, target, ketemu);
        // binary(array, target, left, right, ketemu);
    }

    // linear algorithm
    static void linear(int[] arr, int target, boolean ketemu) {
        for (int i=0; i < arr.length-1;i++) {
            if (arr[i] == target) {
                System.out.println("target ada pada index ke : " + i);
                ketemu = true;
            }
        }
        if (ketemu == false) {
            System.out.println(target + " tidak ditemukan");
        }
        System.out.println("target adalah : " + target);
    }

    // binary algorithm 
    static void binary(int[] arr, int target, int left, int right, boolean ketemu) {
        System.out.println("target : " + target);
        for (int i=0; left <= right; i++) {
            int mid = (left + right) / 2;
            System.out.println( "nilai tangah : " + arr[mid]);
            if (arr[mid] == target) {
                System.out.println(target + " ada pada index ke : " + mid);
                ketemu = true;
                break;
            } else if (target < arr[mid] ) {
                System.out.println(target + " < " + arr[mid]);
                right = mid -1;
            } else if (target > arr[mid]) {
                System.out.println(target + " > " + arr[mid]);
                left = mid + 1;
            }
        }
        if (ketemu == false) {
            System.out.println( target + " tidak ditemukan");
        }
    }

    // bubble sort algoritma method 
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

    // selection sort algotitma method 
    static void selectionSort(int[] arr) {
        for (int x = 0; x < arr.length  - 1; x++) {
            int min = x;
            for (int y = x+1 ; y < arr.length; y++) {
                if (arr[min] > arr[y]) {
                    min = y;
                }
            }
            int temp = arr[x];
            arr[x] = arr[min];
            arr[min] = temp;
        }
    }

    // insertion sort algoritma method 
    static void insertionSort(int[] arr) {
        for (int x = 1; x < arr.length; x++) {
            int temp = arr[x];
            int y = x-1;
            while (y >= 0 && arr[y] > temp) {
                arr[y+1] = arr[y];
                y--;
            }
            arr[y+1] = temp;
        }
    }
}