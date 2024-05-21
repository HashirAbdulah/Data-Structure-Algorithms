import java.util.*;
public class maxSelectionSort {
    public static void main(String args[]) {
        int arr[] = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Elements in the Arrays:");
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }

        int maxIndex;
        for (int i = 0; i < 4; i++) {
            maxIndex = i;
            for (int j = i + 1; j < 5; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
