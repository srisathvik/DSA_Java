import java.util.Scanner;

public class Largest_number {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int largest = input.nextInt();
        int temp = largest;
        while (temp != 0){
            System.out.println("Enter the number");
            temp = input.nextInt();
            if (temp > largest && temp != 0){
                largest = temp;
            }
        }
        System.out.println("Largest value is " + largest);
    }
}
