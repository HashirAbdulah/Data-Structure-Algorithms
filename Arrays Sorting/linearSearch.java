import java.util.*;
public class linearSearch {
    public static void main(String args[]) {
        int arr[] = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Elements in the Arrays:");
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter Element to find in the Arrays:");
        int item = input.nextInt(); 
        int flag = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
        System.out.println(item + " " +" found in the Array at index: "+ i);
        flag=0;
        break;
            }
        }
        if(flag==1)
        System.out.println(item + " "  +"Element not found");
    }
}