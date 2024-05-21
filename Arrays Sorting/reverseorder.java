import java.util.*;
public class reverseorder {
    public static void main(String args[]){
        int arr[]= new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Elements in the Arrays:");
        for(int i = 0; i<=4; i++){
            arr[i] = input.nextInt();
        }
        for(int i = 4; i >= 0; i--){
            System.out.println("Elements in the Arrays:" + arr[i]);
        }
        
    }
}
