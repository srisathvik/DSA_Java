import java.util.Scanner;

public class Rupees_USD {
    public static void main(String[] args) {
        System.out.println("Enter currency in rupees");
        Scanner input = new Scanner(System.in);
        float num1 = input.nextFloat();
        double sol = num1 * 0.012;
        System.out.println(num1 + " rupees are equal to " + sol+ " USD");
    }
}
