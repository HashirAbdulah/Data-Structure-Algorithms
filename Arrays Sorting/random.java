import java.util.*;

public class random {
    public static void main(String args[]) {
        int size = 100; // Array size
        int[] arr = generateRandomArray(size);
        selectionSort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }

    // Function to generate an array of random values
    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100); // Generate random values between 0 and 99
        }
        return arr;
    }

    // Function to perform bubble sort
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                     arr[j+1] = arr[j];
                        arr[j] = temp;
                }
            }
        }
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if ((i + 1) % 10 == 0) { // Print newline after every 10 elements
                System.out.println();
            }
        }
    }
}


