import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.print("Enter any two numbers and an operator: ");
        Scanner input = new Scanner(System.in);
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        char op = input.next().charAt(0);
        float result = 0;
        if (op == '+'){
            result = num1 + num2;
        }
        else if (op == '-') {
            result = num1 - num2;
        }
        else if (op == '*') {
            result = num1 * num2;
        }
        else{
            result = num1 / num2;
        }
        System.out.println("solution is " + result);
    }
}
