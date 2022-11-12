import java.util.Scanner;

public class Celcius_to_Fahrenheit {
    public static void main(String[] args) {
        System.out.print("Enter temperature in celcius: ");
        Scanner input = new Scanner(System.in);
        float celcius = input.nextFloat();
        float fahrenheit = (celcius * 9/5) + 32;
        System.out.println(fahrenheit);
    }
}
