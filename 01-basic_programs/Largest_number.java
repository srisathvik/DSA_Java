import java.util.Scanner;

public class Largest_number {
    public static void main(String[] args) {
        System.out.println("Enter any two integer numbers: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if (num1 > num2){
            System.out.println(num1 + " is greater than " + num2);
        }
        else if(num2 > num1){
            System.out.println(num2 + " is greater than " + num1);
        }
        else{
            System.out.println("Both numbers are equal");
        }
    }
}
