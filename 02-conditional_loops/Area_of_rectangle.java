import java.util.Scanner;

public class Area_of_rectangle {
    public static void main(String[] args) {
        System.out.println("Enter the length and width of rectangle");
        Scanner input = new Scanner(System.in);
        float length = input.nextFloat();
        float width = input.nextFloat();
        while (length <= 0 || width <= 0) {
            System.out.println("enter the values greater than zero");
            length = input.nextFloat();
            width = input.nextFloat();
        }
        System.out.println("Area is " + length * width);
    }
}
