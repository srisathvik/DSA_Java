import java.util.Scanner;

public class Electricity_bill {
    public static void main(String[] args) {
        System.out.println("Enter the number of units");
        Scanner input = new Scanner(System.in);
        int units = input.nextInt();
        float charge = 0;
        if (units == 0){
            // minimum charge is 150
            System.out.println("The electricity bill is 150");
        }
        else{
            if (units > 0 && units < 101){
                System.out.println("The electricity bill is " + (units * 1.95 + 50));
            } else if (units > 50 && units < 101) {
                System.out.println("The electricity bill is " + (units * 3.10 + 80));
            } else if (units > 100 && units < 101) {

            }
        }
    }
}
