import java.util.Scanner;

public class factorial {
    public static int fatorial(int num){
        if(num == 1){
            return 1;
        }
        else {
                return num *fatorial(num-1);
            }
        }

        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The number for Factorial:");
        int num = input.nextInt();
        System.out.println("Factorial of " + num + " is: " + fatorial(num));
        }
    }

