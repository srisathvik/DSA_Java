import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int first = 1;
        int second = 1;
        System.out.print(first + " " + second);
        for(int i = 0; i < count -2; i++){
            int temp = first +second;
            first = second;
            second = temp;
            System.out.print(" " + second);
        }
    }
}
