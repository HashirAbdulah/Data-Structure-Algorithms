import java.util.*;

public class SortingCombo {
    public static void selectionSort(int arr[]){
        int minIndex;
        for (int i = 0; i < arr.length-1; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    //QuickSort
    public static void quicksort(int arr[],int first, int last){
        int i = first; //counter  of left
        int j = last;  // counter of right
        int pivot = arr[(first+last)/2];// considering pivot as middle
        while(i <= j){
            while(arr[i] < pivot){
                i++;
            }
            while(arr[j] > pivot){
                j--;
            }
            if(i <= j){
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
//
    //MergeSort
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
        else{
       int mid = (left+right)/2;
        divide(arr,left,mid);
        divide(arr,mid+1,right);
        conquer(arr,left,mid,right);
        }
    }
//
    //InsertionSort
    public static void insertionSort(int arr[]){
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
    }


    //bubbleSort
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                     arr[j+1] = arr[j];
                        arr[j] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i< arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String args[]) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        Scanner input = new Scanner(System.in);
        // int arr[] = new int[5];
        // System.out.println("Enter Elements in the Arrays:");
        // for (int i = 0; i < 5; i++) {
        //     arr[i] = input.nextInt();
        // }
        System.out.println("\nChoose a sorting algorithm:");
        System.out.println("1. Selection Sort");
        System.out.println("2. Quick Sort");
        System.out.println("3. Merge Sort");
        System.out.println("4. Insertion Sort");
        System.out.println("5. Bubble Sort");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                selectionSort(arr);
                System.out.println("Sorted array using Selection Sort:");
                printArray(arr);
                break;
            case 2:
                quicksort(arr, 0, arr.length - 1);
                System.out.println("Sorted array using Quick Sort:");
                printArray(arr);
                break;
            case 3:
                divide(arr, 0, arr.length - 1);
                System.out.println("Sorted array using Merge Sort:");
                printArray(arr);
                break;
            case 4:
                insertionSort(arr);
                System.out.println("Sorted array using Insertion Sort:");
                printArray(arr);
                break;
            case 5:
                bubbleSort(arr);
                System.out.println("Sorted array using Bubble Sort:");
                printArray(arr);
                break;
            default:
                System.out.println("Invalid choice.");
        }
 }
}