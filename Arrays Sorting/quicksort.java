import java.util.Scanner;

public class quicksort {
    public static void quicksort(int arr[],int first, int last){
        int i = first; //counter  of right
        int j = last;  // counter of left
        int pivot = arr[(first+last)/2];// considering pivot as middle
        while(i<=j){
            while(arr[i]<pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<=j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        //recursion for left to right
        if (first < j) {
            quicksort(arr, first, j);
        } 
        //recursion for right to left
        else if (last > i) {
            quicksort(arr, i, last);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int size = input.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Elements in the Arrays:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        quicksort(arr, 0, size-1);
        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}