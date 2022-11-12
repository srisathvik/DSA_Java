import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner input = new Scanner(System.in);
        String pal = input.next();
        String rev = "";
        for(int i = pal.length()-1; i >= 0; i--){
            rev = rev + pal.charAt(i);
        }
        if (pal.equals(rev)){
            System.out.println(pal + " is a palindrome");
        }
        else{
            System.out.println(pal + " is not a palindrome");
        }

    }
}
