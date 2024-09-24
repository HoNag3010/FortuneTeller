package FortuneTeller;
import java.util.Random;
import java.util.Scanner;

public class FortuneTeller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declare scanner

        System.out.println("***********************************");
        System.out.println("         FORTUNE TELLER            ");
        System.out.println("***********************************"); 
        // Make a display banner

        
        System.out.print("Enter your full name: ");
        String username = sc.nextLine();
        // Scan for username

        System.out.print("How old are you? ");
        int age = sc.nextInt();
        // Scan for their age

        sc.nextLine();
        // This line is used to skip the integer line so no scanning error would occur

        System.out.print("What is your favorite color? ");
        String favColor = sc.nextLine();
        // Scan for user's favorite color

        Random random = new Random();
        // Declare random

        int luckyNum = random.nextInt(10) + 1;
        // Generate random number

        double percent = (double)age/(double)luckyNum;
        // Convert and calculate percent

        System.out.println("");
        System.out.println("Welcome, " + username + ".");
        System.out.println("I see you are " + age + " years old" + ".");
        System.out.println("Your favorite color is " + favColor + ".");
        System.out.println("Your lucky number is " + luckyNum + ".");
        System.out.printf("Your lucky number is %.3f of your age.", percent);
        System.out.println("");
        System.out.println("");
        System.out.println("Thank you for using this program!");
        // Print all the result and display the thank you message

        sc.close();
        // Close the scanner
    }
}