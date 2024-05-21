import java.util.*;

public class mergesort {
    public static void conquer(int arr[], int left, int mid, int right){
        int B[] = new int [right -left + 1];
        int j = left;
        int k = mid+1;
        int x = 0;//B index trkr

        while (j <= mid && k <= right) {
            if (arr[j] < arr[k]) {

                B[x++] = arr[j++];
        
            }
             else {
                B[x++] = arr[k++];
            }
      }
        
        while (j <= mid) {
            B[x++] = arr[j++];
        }

        while (k <= right) {
            B[x++] = arr[k++];
        }
        
        for (int i = 0; i < B.length; i++) {
            arr[left + i] = B[i];
        }
    }
    public static void divide(int arr[], int left, int right){
        if(left >= right){
            return;
        }
       int mid = (left+right)/2;
        divide(arr,left,mid);
        divide(arr,mid+1,right);
        conquer(arr,left,mid,right);
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size of the Array:");
        int size = input.nextInt();
        int arr[] = new int[size];
            System.out.println("Enter Elements in the Arrays:");
            for (int i = 0; i < size; i++) {
                arr[i] = input.nextInt();
            }
            divide(arr, 0, arr.length-1);
            System.out.println("Sorted Array:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
    }
}
