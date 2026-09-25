import java.util.Scanner;

public class PolarityOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a double-precision floating-point number: ");
        double number = sc.nextDouble();
        
        // Check the polarity using control structures
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is neutral (0).");
        }
        
        sc.close();
    }
}