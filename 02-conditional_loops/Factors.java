import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 1; i <= num; i++){
            if (num % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
