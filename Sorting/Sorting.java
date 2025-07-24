import java.util.*;

public class Sorting {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);
        return;
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
        return;
    }

    public static void insertionSort(int arr[]) {
        for(int i = 1; i < arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while (prev >= 0 && curr < arr[prev]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        printArray(arr);
        return;
    }

    public static int findLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
   
    public static void countingSort(int arr[]) {
        int count [] = new int[findLargest(arr)+1];

        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }
        int idx = 0;
        for(int i = 0; i < count.length; i++){
            while(count[i] > 0){
                arr[idx] = i;
                count[i]--;
                idx++;
            }
        }

        printArray(arr);
        return;
    }

    public static void main(String[] args) {
        int numbers[] = { 3, 4, 1, 5, 7, 2, 9, 6, 8 };
        bubbleSort(numbers);
        System.out.println("------------------------------");
        int numbers1[] = { 3, 4, 1, 5, 7, 2, 9, 6, 8 };
        selectionSort(numbers1);
        System.out.println("------------------------------");
        int numbers2[] = { 3, 4, 1, 5, 7, 2, 9, 6, 8 };
        insertionSort(numbers2);
        System.out.println("------------------------------");
        int numbers3[] = { 3, 4, 1, 5, 7, 2, 9, 6, 8 };
        countingSort(numbers3);
        System.out.println("------------------------------");
    }
}
