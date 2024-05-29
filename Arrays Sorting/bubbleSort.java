import java.util.Scanner;

public class bubbleSort {
    public static void main(String args[]) {
        // int arr[] = new int[5];
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter Elements in the Arrays:");
        // for (int i = 0; i < 5; i++) {
        //     arr[i] = input.nextInt();
        // }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                     arr[j+1] = arr[j];
                        arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

