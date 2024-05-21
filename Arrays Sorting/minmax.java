import java.util.*;
public class minmax {
    public static void main(String args[]){
        int arr[]= new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Elements in the Arrays:");
        for(int i = 0; i<=4; i++){
            arr[i] = input.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for(int i = 0; i<=4; i++){
            if (arr[i]< min) {
                min = arr[i];
            }
            else{
                max= arr[i];
            }
        }
        System.out.println("Maxmium array:"+ max);
        System.out.println("Maxmium array:"+ min);

    }
}
