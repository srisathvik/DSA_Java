import java.util.Scanner;

public class Sum_of_numbers {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        float sum = 0;
        while (num != 0){
            sum = sum + num;
            System.out.println("Enter the number");
            num = input.nextFloat();
        }
        System.out.println("The sum is " + sum);
    }
}
