import java.util.*;

public class BinarySearch {
    public static void main(String args[]) {
        int arr[] = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Elements in the Arrays:");
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter Element to find:");
        int key = input.nextInt();
        int first = 0;
        int last = arr.length - 1;
        while (first <= last) {
            int mid = (first + last) / 2;
            if (arr[mid] == key) {
                System.out.println("Element found at Index: " + mid);
                break;
            } else if (arr[mid] < key) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        if (first > last) {
            System.out.println("Element not found.");
        }
    }
}
