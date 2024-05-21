import java.util.*;  

public class selectionSort{
    public static void main(String args[]) {
        int arr[] = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Elements in the Arrays:");
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }

        int minIndex;
        for (int i = 0; i < 4; i++) {
            minIndex = i;
            for (int j = i + 1; j < 5; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
