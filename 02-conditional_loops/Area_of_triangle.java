import java.util.Scanner;

public class Area_of_triangle {
    public static void main(String[] args) {
        System.out.println("Enter the height and width of triangle");
        Scanner input = new Scanner(System.in);
        float height = input.nextFloat();
        float width = input.nextFloat();
        while (height <= 0 || width <= 0) {
            System.out.println("enter the values greater than zero");
            height = input.nextFloat();
            width = input.nextFloat();
        }
        System.out.println("Area is " + 0.5 * height * width);
    }
}
