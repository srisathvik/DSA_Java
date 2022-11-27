import java.util.Scanner;

public class Produt_minus_sum {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int product = 1;
        int sum = 0;
        while(num > 0){
            product = product * (num % 10);
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("Product is " + product + ". Sum is " + sum);
        System.out.println("The value of product - sum is " + (product-sum));
    }
}
