import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        if (value % 2 == 0){
            System.out.println("Given number is even");
        }
        else{
            System.out.println("Given number is odd");
        }
    }
}
