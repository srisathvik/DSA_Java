import java.util.Scanner;

public class Simple_intrest {
    public static void main(String[] args) {
        System.out.println("Enter principle, Time(in months) and Rate of intrest");
        Scanner input = new Scanner(System.in);
        int principle = input.nextInt();
        float time = input.nextFloat();
        float rate = input.nextFloat();
        float si = (principle * time * rate) / 100;
        System.out.println("simple intrest is "+ si);
    }
}
