import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int num1 = 0;
        int num2 = 1;
        System.out.print(num1 + " " + num2 + " ");
        for (int i  = 2 ; i < n; i++){
            int temp = num2;
            num2 = num1 + num2;
            num1 = temp;
            System.out.print(num2 + " ");
        }
    }
}
