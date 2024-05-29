import java.util.*;

public class insertionSort {
    public static void main(String args[]) {
        // int arr[] = new int[5];
        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter Elements in the Arrays:");
        // for (int i = 0; i < 5; i++) {
        //     arr[i] = input.nextInt();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else {
                    break; // Stop inner loop if the element is already in the correct position
                }
            }
        }
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


