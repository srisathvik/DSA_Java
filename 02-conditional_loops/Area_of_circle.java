import java.util.Scanner;

public class Area_of_circle {
    public static void main(String[] args) {
        System.out.println("Enter the diameter of the circle");
        Scanner input = new Scanner(System.in);
        float di = input.nextFloat();
        while (di <= 0){
            System.out.println("Enter the diameter value greater than zero");
            di = input.nextFloat();
        }
        System.out.println("The area of the circle is "+(3.14 * (di/2)*(di/2)));
    }
}
